package com.semDev.l2m.notes.domain.repository

import com.semDev.l2m.notes.domain.model.alchemy_combinations.AlchemyCombinations

interface AlchemyCombinationsRepository {
    fun getNormalAlchemyCombinations(): List<AlchemyCombinations>
    fun getTopAlchemyCombinations(): List<AlchemyCombinations>
}