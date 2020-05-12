package app.web.drjackycv.bitpanda.di.module

import android.app.Application
import android.content.Context
import android.content.res.Resources
import app.web.drjackycv.bitpanda.application.BitpandaApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    @Singleton
    fun provideApplication(application: BitpandaApplication): Application = application

    @Provides
    @Singleton
    fun provideContext(application: Application): Context = application

    @Provides
    @Singleton
    fun resources(application: Application): Resources = application.resources

}