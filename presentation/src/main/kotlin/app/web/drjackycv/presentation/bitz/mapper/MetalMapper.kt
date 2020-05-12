package app.web.drjackycv.presentation.bitz.mapper

import app.web.drjackycv.domain.bitz.entity.Metal
import app.web.drjackycv.presentation.base.mapper.MapperUI
import app.web.drjackycv.presentation.bitz.entity.MetalUI

class MetalMapper : MapperUI<Metal, MetalUI> {

    override fun mapToUI(obj: Metal): MetalUI = with(obj) {
        MetalUI(
            name = name,
            symbol = symbol,
            id = id,
            price = price,
            logo = logo,
            precision = precision
        )
    }

}