package com.semDev.l2m_wiki.presentation.features.alchemy_statistics

import com.semDev.l2m_wiki.domain.model.alchemy_statistics.AlchemyResultModel
import com.semDev.l2m_wiki.presentation.core.ViewState
import com.semDev.l2m_wiki.utils.AlchemyGlowColors.GRAY_GLOW_COLOR
import com.semDev.l2m_wiki.utils.AlchemySlotIndexes.FIRST_SLOT_INDEX

data class AlchemyStatisticsScreenState(
    val isLoading: Boolean = false,
    val isShowBottomSheet: Boolean = false,
    val errorMessage: String? = null,
    val alchemyResults: List<AlchemyResultModel> = listOf(),
    val alchemyResultSlotsQuantity: List<Int> = listOf(),
    val chartOption: ChartOptions = ChartOptions.SHOW_ALL_SLOTS,
    val glowColor: GlowColors = GlowColors.GRAY,
    val selectedSlotIndex: String = FIRST_SLOT_INDEX,
    val selectedGlowColor: String = GRAY_GLOW_COLOR,
) : ViewState
