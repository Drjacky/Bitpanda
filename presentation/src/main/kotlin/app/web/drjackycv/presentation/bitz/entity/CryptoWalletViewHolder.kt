package app.web.drjackycv.presentation.bitz.entity

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_crypto_wallet.view.*

class CryptoWalletViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    fun bind(cryptoWallet: CryptoWalletUI) = with(itemView) {
        itemWalletNameTxv.text = cryptoWallet.name
        itemWalletBalanceTxv.text = cryptoWallet.balance.toString()
    }

}