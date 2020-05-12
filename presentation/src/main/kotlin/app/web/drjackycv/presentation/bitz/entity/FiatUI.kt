package app.web.drjackycv.presentation.bitz.entity

import app.web.drjackycv.domain.base.RecyclerItem

data class FiatUI(
    override val id: String,
    val name: String,
    val symbol: String,
    val logo: String,
    val precision: Int
) : RecyclerItem