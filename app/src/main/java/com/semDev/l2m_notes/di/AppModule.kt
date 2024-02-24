package com.semDev.l2m_notes.di

import android.content.Context
import com.semDev.l2m_notes.data.firestore.FireStoreService
import com.semDev.l2m_notes.data.repository.AlchemyCombinationsRepositoryImpl
import com.semDev.l2m_notes.data.repository.AlchemyStatisticsRepositoryImpl
import com.semDev.l2m_notes.data.repository.AuthRepositoryImpl
import com.semDev.l2m_notes.data.storage.BaseLocalStorage
import com.semDev.l2m_notes.data.storage.LocalStorage
import com.semDev.l2m_notes.domain.repository.AlchemyCombinationsRepository
import com.semDev.l2m_notes.domain.repository.AlchemyStatisticsRepository
import com.semDev.l2m_notes.domain.repository.AuthRepository
import com.semDev.l2m_notes.presentation.components.ads.AdMobInterstitial
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

    @Provides
    @Singleton
    fun provideLocalization(@ApplicationContext context: Context): BaseLocalStorage =
        LocalStorage(context = context)

    @Singleton
    @Provides
    fun provideAdMobInterstitial(
        @ApplicationContext context: Context
    ): AdMobInterstitial = AdMobInterstitial(context)

    @Provides
    @Singleton
    fun provideFireStoreService(
    ): FireStoreService = FireStoreService()

    @Provides
    @Singleton
    fun provideAlchemyCombinationsRepository(
    ): AlchemyCombinationsRepository =
        AlchemyCombinationsRepositoryImpl()

    @Provides
    @Singleton
    fun provideAlchemyStatisticsRepository(
        fireStoreService: FireStoreService
    ): AlchemyStatisticsRepository =
        AlchemyStatisticsRepositoryImpl(
            fireStoreService = fireStoreService
        )

    @Provides
    @Singleton
    fun provideAuthRepository(): AuthRepository =
        AuthRepositoryImpl()


}