package app.web.drjackycv.data.bitz.entity


import app.web.drjackycv.data.base.ResponseObject
import app.web.drjackycv.domain.bitz.entity.Fiat
import com.google.gson.annotations.SerializedName

data class FiatResponse(
    @SerializedName("name") val name: String,
    @SerializedName("symbol") val symbol: String,
    @SerializedName("id") val id: String,
    @SerializedName("logo") val logo: String
) : ResponseObject<Fiat> {

    override fun toDomain(): Fiat =
        Fiat(
            name = name,
            symbol = symbol,
            id = id,
            logo = logo
        )

}