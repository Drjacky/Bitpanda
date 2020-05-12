package app.web.drjackycv.presentation.bitz.entity

import android.view.View
import androidx.core.view.ViewCompat
import androidx.recyclerview.widget.RecyclerView
import app.web.drjackycv.presentation.extension.load
import kotlinx.android.synthetic.main.item_metal.view.*

class MetalViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    fun bind(metal: MetalUI) = with(itemView) {
        ViewCompat.setTransitionName(itemAssetLogoImv, metal.id)
        itemAssetLogoImv.load(metal.logo)
        itemAssetNameTxv.text = metal.name
        itemAssetBalanceTxv.text = metal.price.toString()
    }

}