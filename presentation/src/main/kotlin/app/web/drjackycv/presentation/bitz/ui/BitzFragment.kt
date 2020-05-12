package app.web.drjackycv.presentation.bitz.ui

import android.os.Bundle
import android.view.View
import android.widget.Toast
import app.web.drjackycv.domain.base.Failure
import app.web.drjackycv.domain.base.RecyclerItem
import app.web.drjackycv.presentation.R
import app.web.drjackycv.presentation.base.fragment.BaseFragment
import app.web.drjackycv.presentation.bitz.entity.CryptocoinUI
import app.web.drjackycv.presentation.bitz.entity.MetalUI
import app.web.drjackycv.presentation.extension.*
import kotlinx.android.synthetic.main.fragment_bitz.*
import kotlinx.android.synthetic.main.item_error.*
import kotlinx.android.synthetic.main.item_loading.*

class BitzFragment : BaseFragment() {

    override var fragmentLayout: Int = R.layout.fragment_bitz

    private lateinit var bitzViewModel: BitzViewModel

    private val bitzAdapter: BitzAdapter by lazy {
        BitzAdapter(::showDetails)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecycler()
        setupViewModel()
    }

    private fun setupRecycler() {
        itemErrorContainer.gone()
        bitzRecyclerView.adapter = bitzAdapter
    }

    private fun setupViewModel() {
        bitzViewModel = viewModel(viewModelFactory.get()) {

            getBitz()

            observe(ldBitz, ::addBitz)

            observe(ldLoading, ::loadingUI)

            observe(ldFailure, ::handleFailure)

        }
    }

    private fun addBitz(bitz: List<RecyclerItem>) {
        itemErrorContainer.gone()
        bitzRecyclerView.visible()
        bitzAdapter.submitList(bitz)
    }

    private fun loadingUI(isLoading: Boolean) {
        if (isLoading) {
            itemErrorContainer.gone()
            progressBar.visible()
        } else {
            progressBar.gone()
        }
    }

    private fun handleFailure(failure: Failure) {
        when (failure) {
            is Failure.FailureWithMessage -> {
                bitzRecyclerView.gone()
                itemErrorContainer.visible()
                itemErrorMessage.text = failure.msg
                itemErrorRetryBtn.setOnClickListener { failure.retryAction() }
            }
        }
    }

    private fun showDetails(item: RecyclerItem) {
        when (item) {
            is MetalUI -> {
                Toast.makeText(
                    context,
                    item.price.roundToXDecimal(item.precision),
                    Toast.LENGTH_LONG
                ).show()
            }
            is CryptocoinUI -> {
                Toast.makeText(
                    context,
                    item.price.roundToXDecimal(item.precision),
                    Toast.LENGTH_LONG
                ).show()
            }
        }
    }

}