package app.web.drjackycv.data.bitz.entity


import app.web.drjackycv.data.base.ResponseObject
import app.web.drjackycv.domain.bitz.entity.CryptoWallet
import com.google.gson.annotations.SerializedName

data class CryptoWalletResponse(
    @SerializedName("id") val id: String,
    @SerializedName("name") val name: String,
    @SerializedName("balance") val balance: Double,
    @SerializedName("isDefault") val isDefault: Boolean,
    @SerializedName("cryptocoinId") val cryptocoinId: String,
    @SerializedName("deleted") val deleted: Boolean
) : ResponseObject<CryptoWallet> {

    override fun toDomain(): CryptoWallet =
        CryptoWallet(
            id = id,
            name = name,
            balance = balance,
            isDefault = isDefault,
            cryptocoinId = cryptocoinId,
            deleted = deleted
        )

}