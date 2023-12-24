package com.semDev.l2m.notes.data.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.semDev.l2m.notes.domain.model.alchemy_statistics.AlchemyResultModel
import com.semDev.l2m.notes.utils.AlchemyStatisticsMapKeys.ALCHEMY_GLOW_COLOR
import com.semDev.l2m.notes.utils.AlchemyStatisticsMapKeys.ALCHEMY_INSERT_DATE
import com.semDev.l2m.notes.utils.AlchemyStatisticsMapKeys.ALCHEMY_SLOT_INDEX
import com.semDev.l2m.notes.utils.RoomConstants.ALCHEMY_STATISTICS_TABLE

@Entity(
    tableName = ALCHEMY_STATISTICS_TABLE
)
data class AlchemyResultEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = 0,
    @ColumnInfo(name = ALCHEMY_GLOW_COLOR, defaultValue = "")
    val alchemyGlowColor: String,
    @ColumnInfo(name = ALCHEMY_SLOT_INDEX, defaultValue = "")
    val alchemySlotIndex: String,
    @ColumnInfo(name = ALCHEMY_INSERT_DATE, defaultValue = "")
    val alchemyInsertDate: String,
)

fun AlchemyResultEntity.toAlchemyResultModel(): AlchemyResultModel {
    return AlchemyResultModel(
        id = id,
        alchemySlotIndex = alchemySlotIndex,
        alchemyGlowColor = alchemyGlowColor,
        alchemyInsertDate = alchemyInsertDate
    )
}

fun AlchemyResultModel.toAlchemyResultEntity(): AlchemyResultEntity {
    return AlchemyResultEntity(
        id = id,
        alchemySlotIndex = alchemySlotIndex,
        alchemyGlowColor = alchemyGlowColor,
        alchemyInsertDate = alchemyInsertDate
    )
}