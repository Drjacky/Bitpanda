package app.web.drjackycv.presentation.bitz.entity

import app.web.drjackycv.domain.base.RecyclerItem

data class FiatWalletUI(
    override val id: String,
    val name: String,
    val fiatId: String,
    val balance: Double,
    val isDefault: Boolean,
    val deleted: Boolean
) : RecyclerItem