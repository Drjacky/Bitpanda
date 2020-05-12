package app.web.drjackycv.presentation.bitz.entity

import app.web.drjackycv.domain.base.RecyclerItem

data class MetalWalletUI(
    override val id: String,
    val name: String,
    val balance: Double,
    val isDefault: Boolean,
    val metalId: String,
    val deleted: Boolean
) : RecyclerItem