package com.semDev.l2m.notes.presentation.screens.alchemy

import com.semDev.l2m.notes.R
import com.semDev.l2m.notes.core.ViewState
import com.semDev.l2m.notes.domain.alchemy.model.alchemy.AlchemyCombinations

data class AlchemyScreenState(
    val isLoading: Boolean = false,
    val alchemyCombinations: List<AlchemyCombinations> = listOf(),
    val alchemyType: AlchemyType = AlchemyType.NormalAlchemy(),
    val isShowDialog: Boolean = false,
    val combinationItemDescription: Int = R.string.empty_slot
) : ViewState
