package com.semDev.l2m_wiki.presentation.features.auth.reset_password

import com.semDev.l2m_wiki.presentation.core.ViewState

data class ResetPasswordState(
    val email: String,
    val isLoading: Boolean = false,
    val errorMessage: String? = null,
) : ViewState