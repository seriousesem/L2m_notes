package com.semDev.l2m_wiki.presentation.features.alchemy_statistics

import com.semDev.l2m_wiki.presentation.core.ScreenEvent

enum class AlchemyStatisticsScreenEvent : ScreenEvent {
    SHOW_SHORT_TOAST,
    SELECT_CHART_OPTION,
    SELECT_GLOW_COLOR_OPTION,
    SHOW_BOTTOM_SHEET,
    HIDE_BOTTOM_SHEET,
    HIDE_ERROR_DIALOG,
    DELETE_ALCHEMY_RESULT,
    SELECT_SLOT_INDEX,
    SELECT_GLOW_COLOR,
    SAVE_ALCHEMY_RESULT,
    SHOW_WARNING_DIALOG,
    HIDE_WARNING_DIALOG,
}
