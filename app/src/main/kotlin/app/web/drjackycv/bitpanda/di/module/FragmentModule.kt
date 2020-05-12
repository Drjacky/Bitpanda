package app.web.drjackycv.bitpanda.di.module

import app.web.drjackycv.bitpanda.di.scope.PerView
import app.web.drjackycv.presentation.bitz.ui.BitzFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentModule {

    @PerView
    @ContributesAndroidInjector
    abstract fun bitz(): BitzFragment

}