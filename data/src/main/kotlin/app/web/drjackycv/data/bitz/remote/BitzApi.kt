package app.web.drjackycv.data.bitz.remote

import app.web.drjackycv.data.bitz.entity.BitzResponse
import io.reactivex.Single
import retrofit2.http.GET

interface BitzApi {

    @GET("bitz")
    fun getBitz(): Single<BitzResponse>

}