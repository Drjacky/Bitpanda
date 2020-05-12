package app.web.drjackycv.data.bitz.entity


import app.web.drjackycv.data.base.ResponseObject
import app.web.drjackycv.domain.bitz.entity.Metal
import com.google.gson.annotations.SerializedName

data class MetalResponse(
    @SerializedName("name") val name: String,
    @SerializedName("symbol") val symbol: String,
    @SerializedName("id") val id: String,
    @SerializedName("price") val price: Double,
    @SerializedName("logo") val logo: String
) : ResponseObject<Metal> {

    override fun toDomain(): Metal =
        Metal(
            name = name,
            symbol = symbol,
            id = id,
            price = price,
            logo = logo
        )

}