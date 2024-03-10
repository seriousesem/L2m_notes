package com.semDev.l2m_wiki.presentation.features.auth.reset_password
import android.content.Context
import android.widget.Toast
import com.semDev.l2m_wiki.R
import com.semDev.l2m_wiki.core.navigation.LOGIN_SCREEN
import com.semDev.l2m_wiki.core.navigation.RESET_PASSWORD_SCREEN
import com.semDev.l2m_wiki.domain.core.AppResult
import com.semDev.l2m_wiki.domain.repository.AuthRepository
import com.semDev.l2m_wiki.presentation.core.BaseViewModel
import com.semDev.l2m_wiki.utils.MapKeys
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import javax.inject.Inject

@HiltViewModel
class ResetPasswordViewModel @Inject constructor(
    private val authRepository: AuthRepository
) : BaseViewModel<ResetPasswordScreenEvent, ResetPasswordState>() {

    override fun setInitialState(): ResetPasswordState {
        return ResetPasswordState(
            email = "",
        );
    }

   override fun <T> setEvent(event: ResetPasswordScreenEvent, data: T) {
        when (event) {
            ResetPasswordScreenEvent.CREATE_ACCOUNT -> {
                showLoading()
                val dataMap = data as Map<*, *>
                resetPassword(dataMap = dataMap)
            }
            ResetPasswordScreenEvent.UPDATE_EMAIL -> updateEmail(data as String)
            ResetPasswordScreenEvent.HIDE_ERROR_DIALOG -> hideErrorDialog()
        }
    }

    private fun updateEmail(newEmail: String) {
        setState {
            copy(
                email = newEmail
            )
        }
    }
    @Suppress("UNCHECKED_CAST")
    private fun resetPassword(dataMap: Map<*, *>) {
        try {
            launchCatching {
                delay(1000L)
                when (val responseResult =
                    authRepository.resetPassword(viewState.value.email,)) {
                    is AppResult.Success -> {
                        hideLoading()
                        val context = dataMap[MapKeys.CONTEXT_KEY] as Context
                        val action = dataMap[MapKeys.ACTION_KEY] as (String, String) -> Unit
                        Toast.makeText(context, context.getText(R.string.password_successfully_reset), Toast.LENGTH_SHORT).show()
                        action(LOGIN_SCREEN, RESET_PASSWORD_SCREEN)
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