package com.semDev.l2m_wiki.presentation.features.auth.login

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.semDev.l2m_wiki.R
import com.semDev.l2m_wiki.presentation.components.AnimatedProgressIndicator
import com.semDev.l2m_wiki.presentation.components.AppElevatedButton
import com.semDev.l2m_wiki.presentation.components.AuthImage
import com.semDev.l2m_wiki.presentation.components.EmailTextField
import com.semDev.l2m_wiki.presentation.components.ErrorDialog
import com.semDev.l2m_wiki.presentation.components.PasswordTextField
import com.semDev.l2m_wiki.presentation.components.TopBar
import com.semDev.l2m_wiki.presentation.components.VerticalSpacing
import com.semDev.l2m_wiki.presentation.theme.White


@Composable
fun LoginScreen(
    openAndPopUp: (String, String) -> Unit,
    openScreen: (String) -> Unit,
    modifier: Modifier = Modifier,
    viewModel: LoginViewModel = hiltViewModel()
) {
    Scaffold(
        containerColor = White,
        modifier = modifier.fillMaxSize(),
        topBar = {
            TopBar(
                title = stringResource(id = R.string.login_screen_title),
            )
        },
    ) { padding ->
        val state = viewModel.viewState.value
        if (state.isLoading) {
            AnimatedProgressIndicator()
        } else if (state.errorMessage != null) {
            ErrorDialog(
                errorMessage = state.errorMessage,
                confirmButtonAction = {
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
            .verticalScroll(rememberScrollState())
            .padding(vertical = padding.calculateTopPadding(), horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        VerticalSpacing(16)
        AuthImage()
        VerticalSpacing(16)
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
        VerticalSpacing(16)
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
        VerticalSpacing(32)
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
        VerticalSpacing(32)
        TextButton(
            modifier = Modifier.align(Alignment.Start),
            onClick = {
                viewModel.setEvent(
                    event = LoginScreenEvent.GO_TO_CREATE_ACCOUNT_SCREEN,
                    data = openScreen
                )
            }) {
            Text(
                text = stringResource(R.string.create_account_description),
                fontSize = 14.sp
            )
        }
        TextButton(
            modifier = Modifier.align(Alignment.Start),
            onClick = {
                viewModel.setEvent(
                    event = LoginScreenEvent.GO_TO_RESET_PASSWORD_SCREEN,
                    data = openScreen
                )
            }) {
            Text(
                text = stringResource(R.string.reset_password_description),
                fontSize = 14.sp,
            )
        }
    }
}