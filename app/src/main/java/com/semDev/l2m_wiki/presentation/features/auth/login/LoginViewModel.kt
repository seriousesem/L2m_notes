package com.semDev.l2m_wiki.presentation.features.auth.login

import com.semDev.l2m_wiki.core.navigation.CREATE_ACCOUNT_SCREEN
import com.semDev.l2m_wiki.core.navigation.HOME_SCREEN
import com.semDev.l2m_wiki.core.navigation.LOGIN_SCREEN
import com.semDev.l2m_wiki.core.navigation.RESET_PASSWORD_SCREEN
import com.semDev.l2m_wiki.domain.core.AppResult
import com.semDev.l2m_wiki.domain.repository.AuthRepository
import com.semDev.l2m_wiki.presentation.core.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
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
            LoginScreenEvent.LOGIN -> {
                showLoading()
                login(data as (String, String) -> Unit)
            }
            LoginScreenEvent.GO_TO_CREATE_ACCOUNT_SCREEN -> goToCreateAccountScreen(data as (String) -> Unit)
            LoginScreenEvent.GO_TO_RESET_PASSWORD_SCREEN -> goToResetPasswordScreen(data as (String) -> Unit)
            LoginScreenEvent.HIDE_ERROR_DIALOG -> hideErrorDialog()
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

    private fun login(openAndPopUp: (String, String) -> Unit) {
        try {
            launchCatching {
                delay(1000L)
                when (val responseResult =
                    authRepository.login(viewState.value.email, viewState.value.password)) {
                    is AppResult.Success -> {
                        hideLoading()
                        openAndPopUp(HOME_SCREEN, LOGIN_SCREEN)
                    }

                    is AppResult.Error -> {
                        hideLoading()
                        showErrorDialog(responseResult.message)
                    }
                }
            }
        } catch (e: Exception) {
            hideLoading()
            showErrorDialog(e.message)
        }
    }

    private fun goToCreateAccountScreen(openScreen: (String) -> Unit) {
        openScreen(CREATE_ACCOUNT_SCREEN)
    }

    private fun goToResetPasswordScreen(openScreen: (String) -> Unit) {
        openScreen(RESET_PASSWORD_SCREEN)
    }

    private fun showLoading() {
        setState {
            copy(
                isLoading = true,
            )
        }
    }

    private fun hideLoading() {
        setState {
            copy(
                isLoading = false,
            )
        }
    }

    private fun showErrorDialog(errorMessage: String?) {
        setState {
            copy(
                errorMessage = errorMessage
            )
        }
    }

    private fun hideErrorDialog() {
        setState {
            copy(
                errorMessage = null,
            )
        }
    }

}