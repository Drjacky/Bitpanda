package app.web.drjackycv.presentation.bitz.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import app.web.drjackycv.domain.base.RecyclerItem
import app.web.drjackycv.domain.bitz.entity.Bitz
import app.web.drjackycv.domain.bitz.usecase.GetBitzUseCase
import app.web.drjackycv.presentation.base.viewmodel.BaseViewModel
import app.web.drjackycv.presentation.bitz.entity.BitzUI
import app.web.drjackycv.presentation.bitz.entity.CryptoWalletUI
import app.web.drjackycv.presentation.bitz.entity.FiatWalletUI
import app.web.drjackycv.presentation.bitz.entity.MetalWalletUI
import app.web.drjackycv.presentation.bitz.mapper.BitzMapper
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.rxkotlin.addTo
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class BitzViewModel @Inject constructor(
    private val getBitzUseCase: GetBitzUseCase
) : BaseViewModel() {

    private val _ldBitz = MutableLiveData<List<RecyclerItem>>()
    val ldBitz: LiveData<List<RecyclerItem>> = _ldBitz

    fun getBitz() {
        val finalList = mutableListOf<RecyclerItem>()
        getBitzUseCase(Unit)
            .map { bitz ->
                BitzMapper().mapToUI(bitz as Bitz)
            }
            .map { bitz ->
                bitz.metalWallet.forEach { metalWalletUI ->
                    finalList.add(metalWalletUI)
                    finalList.addAll(metalWalletUI.returnCurrencyListOfThisWallet(bitz))
                }
                bitz.cryptoWallet.forEach { cryptoWalletUI ->
                    finalList.add(cryptoWalletUI)
                    finalList.addAll(cryptoWalletUI.returnCurrencyListOfThisWallet(bitz))
                }
                bitz.fiatWallet.forEach { fiatWalletUI ->
                    finalList.add(fiatWalletUI)
                    finalList.addAll(fiatWalletUI.returnCurrencyListOfThisWallet(bitz))
                }

                finalList.toList()
            }
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { loading(true) }
            .doAfterTerminate { loading(false) }
            .subscribe({ resultList ->
                _ldBitz.value = resultList
            }, { throwable ->
                handleFailure(throwable) { getBitz() }
            }).addTo(compositeDisposable)
    }

    private inline fun <reified T : RecyclerItem> T.returnCurrencyListOfThisWallet(bitz: BitzUI): List<RecyclerItem> {
        val result = mutableListOf<RecyclerItem>()
        when (this) {
            is MetalWalletUI -> {
                bitz.metal.firstOrNull { it.id == this.metalId }?.run {
                    result.add(this as RecyclerItem)
                }
            }
            is CryptoWalletUI -> {
                bitz.cryptocoin.firstOrNull { it.id == this.cryptocoinId }?.run {
                    result.add(this as RecyclerItem)
                }
            }
            is FiatWalletUI -> {
                bitz.fiat.firstOrNull { it.id == this.fiatId }?.run {
                    result.add(this as RecyclerItem)
                }
            }
        }

        return result
    }

}