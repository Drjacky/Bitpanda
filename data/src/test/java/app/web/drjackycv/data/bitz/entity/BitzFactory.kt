package app.web.drjackycv.data.bitz.entity

import app.web.drjackycv.domain.bitz.entity.*

class BitzFactory {

    companion object {

        fun providesBitz(
            id: String = "1",
            metalWallet: List<MetalWallet> = dummyMetalWalletList,
            cryptoWallet: List<CryptoWallet> = dummyCryptoWalletList,
            fiatWallet: List<FiatWallet> = dummyEURWallet,
            cryptocoin: List<Cryptocoin> = cryptocoins,
            fiat: List<Fiat> = fiats,
            metal: List<Metal> = metals
        ) = Bitz(
            id = id,
            metalWallet = metalWallet,
            cryptoWallet = cryptoWallet,
            fiatWallet = fiatWallet,
            cryptocoin = cryptocoin,
            fiat = fiat,
            metal = metal
        )

        private val dummyMetalWalletList = listOf(
            MetalWallet(
                id = "1",
                name = "Test Metal Wallet",
                balance = 133.7,
                isDefault = false,
                metalId = "4",
                deleted = false
            ),
            MetalWallet(
                id = "2",
                name = "Test Palladium Wallet",
                balance = 200.0,
                isDefault = false,
                metalId = "5",
                deleted = false
            )
        )

        private val dummyCryptoWalletList = listOf(
            CryptoWallet(
                id = "1",
                name = "Test BTC Wallet",
                balance = 133.7,
                isDefault = false,
                cryptocoinId = "1",
                deleted = false
            ),
            CryptoWallet(
                id = "2",
                name = "Test BTC Wallet 2",
                balance = 0.0,
                isDefault = false,
                cryptocoinId = "1",
                deleted = true
            ),
            CryptoWallet(
                id = "3",
                name = "Test BEST Wallet",
                balance = 1032.23,
                isDefault = false,
                cryptocoinId = "2",
                deleted = false
            ),
            CryptoWallet(
                id = "4",
                name = "Test Ripple Wallet",
                balance = 2304.04,
                isDefault = false,
                cryptocoinId = "3",
                deleted = false
            )
        )

        private val dummyEURWallet = listOf(
            FiatWallet(
                id = "1",
                name = "EUR Wallet",
                fiatId = "1",
                balance = 400.0,
                isDefault = false,
                deleted = false
            ),
            FiatWallet(
                id = "2",
                name = "CHF Wallet",
                fiatId = "2",
                balance = 0.0,
                isDefault = false,
                deleted = false
            )
        )

        private val cryptocoins: List<Cryptocoin> = listOf(
            Cryptocoin(
                name = "Bitcoin",
                symbol = "BTC",
                id = "1",
                price = 9000.0,
                logo = "https://bitpanda-assets.s3-eu-west-1.amazonaws.com/static/cryptocoin/btc.svg"
            ),
            Cryptocoin(
                name = "Bitpanda Ecosystem Token",
                symbol = "BEST",
                id = "2",
                price = 0.03,
                logo = "https://bitpanda-assets.s3-eu-west-1.amazonaws.com/static/cryptocoin/best.svg"
            ),
            Cryptocoin(
                name = "Ripple",
                symbol = "XRP",
                id = "3",
                price = 0.2119,
                logo = "https://bitpanda-assets.s3-eu-west-1.amazonaws.com/static/cryptocoin/xrp.svg"
            )
        )

        private val fiats: List<Fiat> = listOf(
            Fiat(
                name = "Euro",
                symbol = "EUR",
                id = "1",
                logo = "https://bitpanda-assets.s3-eu-west-1.amazonaws.com/static/fiat/usd.svg"
            ),
            Fiat(
                name = "Swiss Franc",
                symbol = "CHF",
                id = "2",
                logo = "https://bitpanda-assets.s3-eu-west-1.amazonaws.com/static/fiat/chf.svg"
            )
        )

        private val metals: List<Metal> = listOf(
            Metal(
                name = "Gold",
                symbol = "XAU",
                id = "4",
                price = 45.14,
                logo = "https://bitpanda-assets.s3-eu-west-1.amazonaws.com/static/fiat/xau.svg"
            ),
            Metal(
                name = "Palladium",
                symbol = "XPD",
                id = "5",
                price = 70.40,
                logo = "https://bitpanda-assets.s3-eu-west-1.amazonaws.com/static/cryptocoin/xpd.svg"
            )
        )

    }

}