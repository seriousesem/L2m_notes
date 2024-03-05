package com.semDev.l2m_wiki.presentation.features.home

import com.semDev.l2m_wiki.presentation.core.ViewState

data class HomeScreenState(
    val isLoading: Boolean = false,
    val errorMessage: String? = null,
) : ViewState
