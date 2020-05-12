package app.web.drjackycv.domain.bitz.usecase

import app.web.drjackycv.domain.base.RecyclerItem
import app.web.drjackycv.domain.base.usecase.SingleUseCase
import app.web.drjackycv.domain.bitz.repository.BitzRepository
import io.reactivex.Single
import javax.inject.Inject

class GetBitzUseCase @Inject constructor(
    private val bitzRepository: BitzRepository
) : SingleUseCase<RecyclerItem, Unit> {

    override fun invoke(params: Unit): Single<RecyclerItem> =
        bitzRepository.getBitz()

}