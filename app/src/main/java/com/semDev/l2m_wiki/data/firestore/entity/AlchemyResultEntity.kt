package com.semDev.l2m_wiki.data.firestore.entity

import com.semDev.l2m_wiki.domain.model.alchemy_statistics.AlchemyResultModel
import com.semDev.l2m_wiki.utils.AlchemyStatisticsMapKeys


data class AlchemyResultEntity(
    val id: String? = "",
    val alchemyInsertDate: String,
    val alchemySlotIndex: String,
    val alchemyGlowColor: String,
)
fun AlchemyResultEntity.toAlchemyResultModel(): AlchemyResultModel {
    return AlchemyResultModel(
        id = id,
        alchemyInsertDate = alchemyInsertDate,
        alchemySlotIndex = alchemySlotIndex,
        alchemyGlowColor = alchemyGlowColor,
    )
}

fun AlchemyResultModel.toAlchemyResultEntity(): AlchemyResultEntity {
    return AlchemyResultEntity(
        id = id,
        alchemyInsertDate = alchemyInsertDate,
        alchemySlotIndex = alchemySlotIndex,
        alchemyGlowColor = alchemyGlowColor,
    )
}

fun alchemyResultEntityFromMap(id: String, map: Map<String, Any>?): AlchemyResultEntity {
    return AlchemyResultEntity(
        id = id,
        alchemyInsertDate = map?.get(AlchemyStatisticsMapKeys.ALCHEMY_INSERT_DATE)  as String,
        alchemySlotIndex = map[AlchemyStatisticsMapKeys.ALCHEMY_SLOT_INDEX] as String,
        alchemyGlowColor = map[AlchemyStatisticsMapKeys.ALCHEMY_GLOW_COLOR] as String
    )
}