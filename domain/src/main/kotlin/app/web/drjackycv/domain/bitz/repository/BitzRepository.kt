package app.web.drjackycv.domain.bitz.repository

import app.web.drjackycv.domain.base.RecyclerItem
import io.reactivex.Single

interface BitzRepository {

    fun getBitz(): Single<RecyclerItem>

}