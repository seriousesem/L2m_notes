package com.semDev.l2m_notes.presentation.features.auth.login

import com.semDev.l2m_notes.core.navigation.HOME_SCREEN
import com.semDev.l2m_notes.core.navigation.LOGIN_SCREEN
import com.semDev.l2m_notes.core.navigation.CREATE_ACCOUNT_SCREEN
import com.semDev.l2m_notes.domain.repository.AuthRepository
import com.semDev.l2m_notes.presentation.core.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val authRepository: AuthRepository
) : BaseViewModel<LoginScreenEvent, LoginScreenState>() {

    override fun setInitialState(): LoginScreenState {
        return LoginScreenState(
            email = "",
            password = "",
        );
    }

    @Suppress("UNCHECKED_CAST")
    override fun <T> setEvent(event: LoginScreenEvent, data: T) {
        when (event) {
            LoginScreenEvent.UPDATE_EMAIL -> updateEmail(data as String)
            LoginScreenEvent.UPDATE_PASSWORD -> updatePassword(data as String)
            LoginScreenEvent.SIGN_IN -> signIn(data as (String, String) -> Unit)
            LoginScreenEvent.GO_TO_SIGN_UP_SCREEN -> goToSignUpScreen(data as (String) -> Unit)
        }
    }

    private fun updateEmail(newEmail: String) {
        setState {
            copy(
                email = newEmail
            )
        }
    }

    private fun updatePassword(newPassword: String) {
        setState {
            copy(
                password = newPassword
            )
        }
    }

    private fun signIn(openAndPopUp: (String, String) -> Unit) {
        launchCatching {
            authRepository.login(viewState.value.email, viewState.value.password)
            openAndPopUp(HOME_SCREEN, LOGIN_SCREEN)
        }
    }

    private fun goToSignUpScreen(openScreen: (String) -> Unit) {
        openScreen(CREATE_ACCOUNT_SCREEN)
    }


}