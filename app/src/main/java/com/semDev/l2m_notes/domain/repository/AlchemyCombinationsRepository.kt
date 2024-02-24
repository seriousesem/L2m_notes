package com.semDev.l2m_notes.domain.repository

import com.semDev.l2m_notes.core.AlchemyType
import com.semDev.l2m_notes.domain.model.alchemy_combinations.AlchemyCombinations

interface AlchemyCombinationsRepository {
    fun fetchAlchemyCombinations(alchemyType: AlchemyType): List<AlchemyCombinations>
}