package com.semDev.l2m_wiki.domain.repository

import com.semDev.l2m_wiki.domain.core.AppResult
import com.semDev.l2m_wiki.domain.model.alchemy_statistics.AlchemyResultModel

interface AlchemyStatisticsRepository {
    suspend fun saveAlchemyResult(alchemyResultModel: AlchemyResultModel): AppResult<Boolean>
    suspend fun fetchAlchemyResults(): AppResult<List<AlchemyResultModel>>
    suspend fun deleteAlchemyResult(alchemyResultModel: AlchemyResultModel): AppResult<Boolean>
}