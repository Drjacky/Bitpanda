package app.web.drjackycv.presentation.bitz.entity

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_fiat_wallet.view.*

class FiatWalletViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    fun bind(fiatWallet: FiatWalletUI) = with(itemView) {
        itemWalletNameTxv.text = fiatWallet.name
        itemWalletBalanceTxv.text = fiatWallet.balance.toString()
    }

}