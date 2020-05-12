package app.web.drjackycv.domain.bitz.entity

import app.web.drjackycv.domain.base.RecyclerItem

data class Bitz(
    override val id: String,
    val metalWallet: List<MetalWallet>,
    val cryptoWallet: List<CryptoWallet>,
    val fiatWallet: List<FiatWallet>,
    val cryptocoin: List<Cryptocoin>,
    val fiat: List<Fiat>,
    val metal: List<Metal>
) : RecyclerItem