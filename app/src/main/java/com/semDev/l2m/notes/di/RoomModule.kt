package com.semDev.l2m.notes.di
import android.content.Context
import androidx.room.Room
import com.semDev.l2m.notes.data.room.dao.AlchemyStatisticsDao
import com.semDev.l2m.notes.data.room.db.AppDataBase
import com.semDev.l2m.notes.utils.RoomConstants.DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RoomModule {

    @Provides
    @Singleton
    fun provideL2mNotesDataBase(
        @ApplicationContext context: Context
    ): AppDataBase = Room.databaseBuilder(
        context,
        AppDataBase::class.java,
        DATABASE_NAME
    ).build()

    @Provides
    @Singleton
    fun provideAlchemyStatisticsDao(appDataBase: AppDataBase): AlchemyStatisticsDao =
        appDataBase.fetchAlchemyStatisticsDao()
}