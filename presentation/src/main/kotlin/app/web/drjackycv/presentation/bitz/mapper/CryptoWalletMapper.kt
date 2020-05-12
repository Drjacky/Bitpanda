package app.web.drjackycv.presentation.bitz.mapper

import app.web.drjackycv.domain.bitz.entity.CryptoWallet
import app.web.drjackycv.presentation.base.mapper.MapperUI
import app.web.drjackycv.presentation.bitz.entity.CryptoWalletUI

class CryptoWalletMapper : MapperUI<CryptoWallet, CryptoWalletUI> {

    override fun mapToUI(obj: CryptoWallet): CryptoWalletUI = with(obj) {
        CryptoWalletUI(
            id = id,
            name = name,
            balance = balance,
            isDefault = isDefault,
            cryptocoinId = cryptocoinId,
            deleted = deleted
        )
    }

}