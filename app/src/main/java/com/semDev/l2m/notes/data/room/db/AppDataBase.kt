package com.semDev.l2m.notes.data.room.db
import androidx.room.Database
import androidx.room.RoomDatabase
import com.semDev.l2m.notes.data.room.dao.AlchemyStatisticsDao
import com.semDev.l2m.notes.data.room.entity.AlchemyResultEntity
import com.semDev.l2m.notes.utils.RoomConstants.DATABASE_VERSION

@Database(
    entities = [AlchemyResultEntity::class],
    version = DATABASE_VERSION,
    exportSchema = false
)

abstract class AppDataBase : RoomDatabase() {
    abstract fun fetchAlchemyStatisticsDao(): AlchemyStatisticsDao
}