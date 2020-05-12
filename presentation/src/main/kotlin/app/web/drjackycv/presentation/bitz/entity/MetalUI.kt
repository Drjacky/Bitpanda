package app.web.drjackycv.presentation.bitz.entity

import app.web.drjackycv.domain.base.RecyclerItem

data class MetalUI(
    override val id: String,
    val name: String,
    val symbol: String,
    val price: Double,
    val logo: String,
    val precision: Int
) : RecyclerItem