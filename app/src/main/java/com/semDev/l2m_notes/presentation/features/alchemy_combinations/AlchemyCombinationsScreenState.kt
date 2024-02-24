package com.semDev.l2m_notes.presentation.features.alchemy_combinations

import com.semDev.l2m_notes.core.AlchemyType
import com.semDev.l2m_notes.domain.model.alchemy_combinations.AlchemyCombinations
import com.semDev.l2m_notes.presentation.core.ViewState

data class AlchemyCombinationsScreenState(
    val isLoading: Boolean = false,
    val alchemyCombinations: List<AlchemyCombinations> = listOf(),
    val alchemyType: AlchemyType = AlchemyType.NormalAlchemy(),
) : ViewState


fun AlchemyCombinationsScreenState.copyWith(
    isLoading: Boolean?,
    alchemyCombinations: List<AlchemyCombinations>?,
    alchemyType: AlchemyType?
): AlchemyCombinationsScreenState {
    return AlchemyCombinationsScreenState(
        isLoading = isLoading ?: this.isLoading,
        alchemyCombinations = alchemyCombinations ?: this.alchemyCombinations,
        alchemyType = alchemyType ?: this.alchemyType,
    )
}