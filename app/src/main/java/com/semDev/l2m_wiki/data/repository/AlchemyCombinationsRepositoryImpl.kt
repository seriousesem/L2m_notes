package com.semDev.l2m_wiki.data.repository


import com.semDev.l2m_wiki.core.AlchemyType
import com.semDev.l2m_wiki.data.storage.AlchemyCombinationsList
import com.semDev.l2m_wiki.domain.model.alchemy_combinations.AlchemyCombinations
import com.semDev.l2m_wiki.domain.repository.AlchemyCombinationsRepository

class AlchemyCombinationsRepositoryImpl : AlchemyCombinationsRepository {
    override fun fetchAlchemyCombinations(alchemyType: AlchemyType): List<AlchemyCombinations> {
        return when (alchemyType) {
            AlchemyType.NormalAlchemy() -> AlchemyCombinationsList.normalAlchemyCombinations
            AlchemyType.TopAlchemy() -> AlchemyCombinationsList.topAlchemyCombinations
            else -> AlchemyCombinationsList.normalAlchemyCombinations
        }
    }
}

