package com.semDev.l2m.notes.data.repository

import com.semDev.l2m.notes.data.room.dao.AlchemyStatisticsDao
import com.semDev.l2m.notes.data.room.entity.AlchemyResultEntity
import com.semDev.l2m.notes.data.room.entity.toAlchemyResultEntity
import com.semDev.l2m.notes.data.room.entity.toAlchemyResultModel
import com.semDev.l2m.notes.domain.core.AppResult
import com.semDev.l2m.notes.domain.model.alchemy_statistics.AlchemyResultModel
import com.semDev.l2m.notes.domain.repository.AlchemyStatisticsRepository

class AlchemyStatisticsRepositoryImpl(
    val alchemyStatisticsDao: AlchemyStatisticsDao
) : AlchemyStatisticsRepository {
    override suspend fun saveAlchemyResul(alchemyResultModel: AlchemyResultModel): AppResult<Boolean> {
        return try {
            alchemyStatisticsDao.insertAlchemyResult(alchemyResultModel.toAlchemyResultEntity())
            AppResult.Success(data = true)
        } catch (e: Exception) {
            AppResult.Error(message = e.message ?: "Save alchemy result failed")
        }
    }

    override suspend fun fetchAllAlchemyResults(): AppResult<List<AlchemyResultModel>> {
        return try {
            val allAlchemyResultEntity = alchemyStatisticsDao.selectAllAlchemyResults()
            val allAlchemyResultModel =
                allAlchemyResultEntity.map { alchemyResultEntity ->
                    alchemyResultEntity.toAlchemyResultModel()
                }
            AppResult.Success(data = allAlchemyResultModel)
        } catch (e: Exception) {
            AppResult.Error(message = e.message ?: "Fetch all alchemy results failed")
        }
    }

    override suspend fun removeAlchemyResult(alchemyResultModel: AlchemyResultModel): AppResult<Boolean> {
        return try {
            alchemyStatisticsDao.deleteAlchemyResult(alchemyResultModel.toAlchemyResultEntity())
            AppResult.Success(data = true)
        } catch (e: Exception) {
            AppResult.Error(message = e.message ?: "Remove alchemy result failed")
        }
    }
}