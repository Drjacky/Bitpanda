package app.web.drjackycv.presentation.bitz.mapper

import app.web.drjackycv.domain.bitz.entity.MetalWallet
import app.web.drjackycv.presentation.base.mapper.MapperUI
import app.web.drjackycv.presentation.bitz.entity.MetalWalletUI

class MetalWalletMapper : MapperUI<MetalWallet, MetalWalletUI> {

    override fun mapToUI(obj: MetalWallet): MetalWalletUI = with(obj) {
        MetalWalletUI(
            id = id,
            name = name,
            balance = balance,
            isDefault = isDefault,
            metalId = metalId,
            deleted = deleted
        )
    }

}