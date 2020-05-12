package app.web.drjackycv.data.bitz.entity


import app.web.drjackycv.data.base.ResponseObject
import app.web.drjackycv.domain.bitz.entity.Bitz
import com.google.gson.annotations.SerializedName

data class BitzResponse(
    @SerializedName("MetalWallet") val metalWallet: List<MetalWalletResponse>,
    @SerializedName("CryptoWallet") val cryptoWallet: List<CryptoWalletResponse>,
    @SerializedName("FiatWallet") val fiatWallet: List<FiatWalletResponse>,
    @SerializedName("Cryptocoin") val cryptocoin: List<CryptocoinResponse>,
    @SerializedName("Fiat") val fiat: List<FiatResponse>,
    @SerializedName("Metal") val metal: List<MetalResponse>
) : ResponseObject<Bitz> {

    override fun toDomain(): Bitz =
        Bitz(
            id = "",
            metalWallet = metalWallet.map { it.toDomain() },
            cryptoWallet = cryptoWallet.map { it.toDomain() },
            fiatWallet = fiatWallet.map { it.toDomain() },
            cryptocoin = cryptocoin.map { it.toDomain() },
            fiat = fiat.map { it.toDomain() },
            metal = metal.map { it.toDomain() }
        )

}