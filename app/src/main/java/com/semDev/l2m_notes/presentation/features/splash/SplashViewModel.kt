package com.semDev.l2m_notes.presentation.features.splash

import com.semDev.l2m_notes.core.navigation.HOME_SCREEN
import com.semDev.l2m_notes.core.navigation.LOGIN_SCREEN
import com.semDev.l2m_notes.core.navigation.SPLASH_SCREEN
import com.semDev.l2m_notes.domain.core.AppResult
import com.semDev.l2m_notes.domain.repository.AuthRepository
import com.semDev.l2m_notes.presentation.core.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor(
    private val authRepository: AuthRepository
) : BaseViewModel<SplashScreenEvent, SplashScreenState>() {

    override fun setInitialState(): SplashScreenState {
        return SplashScreenState()
    }

    @Suppress("UNCHECKED_CAST")
    override fun <T> setEvent(event: SplashScreenEvent, data: T) {
        when (event) {
            SplashScreenEvent.HIDE_ERROR_DIALOG -> {
                val action = data as (String, String) -> Unit
                hideErrorDialog()
                onAppStart(openAndPopUp = action)
            }
        }
    }

    fun onAppStart(openAndPopUp: (String, String) -> Unit) {
        try {
            launchCatching {
                when (val responseResult = authRepository.hasUser()) {
                    is AppResult.Success -> {
                        if (responseResult.data == true) openAndPopUp(HOME_SCREEN, SPLASH_SCREEN)
                        else openAndPopUp(LOGIN_SCREEN, SPLASH_SCREEN)
                    }

                    is AppResult.Error -> {
                        showErrorDialog(responseResult.message)
                    }
                }
            }
        } catch (e: Exception) {
            showErrorDialog(e.message)
        }
    }

    private fun showErrorDialog(errorMessage: String?) {
        setState {
            copy(
                isLoading = this.isLoading,
                errorMessage = errorMessage
            )
        }
    }

    private fun hideErrorDialog() {
        setState {
            copy(
                isLoading = this.isLoading,
                errorMessage = null,
            )
        }
    }
}

