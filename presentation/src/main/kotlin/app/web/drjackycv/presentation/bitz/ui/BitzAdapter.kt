package app.web.drjackycv.presentation.bitz.ui

import app.web.drjackycv.domain.base.RecyclerItem
import app.web.drjackycv.presentation.base.adapter.BaseListAdapter
import app.web.drjackycv.presentation.bitz.entity.*

class BitzAdapter(onItemClick: (RecyclerItem) -> Unit) : BaseListAdapter(
    CryptoCell, CryptoWalletCell, FiatCell, FiatWalletCell, MetalCell, MetalWalletCell,
    onItemClick = onItemClick
)