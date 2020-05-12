package app.web.drjackycv.presentation.bitz.mapper

import app.web.drjackycv.domain.bitz.entity.FiatWallet
import app.web.drjackycv.presentation.base.mapper.MapperUI
import app.web.drjackycv.presentation.bitz.entity.FiatWalletUI

class FiatWalletMapper : MapperUI<FiatWallet, FiatWalletUI> {

    override fun mapToUI(obj: FiatWallet): FiatWalletUI = with(obj) {
        FiatWalletUI(
            id = id,
            name = name,
            balance = balance,
            isDefault = isDefault,
            deleted = deleted,
            fiatId = fiatId
        )
    }

}