package app.web.drjackycv.data.bitz.entity


import app.web.drjackycv.data.base.ResponseObject
import app.web.drjackycv.domain.bitz.entity.FiatWallet
import com.google.gson.annotations.SerializedName

data class FiatWalletResponse(
    @SerializedName("id") val id: String,
    @SerializedName("name") val name: String,
    @SerializedName("fiatId") val fiatId: String,
    @SerializedName("balance") val balance: Double,
    @SerializedName("isDefault") val isDefault: Boolean,
    @SerializedName("deleted") val deleted: Boolean
) : ResponseObject<FiatWallet> {

    override fun toDomain(): FiatWallet =
        FiatWallet(
            id = id,
            name = name,
            fiatId = fiatId,
            balance = balance,
            isDefault = isDefault,
            deleted = deleted
        )

}