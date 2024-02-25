package com.semDev.l2m_notes.presentation.features.auth.create_account

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.semDev.l2m_notes.R
import com.semDev.l2m_notes.presentation.components.AppElevatedButton
import com.semDev.l2m_notes.presentation.components.BackIconButton
import com.semDev.l2m_notes.presentation.components.EmailTextField
import com.semDev.l2m_notes.presentation.components.ErrorDialog
import com.semDev.l2m_notes.presentation.components.PasswordTextField
import com.semDev.l2m_notes.presentation.components.ScreenProgress
import com.semDev.l2m_notes.presentation.components.MenuIconButton
import com.semDev.l2m_notes.presentation.components.TopBar
import com.semDev.l2m_notes.presentation.components.VerticalSpacing


@Composable
fun CreateAccountScreen(
    openAndPopUp: (String, String) -> Unit,
    popUpScreen: () -> Unit,
    modifier: Modifier = Modifier,
    viewModel: CreateAccountViewModel = hiltViewModel()
) {
    BackHandler(onBack = {
        popUpScreen()
    })
    Scaffold(
        modifier = modifier,
        topBar = {
            TopBar(
                title = stringResource(id = R.string.create_account),
                navigationIcon = {
                    BackIconButton(
                        action = popUpScreen
                    )
                }
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
                        event = CreateAccountScreenEvent.HIDE_ERROR_DIALOG,
                        data = null,
                    )
                }
            )
        } else {
            CreateAccountScreenView(
                modifier = modifier,
                padding = padding,
                viewModel = viewModel,
                openAndPopUp = openAndPopUp,
            )
        }
    }
}

@Composable
fun CreateAccountScreenView(
    modifier: Modifier,
    padding: PaddingValues,
    viewModel: CreateAccountViewModel,
    openAndPopUp: (String, String) -> Unit,
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
                    event = CreateAccountScreenEvent.UPDATE_EMAIL,
                    data = it,
                )
            }
        )
        PasswordTextField(
            modifier = modifier,
            password = viewModel.viewState.value.password,
            updatePasswordAction = {
                viewModel.setEvent(
                    event = CreateAccountScreenEvent.UPDATE_PASSWORD,
                    data = it,
                )
            }
        )
        VerticalSpacing(16)
        AppElevatedButton(
            modifier = modifier,
            label = stringResource(R.string.create_account),
            enabled = viewModel.viewState.value.email.isNotEmpty() && viewModel.viewState.value.password.isNotEmpty(),
            buttonAction = {
                viewModel.setEvent(
                    event = CreateAccountScreenEvent.CREATE_ACCOUNT,
                    data = openAndPopUp
                )
            }
        )
    }
}