package app.web.drjackycv.presentation.bitz.entity

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import app.web.drjackycv.domain.base.RecyclerItem
import app.web.drjackycv.presentation.R
import app.web.drjackycv.presentation.base.adapter.Cell

object CryptoCell : Cell<RecyclerItem>() {

    override fun belongsTo(item: RecyclerItem?): Boolean {
        return item is CryptocoinUI
    }

    override fun type(): Int {
        return R.layout.item_crypto
    }

    override fun holder(parent: ViewGroup): RecyclerView.ViewHolder {
        return CryptoViewHolder(parent.viewOf(type()))
    }

    override fun bind(
        holder: RecyclerView.ViewHolder,
        item: RecyclerItem?,
        onItemClick: ((RecyclerItem) -> Unit)?
    ) {
        if (holder is CryptoViewHolder && item is CryptocoinUI) {
            holder.bind(item)
            holder.itemView.setOnClickListener {
                onItemClick?.run { this(item) }
            }
        }
    }

}