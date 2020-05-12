package app.web.drjackycv.presentation.bitz.mapper

import app.web.drjackycv.domain.bitz.entity.Bitz
import app.web.drjackycv.presentation.base.mapper.MapperUI
import app.web.drjackycv.presentation.bitz.entity.BitzUI

class BitzMapper : MapperUI<Bitz, BitzUI> {

    override fun mapToUI(obj: Bitz): BitzUI = with(obj) {
        BitzUI(
            id = id,
            metalWallet = metalWallet.map { MetalWalletMapper().mapToUI(it) },
            cryptoWallet = cryptoWallet.map { CryptoWalletMapper().mapToUI(it) },
            fiatWallet = fiatWallet.map { FiatWalletMapper().mapToUI(it) },
            cryptocoin = cryptocoin.map { CryptocoinMapper().mapToUI(it) },
            fiat = fiat.map { FiatMapper().mapToUI(it) },
            metal = metal.map { MetalMapper().mapToUI(it) }
        )
    }

}