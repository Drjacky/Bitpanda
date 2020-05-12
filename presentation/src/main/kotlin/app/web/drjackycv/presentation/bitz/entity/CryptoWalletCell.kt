package app.web.drjackycv.presentation.bitz.entity

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import app.web.drjackycv.domain.base.RecyclerItem
import app.web.drjackycv.presentation.R
import app.web.drjackycv.presentation.base.adapter.Cell

object CryptoWalletCell : Cell<RecyclerItem>() {

    override fun belongsTo(item: RecyclerItem?): Boolean {
        return item is CryptoWalletUI
    }

    override fun type(): Int {
        return R.layout.item_crypto_wallet
    }

    override fun holder(parent: ViewGroup): RecyclerView.ViewHolder {
        return CryptoWalletViewHolder(parent.viewOf(type()))
    }

    override fun bind(
        holder: RecyclerView.ViewHolder,
        item: RecyclerItem?,
        onItemClick: ((RecyclerItem) -> Unit)?
    ) {
        if (holder is CryptoWalletViewHolder && item is CryptoWalletUI) {
            holder.bind(item)
            holder.itemView.setOnClickListener {
                onItemClick?.run { this(item) }
            }
        }
    }

}