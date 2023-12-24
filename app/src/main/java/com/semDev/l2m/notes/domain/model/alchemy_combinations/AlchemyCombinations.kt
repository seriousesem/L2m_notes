package com.semDev.l2m.notes.domain.model.alchemy_combinations

data class AlchemyCombinations(
    val alchemyStage: Int,
    val combinationItems: List<List<AlchemyCombinationItem>>,
    val alchemyCombinationResults: AlchemyCombinationResults
)
