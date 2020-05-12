package app.web.drjackycv.data.bitz.entity


import app.web.drjackycv.data.base.ResponseObject
import app.web.drjackycv.domain.bitz.entity.Cryptocoin
import com.google.gson.annotations.SerializedName

data class CryptocoinResponse(
    @SerializedName("name") val name: String,
    @SerializedName("symbol") val symbol: String,
    @SerializedName("id") val id: String,
    @SerializedName("price") val price: Double,
    @SerializedName("logo") val logo: String
) : ResponseObject<Cryptocoin> {

    override fun toDomain(): Cryptocoin =
        Cryptocoin(
            name = name,
            symbol = symbol,
            id = id,
            price = price,
            logo = logo
        )

}