package app.web.drjackycv.presentation.bitz.mapper

import app.web.drjackycv.domain.bitz.entity.Fiat
import app.web.drjackycv.presentation.base.mapper.MapperUI
import app.web.drjackycv.presentation.bitz.entity.FiatUI

class FiatMapper : MapperUI<Fiat, FiatUI> {

    override fun mapToUI(obj: Fiat): FiatUI = with(obj) {
        FiatUI(
            name = name,
            symbol = symbol,
            id = id,
            logo = logo,
            precision = precision
        )
    }

}