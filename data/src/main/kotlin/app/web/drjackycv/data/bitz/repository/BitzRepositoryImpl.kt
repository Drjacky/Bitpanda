package app.web.drjackycv.data.bitz.repository

import app.web.drjackycv.data.bitz.datasource.BitzRemoteDataSource
import app.web.drjackycv.domain.base.RecyclerItem
import app.web.drjackycv.domain.bitz.repository.BitzRepository
import io.reactivex.Single
import javax.inject.Inject

class BitzRepositoryImpl @Inject constructor(
    private val bitzRemoteDataSource: BitzRemoteDataSource
) : BitzRepository {

    override fun getBitz(): Single<RecyclerItem> =
        bitzRemoteDataSource.getBitz()

}