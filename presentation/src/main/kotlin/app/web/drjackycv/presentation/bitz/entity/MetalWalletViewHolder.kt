package app.web.drjackycv.presentation.bitz.entity

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_metal_wallet.view.*

class MetalWalletViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    fun bind(metalWallet: MetalWalletUI) = with(itemView) {
        itemWalletNameTxv.text = metalWallet.name
        itemWalletBalanceTxv.text = metalWallet.balance.toString()
    }

}