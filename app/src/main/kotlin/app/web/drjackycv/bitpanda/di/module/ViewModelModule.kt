package app.web.drjackycv.bitpanda.di.module

import androidx.lifecycle.ViewModelProvider
import app.web.drjackycv.bitpanda.di.viewmodel.ViewModelFactory
import app.web.drjackycv.bitpanda.di.viewmodel.ViewModelKey
import app.web.drjackycv.presentation.base.viewmodel.BaseViewModel
import app.web.drjackycv.presentation.bitz.ui.BitzViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {

    @Binds
    abstract fun factory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(BitzViewModel::class)
    abstract fun bitz(vm: BitzViewModel): BaseViewModel

}