package com.semDev.l2m_notes.presentation.features.auth.login

import com.semDev.l2m_notes.presentation.core.ScreenEvent


enum class LoginScreenEvent : ScreenEvent {
    UPDATE_EMAIL, UPDATE_PASSWORD, LOGIN, GO_TO_CREATE_ACCOUNT_SCREEN, HIDE_ERROR_DIALOG
}