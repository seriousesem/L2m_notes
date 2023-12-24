package com.semDev.l2m.notes.domain.repository

import com.semDev.l2m.notes.domain.core.AppResult
import com.semDev.l2m.notes.domain.model.alchemy_statistics.AlchemyResultModel


interface AlchemyStatisticsRepository {
    suspend fun saveAlchemyResul(alchemyResultModel: AlchemyResultModel): AppResult<Boolean>
    suspend fun fetchAllAlchemyResults(): AppResult<List<AlchemyResultModel>>
    suspend fun removeAlchemyResult(alchemyResultModel: AlchemyResultModel): AppResult<Boolean>
}