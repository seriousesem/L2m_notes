package com.semDev.l2m_notes.data.repository


import com.semDev.l2m_notes.core.AlchemyType
import com.semDev.l2m_notes.data.storage.AlchemyCombinationsList
import com.semDev.l2m_notes.domain.model.alchemy_combinations.AlchemyCombinations
import com.semDev.l2m_notes.domain.repository.AlchemyCombinationsRepository

class AlchemyCombinationsRepositoryImpl : AlchemyCombinationsRepository {
    override fun fetchAlchemyCombinations(alchemyType: AlchemyType): List<AlchemyCombinations> {
        return when (alchemyType) {
            AlchemyType.NormalAlchemy() -> AlchemyCombinationsList.normalAlchemyCombinations
            AlchemyType.TopAlchemy() -> AlchemyCombinationsList.topAlchemyCombinations
            else -> AlchemyCombinationsList.normalAlchemyCombinations
        }
    }
}

