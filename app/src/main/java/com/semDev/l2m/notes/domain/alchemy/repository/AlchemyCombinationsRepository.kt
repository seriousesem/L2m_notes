package com.semDev.l2m.notes.domain.alchemy.repository

import com.semDev.l2m.notes.domain.alchemy.model.alchemy_combinations.AlchemyCombinations

interface AlchemyCombinationsRepository {
    fun getNormalAlchemyCombinations(): List<AlchemyCombinations>
    fun getTopAlchemyCombinations(): List<AlchemyCombinations>
}