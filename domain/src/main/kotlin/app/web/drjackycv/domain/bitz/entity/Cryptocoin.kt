package app.web.drjackycv.domain.bitz.entity

import app.web.drjackycv.domain.base.RecyclerItem

data class Cryptocoin(
    override val id: String,
    val name: String,
    val symbol: String,
    val price: Double,
    val logo: String,
    val precision: Int = 4
) : RecyclerItem