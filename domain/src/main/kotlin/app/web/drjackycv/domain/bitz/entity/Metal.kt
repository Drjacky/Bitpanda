package app.web.drjackycv.domain.bitz.entity

import app.web.drjackycv.domain.base.RecyclerItem

data class Metal(
    override val id: String,
    val name: String,
    val symbol: String,
    val price: Double,
    val logo: String,
    val precision: Int = 3
) : RecyclerItem