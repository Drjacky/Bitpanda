package app.web.drjackycv.bitpanda.di.component

import app.web.drjackycv.bitpanda.application.BitpandaApplication
import app.web.drjackycv.bitpanda.di.module.*
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        AppModule::class,
        DataModule::class,
        ViewModelModule::class,
        ActivityModule::class,
        FragmentModule::class
    ]
)
interface AppComponent : AndroidInjector<BitpandaApplication> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(app: BitpandaApplication): Builder

        fun build(): AppComponent

    }

}