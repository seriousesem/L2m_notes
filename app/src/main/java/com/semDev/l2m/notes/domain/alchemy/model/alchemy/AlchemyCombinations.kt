package com.semDev.l2m.notes.domain.alchemy.model.alchemy

data class AlchemyCombinations(
    val alchemyStage: Int,
    val combinationItems: List<List<AlchemyCombinationItem>>,
    val alchemyResult: AlchemyResult
)
