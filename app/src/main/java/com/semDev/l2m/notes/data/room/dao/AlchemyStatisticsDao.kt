package com.semDev.l2m.notes.data.room.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy.Companion.REPLACE
import androidx.room.Query
import com.semDev.l2m.notes.data.room.entity.AlchemyResultEntity
import com.semDev.l2m.notes.utils.RoomConstants.ALCHEMY_STATISTICS_TABLE

@Dao
interface AlchemyStatisticsDao {
    @Insert(onConflict = REPLACE)
    suspend fun insertAlchemyResult(alchemyResultEntity: AlchemyResultEntity)

    @Query("SELECT * FROM $ALCHEMY_STATISTICS_TABLE")
    suspend fun selectAllAlchemyResults(): List<AlchemyResultEntity>

    @Delete
    suspend fun deleteAlchemyResult(alchemyResultEntity: AlchemyResultEntity)
}