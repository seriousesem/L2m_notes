package com.semDev.l2m_notes.presentation.features.auth.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.semDev.l2m_notes.R
import com.semDev.l2m_notes.presentation.components.AppElevatedButton
import com.semDev.l2m_notes.presentation.components.EmailTextField
import com.semDev.l2m_notes.presentation.components.ErrorDialog
import com.semDev.l2m_notes.presentation.components.PasswordTextField
import com.semDev.l2m_notes.presentation.components.ScreenProgress
import com.semDev.l2m_notes.presentation.components.MenuIconButton
import com.semDev.l2m_notes.presentation.components.TopBar
import com.semDev.l2m_notes.presentation.components.VerticalSpacing

@Composable
fun LoginScreen(
    openAndPopUp: (String, String) -> Unit,
    openScreen: (String) -> Unit,
    modifier: Modifier = Modifier,
    viewModel: LoginViewModel = hiltViewModel()
) {
    Scaffold(
        modifier = modifier,
        topBar = {
            TopBar(
                title = stringResource(id = R.string.login_screen_title),
            )
        },
    ) { padding ->
        val state = viewModel.viewState.value
        if (state.isLoading) {
            ScreenProgress()
        } else if (state.errorMessage != null) {
            ErrorDialog(
                errorMessage = state.errorMessage,
                action = {
                    viewModel.setEvent(
                        event = LoginScreenEvent.HIDE_ERROR_DIALOG,
                        data = null,
                    )
                }
            )
        } else {
            LoginScreenView(
                modifier = modifier,
                padding = padding,
                viewModel = viewModel,
                openAndPopUp = openAndPopUp,
                openScreen = openScreen,
            )
        }

    }
}

@Composable
fun LoginScreenView(
    modifier: Modifier,
    padding: PaddingValues,
    viewModel: LoginViewModel,
    openAndPopUp: (String, String) -> Unit,
    openScreen: (String) -> Unit,
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(padding),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        VerticalSpacing(16)
        Image(
            painter = painterResource(id = R.drawable.login_image),
            contentDescription = "Auth image",
            modifier = modifier
                .size(100.dp)
        )
        VerticalSpacing(12)
        EmailTextField(
            modifier = modifier,
            email = viewModel.viewState.value.email,
            updateEmailAction = {
                viewModel.setEvent(
                    event = LoginScreenEvent.UPDATE_EMAIL,
                    data = it,
                )
            }
        )
        PasswordTextField(
            modifier = modifier,
            password = viewModel.viewState.value.password,
            updatePasswordAction = {
                viewModel.setEvent(
                    event = LoginScreenEvent.UPDATE_PASSWORD,
                    data = it,
                )
            }
        )
        VerticalSpacing(16)
        AppElevatedButton(
            modifier = modifier,
            label = stringResource(R.string.login),
            enabled = viewModel.viewState.value.email.isNotEmpty() && viewModel.viewState.value.password.isNotEmpty(),
            buttonAction = {
                viewModel.setEvent(
                    event = LoginScreenEvent.LOGIN,
                    data = openAndPopUp
                )
            }
        )
        VerticalSpacing(8)
        TextButton(
            onClick = {
                viewModel.setEvent(
                    event = LoginScreenEvent.GO_TO_CREATE_ACCOUNT_SCREEN,
                    data = openScreen
                )
            }) {
            Text(text = stringResource(R.string.create_account_description), fontSize = 16.sp)
        }
    }
}