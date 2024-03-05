package com.semDev.l2m_wiki.presentation.features.alchemy_combinations

import com.semDev.l2m_wiki.core.AlchemyType
import com.semDev.l2m_wiki.domain.model.alchemy_combinations.AlchemyCombinations
import com.semDev.l2m_wiki.presentation.core.ViewState

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