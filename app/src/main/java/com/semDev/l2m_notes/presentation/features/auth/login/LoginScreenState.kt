package com.semDev.l2m_notes.presentation.features.auth.login
import com.semDev.l2m_notes.presentation.core.ViewState

data class LoginScreenState(
    val email: String,
    val password: String
) : ViewState