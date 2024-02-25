package com.semDev.l2m_notes.presentation.features.auth.create_account

import com.semDev.l2m_notes.presentation.core.ViewState

data class CreateAccountScreenState(
    val email: String,
    val password: String,
    val isLoading: Boolean = false,
    val errorMessage: String? = null,
) : ViewState