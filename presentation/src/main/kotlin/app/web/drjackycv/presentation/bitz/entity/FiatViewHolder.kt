package app.web.drjackycv.presentation.bitz.entity

import android.view.View
import androidx.core.view.ViewCompat
import androidx.recyclerview.widget.RecyclerView
import app.web.drjackycv.presentation.extension.load
import kotlinx.android.synthetic.main.item_fiat.view.*

class FiatViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    fun bind(fiat: FiatUI) = with(itemView) {
        ViewCompat.setTransitionName(itemAssetLogoImv, fiat.id)
        itemAssetLogoImv.load(fiat.logo)
        itemAssetSymbolTxv.text = fiat.symbol
        itemAssetNameTxv.text = fiat.name
    }

}