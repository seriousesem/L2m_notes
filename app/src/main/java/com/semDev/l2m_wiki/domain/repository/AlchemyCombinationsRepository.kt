package com.semDev.l2m_wiki.domain.repository

import com.semDev.l2m_wiki.core.AlchemyType
import com.semDev.l2m_wiki.domain.model.alchemy_combinations.AlchemyCombinations

interface AlchemyCombinationsRepository {
    fun fetchAlchemyCombinations(alchemyType: AlchemyType): List<AlchemyCombinations>
}