package app.web.drjackycv.presentation.bitz.mapper

import app.web.drjackycv.domain.bitz.entity.Cryptocoin
import app.web.drjackycv.presentation.base.mapper.MapperUI
import app.web.drjackycv.presentation.bitz.entity.CryptocoinUI

class CryptocoinMapper : MapperUI<Cryptocoin, CryptocoinUI> {

    override fun mapToUI(obj: Cryptocoin): CryptocoinUI = with(obj) {
        CryptocoinUI(
            name = name,
            symbol = symbol,
            id = id,
            price = price,
            logo = logo,
            precision = precision
        )
    }

}