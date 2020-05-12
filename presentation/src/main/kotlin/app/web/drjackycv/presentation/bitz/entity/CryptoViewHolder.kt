package app.web.drjackycv.presentation.bitz.entity

import android.view.View
import androidx.core.view.ViewCompat
import androidx.recyclerview.widget.RecyclerView
import app.web.drjackycv.presentation.extension.load
import kotlinx.android.synthetic.main.item_crypto.view.*

class CryptoViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    fun bind(cryptoWallet: CryptocoinUI) = with(itemView) {
        ViewCompat.setTransitionName(itemAssetLogoImv, cryptoWallet.id)
        itemAssetLogoImv.load(cryptoWallet.logo)
        itemAssetSymbolTxv.text = cryptoWallet.symbol
        itemAssetBalanceTxv.text = cryptoWallet.price.toString()
    }

}