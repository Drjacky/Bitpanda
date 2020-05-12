package app.web.drjackycv.domain.bitz.entity

import app.web.drjackycv.domain.base.RecyclerItem

data class Fiat(
    override val id: String,
    val name: String,
    val symbol: String,
    val logo: String,
    val precision: Int = 2
) : RecyclerItem