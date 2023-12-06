package com.semDev.l2m.notes.di
import android.content.Context
import com.semDev.l2m.notes.data.alchemy.repository.AlchemyCombinationsRepositoryImpl
import com.semDev.l2m.notes.data.storage.BaseLocalStorage
import com.semDev.l2m.notes.data.storage.LocalStorage
import com.semDev.l2m.notes.domain.alchemy.repository.AlchemyCombinationsRepository
import com.semDev.l2m.notes.presentation.components.AdMobInterstitial
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideLocalStorage(@ApplicationContext context: Context): BaseLocalStorage =
        LocalStorage(context = context)

    @Singleton
    @Provides
    fun provideAdMobInterstitial(
        @ApplicationContext context: Context
    ): AdMobInterstitial = AdMobInterstitial(context)


    @Provides
    @Singleton
    fun provideCAlchemyRepository(

    ): AlchemyCombinationsRepository =
        AlchemyCombinationsRepositoryImpl()

}