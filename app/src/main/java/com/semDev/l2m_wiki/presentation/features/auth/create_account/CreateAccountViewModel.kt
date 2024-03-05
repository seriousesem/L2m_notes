package com.semDev.l2m_wiki.presentation.features.auth.create_account

import com.semDev.l2m_wiki.core.navigation.CREATE_ACCOUNT_SCREEN
import com.semDev.l2m_wiki.core.navigation.LOGIN_SCREEN
import com.semDev.l2m_wiki.domain.core.AppResult
import com.semDev.l2m_wiki.domain.repository.AuthRepository
import com.semDev.l2m_wiki.presentation.core.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CreateAccountViewModel @Inject constructor(
    private val authRepository: AuthRepository
) : BaseViewModel<CreateAccountScreenEvent, CreateAccountScreenState>() {

    override fun setInitialState(): CreateAccountScreenState {
        return CreateAccountScreenState(
            email = "",
            password = "",
        );
    }

    @Suppress("UNCHECKED_CAST")
    override fun <T> setEvent(event: CreateAccountScreenEvent, data: T) {
        when (event) {
            CreateAccountScreenEvent.CREATE_ACCOUNT -> {
                showLoading()
                createAccount(data as (String, String) -> Unit)
            }
            CreateAccountScreenEvent.UPDATE_EMAIL -> updateEmail(data as String)
            CreateAccountScreenEvent.UPDATE_PASSWORD -> updatePassword(data as String)
            CreateAccountScreenEvent.HIDE_ERROR_DIALOG -> hideErrorDialog()
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

    private fun createAccount(openAndPopUp: (String, String) -> Unit) {
        try {
            launchCatching {
                when (val responseResult =
                    authRepository.createAccount(viewState.value.email, viewState.value.password)) {
                    is AppResult.Success -> {
                        hideLoading()
                        openAndPopUp(LOGIN_SCREEN, CREATE_ACCOUNT_SCREEN)
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