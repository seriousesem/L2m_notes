package com.semDev.l2m_notes.presentation.features.auth.create_account

import com.semDev.l2m_notes.core.navigation.LOGIN_SCREEN
import com.semDev.l2m_notes.core.navigation.CREATE_ACCOUNT_SCREEN
import com.semDev.l2m_notes.domain.repository.AuthRepository
import com.semDev.l2m_notes.presentation.core.BaseViewModel
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

    override fun <T> setEvent(event: CreateAccountScreenEvent, data: T) {
        when (event) {
            CreateAccountScreenEvent.SIGN_UP -> onSignUpClick(data as (String, String) -> Unit)
            CreateAccountScreenEvent.UPDATE_EMAIL -> updateEmail(data as String)
            CreateAccountScreenEvent.UPDATE_PASSWORD -> updatePassword(data as String)
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

    private fun onSignUpClick(openAndPopUp: (String, String) -> Unit) {
        launchCatching {
            authRepository.createAccount(viewState.value.email, viewState.value.password)
            openAndPopUp(LOGIN_SCREEN, CREATE_ACCOUNT_SCREEN)
        }
    }

}