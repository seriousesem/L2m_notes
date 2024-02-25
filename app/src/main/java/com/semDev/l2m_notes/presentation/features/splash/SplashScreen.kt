package com.semDev.l2m_notes.presentation.features.splash


import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.hilt.navigation.compose.hiltViewModel
import com.semDev.l2m_notes.presentation.components.ErrorDialog
import com.semDev.l2m_notes.presentation.components.ScreenProgress
import kotlinx.coroutines.delay

private const val SPLASH_TIMEOUT = 1000L

@Composable
fun SplashScreen(
    openAndPopUp: (String, String) -> Unit,
    viewModel: SplashViewModel = hiltViewModel()
) {
    val state = viewModel.viewState.value
    if (state.isLoading) {
        ScreenProgress()
    } else if (state.errorMessage != null) {
        ErrorDialog(
            errorMessage = state.errorMessage,
            action = {
                viewModel.setEvent(
                    event = SplashScreenEvent.HIDE_ERROR_DIALOG,
                    data = openAndPopUp,
                )
            }
        )
    }
    LaunchedEffect(true) {
        delay(SPLASH_TIMEOUT)
        viewModel.onAppStart(openAndPopUp)
    }
}