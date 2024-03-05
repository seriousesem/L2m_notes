package com.semDev.l2m_wiki.data.repository

import com.semDev.l2m_wiki.data.firestore.FireStoreService
import com.semDev.l2m_wiki.data.firestore.entity.toAlchemyResultEntity
import com.semDev.l2m_wiki.data.firestore.entity.toAlchemyResultModel
import com.semDev.l2m_wiki.domain.core.AppResult
import com.semDev.l2m_wiki.domain.model.alchemy_statistics.AlchemyResultModel
import com.semDev.l2m_wiki.domain.repository.AlchemyStatisticsRepository


class AlchemyStatisticsRepositoryImpl(
    private val fireStoreService: FireStoreService
) : AlchemyStatisticsRepository {
    override suspend fun saveAlchemyResult(alchemyResultModel: AlchemyResultModel): AppResult<Boolean> {
        return try {
            fireStoreService.saveAlchemyResult(alchemyResultModel.toAlchemyResultEntity())
            AppResult.Success(data = true)
        } catch (e: Exception) {
            AppResult.Error(message = e.message ?: "Save alchemy result failed")
        }
    }

    override suspend fun fetchAlchemyResults(): AppResult<List<AlchemyResultModel>> {
        return try {
            val allAlchemyResultEntity = fireStoreService.fetchAlchemyResults()
            val allAlchemyResultModel =
                allAlchemyResultEntity.map { alchemyResultEntity ->
                    alchemyResultEntity.toAlchemyResultModel()
                }
            AppResult.Success(data = allAlchemyResultModel)
        } catch (e: Exception) {
            AppResult.Error(message = e.message ?: "Fetch all alchemy results failed")
        }
    }

    override suspend fun deleteAlchemyResult(alchemyResultModel: AlchemyResultModel): AppResult<Boolean> {
        return try {
            fireStoreService.deleteAlchemyResult(alchemyResultModel.toAlchemyResultEntity())
            AppResult.Success(data = true)
        } catch (e: Exception) {
            AppResult.Error(message = e.message ?: "Remove alchemy result failed")
        }
    }
}