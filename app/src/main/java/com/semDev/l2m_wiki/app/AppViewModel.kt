package com.semDev.l2m_wiki.app

import androidx.lifecycle.ViewModel
import com.semDev.l2m_wiki.core.navigation.HOME_SCREEN
import com.semDev.l2m_wiki.core.navigation.LOGIN_SCREEN
import com.semDev.l2m_wiki.domain.core.AppResult
import com.semDev.l2m_wiki.domain.repository.AuthRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AppViewModel @Inject constructor(
    private val authRepository: AuthRepository
) : ViewModel() {

    fun checkAuth(): String {
        var route: String = LOGIN_SCREEN
        try {
            when (val responseResult = authRepository.hasUser()) {
                is AppResult.Success -> {
                    if (responseResult.data == true) route = HOME_SCREEN
                }
                is AppResult.Error -> {
                }
            }
        } catch (e: Exception) {
            print(e.message)
        }
        return route
    }

}

