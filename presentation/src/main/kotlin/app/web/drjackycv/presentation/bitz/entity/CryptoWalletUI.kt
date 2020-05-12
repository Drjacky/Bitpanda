package app.web.drjackycv.presentation.bitz.entity

import app.web.drjackycv.domain.base.RecyclerItem

data class CryptoWalletUI(
    override val id: String,
    val name: String,
    val balance: Double,
    val isDefault: Boolean,
    val cryptocoinId: String,
    val deleted: Boolean
) : RecyclerItem