package com.semDev.l2m.notes.presentation.screens.alchemy_combinations

import com.semDev.l2m.notes.core.ViewState
import com.semDev.l2m.notes.domain.model.alchemy_combinations.AlchemyCombinations

data class AlchemyCombinationsScreenState(
    val isLoading: Boolean = false,
    val alchemyCombinations: List<AlchemyCombinations> = listOf(),
    val alchemyType: AlchemyType = AlchemyType.NormalAlchemy(),
) : ViewState
