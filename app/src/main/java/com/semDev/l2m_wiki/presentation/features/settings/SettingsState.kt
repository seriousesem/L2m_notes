package com.semDev.l2m_wiki.presentation.features.settings
import com.semDev.l2m_wiki.presentation.core.ViewState

data class SettingsState(
    val email: String = "",
    val password: String = "",
    val isLoading: Boolean = false,
    val isShowBottomSheet: Boolean = false,
    val errorMessage: String? = null,
) : ViewState