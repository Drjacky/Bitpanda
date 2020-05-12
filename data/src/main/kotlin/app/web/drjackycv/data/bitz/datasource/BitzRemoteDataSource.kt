package app.web.drjackycv.data.bitz.datasource

import app.web.drjackycv.data.bitz.remote.BitzApi
import app.web.drjackycv.domain.base.RecyclerItem
import io.reactivex.Single
import javax.inject.Inject

class BitzRemoteDataSource @Inject constructor(
    private val bitzApi: BitzApi
) {

    fun getBitz(): Single<RecyclerItem> =
        bitzApi.getBitz().map { it.toDomain() }

}