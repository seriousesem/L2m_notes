package com.semDev.l2m_notes.presentation.features.splash

import com.semDev.l2m_notes.core.navigation.HOME_SCREEN
import com.semDev.l2m_notes.core.navigation.LOGIN_SCREEN
import com.semDev.l2m_notes.core.navigation.SPLASH_SCREEN
import com.semDev.l2m_notes.domain.repository.AuthRepository
import com.semDev.l2m_notes.presentation.core.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor(
    private val authRepository: AuthRepository
) : BaseViewModel<SplashScreenEvent, SplashScreenState>() {

    fun onAppStart(openAndPopUp: (String, String) -> Unit) {
        if (authRepository.hasUser()) openAndPopUp(HOME_SCREEN, SPLASH_SCREEN)
        else openAndPopUp(LOGIN_SCREEN, SPLASH_SCREEN)
    }

    override fun setInitialState(): SplashScreenState {
        return SplashScreenState()
    }

    override fun <T> setEvent(event: SplashScreenEvent, data: T) {
    }
}

