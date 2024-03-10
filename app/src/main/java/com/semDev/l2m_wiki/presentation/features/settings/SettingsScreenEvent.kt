package com.semDev.l2m_wiki.presentation.features.settings

import com.semDev.l2m_wiki.presentation.core.ScreenEvent

enum class SettingsScreenEvent : ScreenEvent {
    UPDATE_EMAIL, UPDATE_PASSWORD, LOGOUT, DELETE_ACCOUNT, HIDE_ERROR_DIALOG, SHOW_BOTTOM_SHEET,
    HIDE_BOTTOM_SHEET,
}