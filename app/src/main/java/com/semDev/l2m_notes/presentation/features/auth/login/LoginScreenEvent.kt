package com.semDev.l2m_notes.presentation.features.auth.login

import com.semDev.l2m_notes.presentation.core.ScreenEvent


enum class LoginScreenEvent : ScreenEvent {
    UPDATE_EMAIL, UPDATE_PASSWORD, SIGN_IN, GO_TO_SIGN_UP_SCREEN
}