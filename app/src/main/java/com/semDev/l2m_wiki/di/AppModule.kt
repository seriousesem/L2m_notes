package com.semDev.l2m_wiki.di

import android.content.Context
import android.content.res.Resources
import com.semDev.l2m_wiki.core.localization.Localization
import com.semDev.l2m_wiki.data.firestore.FireStoreService
import com.semDev.l2m_wiki.data.repository.AlchemyCombinationsRepositoryImpl
import com.semDev.l2m_wiki.data.repository.AlchemyStatisticsRepositoryImpl
import com.semDev.l2m_wiki.data.repository.AuthRepositoryImpl
import com.semDev.l2m_wiki.data.service.AuthService
import com.semDev.l2m_wiki.data.storage.BaseLocalStorage
import com.semDev.l2m_wiki.data.storage.LocalStorage
import com.semDev.l2m_wiki.domain.repository.AlchemyCombinationsRepository
import com.semDev.l2m_wiki.domain.repository.AlchemyStatisticsRepository
import com.semDev.l2m_wiki.domain.repository.AuthRepository
import com.semDev.l2m_wiki.presentation.components.ads.AdMobInterstitial
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
    fun provideLocalization(
        @ApplicationContext context: Context,
        storage: LocalStorage
    ): Localization =
        Localization(context = context, storage = storage)

    @Singleton
    @Provides
    fun provideResources(@ApplicationContext context: Context): Resources =
         context.resources


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
    fun provideAuthService(
    ): AuthService = AuthService()

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
    fun provideAuthRepository(authService: AuthService): AuthRepository =
        AuthRepositoryImpl(authService = authService)


}