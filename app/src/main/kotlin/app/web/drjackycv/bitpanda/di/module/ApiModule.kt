package app.web.drjackycv.bitpanda.di.module

import app.web.drjackycv.data.bitz.remote.BitzApi
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
class ApiModule {

    @Provides
    fun bitz(retrofit: Retrofit): BitzApi =
        retrofit.create(BitzApi::class.java)

}