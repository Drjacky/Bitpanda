package app.web.drjackycv.bitpanda.di.module

import app.web.drjackycv.data.bitz.repository.BitzRepositoryImpl
import app.web.drjackycv.domain.bitz.repository.BitzRepository
import dagger.Binds
import dagger.Module

@Module
abstract class RepositoryModule {

    @Binds
    abstract fun bitz(bitzRepositoryImpl: BitzRepositoryImpl): BitzRepository

}