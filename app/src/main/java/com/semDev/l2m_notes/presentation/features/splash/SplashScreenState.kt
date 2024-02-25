package com.semDev.l2m_notes.presentation.features.splash

import com.semDev.l2m_notes.presentation.core.ViewState

data class SplashScreenState(
    val isLoading: Boolean = false,
    val errorMessage: String? = null,
) : ViewState
