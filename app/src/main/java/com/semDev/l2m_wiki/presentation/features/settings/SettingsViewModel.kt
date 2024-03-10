package com.semDev.l2m_wiki.presentation.features.settings

import com.semDev.l2m_wiki.core.navigation.LOGIN_SCREEN
import com.semDev.l2m_wiki.core.navigation.SETTINGS_SCREEN
import com.semDev.l2m_wiki.domain.core.AppResult
import com.semDev.l2m_wiki.domain.repository.AuthRepository
import com.semDev.l2m_wiki.presentation.core.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import javax.inject.Inject

@HiltViewModel
class SettingsViewModel @Inject constructor(
    private val authRepository: AuthRepository
) : BaseViewModel<SettingsScreenEvent, SettingsState>() {

    override fun setInitialState(): SettingsState {
        return SettingsState(
            email = "",
            password = "",
            isLoading = false,
            isShowBottomSheet = false,
            errorMessage = null,
        )
    }

    @Suppress("UNCHECKED_CAST")
    override fun <T> setEvent(event: SettingsScreenEvent, data: T) {
        when (event) {
            SettingsScreenEvent.LOGOUT -> {
                showLoading()
                logout(data as (String, String) -> Unit)
            }

            SettingsScreenEvent.UPDATE_EMAIL -> updateEmail(data as String)
            SettingsScreenEvent.UPDATE_PASSWORD -> updatePassword(data as String)
            SettingsScreenEvent.DELETE_ACCOUNT -> {
                showLoading()
                deleteAccount(data as (String, String) -> Unit)
            }

            SettingsScreenEvent.HIDE_ERROR_DIALOG -> {
                showLoading()
                hideErrorDialog()
            }

            SettingsScreenEvent.SHOW_BOTTOM_SHEET -> {
                showBottomSheet()
            }

            SettingsScreenEvent.HIDE_BOTTOM_SHEET -> {
                hideBottomSheet()
            }
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

    private suspend fun login(): Boolean {
        var isLoginSuccessful = false
        try {
            launchCatching {
                when (val responseResult =
                    authRepository.login(viewState.value.email, viewState.value.password)) {
                    is AppResult.Success -> {
                        isLoginSuccessful = true
                    }
                    is AppResult.Error -> {
                        hideLoading()
                        showErrorDialog(responseResult.message)
                    }
                }
            }.join()
        } catch (e: Exception) {
            hideLoading()
            showErrorDialog(e.message)
        }
        return isLoginSuccessful
    }

    private fun logout(openAndPopUp: (String, String) -> Unit) {
        try {
            launchCatching {
                delay(1000L)
                when (val responseResult =
                    authRepository.logout()) {
                    is AppResult.Success -> {
                        hideLoading()
                        openAndPopUp(LOGIN_SCREEN, SETTINGS_SCREEN)
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

    private fun deleteAccount(openAndPopUp: (String, String) -> Unit) {
        try {
            launchCatching {
                delay(1000L)
               if(login()){
                   when (val responseResult =
                       authRepository.deleteAccount()) {
                       is AppResult.Success -> {
                           hideBottomSheet()
                           hideLoading()
                           openAndPopUp(LOGIN_SCREEN, SETTINGS_SCREEN)
                       }
                       is AppResult.Error -> {
                           hideLoading()
                           showErrorDialog(responseResult.message)
                       }
                   }
               }else{
                   hideLoading()
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
                isLoading = false,
                isShowBottomSheet = false,
                errorMessage = null,
                email = "",
                password = ""
            )
        }
    }

    private fun showBottomSheet() {
        setState {
            copy(
                isShowBottomSheet = true,
            )
        }
    }

    private fun hideBottomSheet() {
        setState {
            copy(
                isShowBottomSheet = false,
            )
        }
    }

}