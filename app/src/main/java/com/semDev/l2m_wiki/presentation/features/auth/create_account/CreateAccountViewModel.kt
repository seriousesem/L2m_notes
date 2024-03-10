package com.semDev.l2m_wiki.presentation.features.auth.create_account

import android.content.Context
import android.widget.Toast
import com.semDev.l2m_wiki.R
import com.semDev.l2m_wiki.core.navigation.CREATE_ACCOUNT_SCREEN
import com.semDev.l2m_wiki.core.navigation.LOGIN_SCREEN
import com.semDev.l2m_wiki.domain.core.AppResult
import com.semDev.l2m_wiki.domain.repository.AuthRepository
import com.semDev.l2m_wiki.presentation.core.BaseViewModel
import com.semDev.l2m_wiki.utils.MapKeys
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
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
            CreateAccountScreenEvent.CREATE_ACCOUNT -> {
                showLoading()
                val dataMap = data as Map<*, *>
                createAccount(dataMap = dataMap)
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
    @Suppress("UNCHECKED_CAST")
    private fun createAccount(dataMap: Map<*, *>) {
        try {
            launchCatching {
                delay(1000L)
                when (val responseResult =
                    authRepository.createAccount(viewState.value.email, viewState.value.password)) {
                    is AppResult.Success -> {
                        hideLoading()
                        val context = dataMap[MapKeys.CONTEXT_KEY] as Context
                        val action = dataMap[MapKeys.ACTION_KEY] as (String, String) -> Unit
                        Toast.makeText(context, context.getText(R.string.account_successfully_create), Toast.LENGTH_SHORT).show()
                        action(LOGIN_SCREEN, CREATE_ACCOUNT_SCREEN)
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