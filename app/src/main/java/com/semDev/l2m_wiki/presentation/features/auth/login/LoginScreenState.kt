package com.semDev.l2m_wiki.presentation.features.auth.login
import com.semDev.l2m_wiki.presentation.core.ViewState

data class LoginScreenState(
    val email: String,
    val password: String,
    val isLoading: Boolean = false,
    val errorMessage: String? = null,
) : ViewState