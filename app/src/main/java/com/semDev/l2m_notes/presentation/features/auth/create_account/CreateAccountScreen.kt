package com.semDev.l2m_notes.presentation.features.auth.create_account

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
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
import com.semDev.l2m_notes.presentation.components.PasswordTextField
import com.semDev.l2m_notes.presentation.components.SettingsIconButton
import com.semDev.l2m_notes.presentation.components.TopBar
import com.semDev.l2m_notes.presentation.components.VerticalSpacing


@Composable
fun CreateAccountScreen(
    openAndPopUp: (String, String) -> Unit,
    popUpScreen: () -> Unit,
    modifier: Modifier = Modifier,
    viewModel: CreateAccountViewModel = hiltViewModel()
) {
    val email = viewModel.viewState.value.email
    val password = viewModel.viewState.value.password
    BackHandler(onBack = {
        popUpScreen()
    })
    Scaffold(
        modifier = modifier,
        topBar = {
            TopBar(
                title = stringResource(id = R.string.create_account),
                navigationIcon = {
                    BackIconButton(action = popUpScreen)
                },
                actionIcon = {
                    SettingsIconButton(
                        action = {}
                    )
                }
            )
        },
    ) { padding ->
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
                    .size(150.dp)
            )
            VerticalSpacing(12)
            EmailTextField(
                modifier = modifier,
                email = email,
                updateEmailAction = {
                    viewModel.setEvent(
                        event = CreateAccountScreenEvent.UPDATE_EMAIL,
                        data = it,
                    )
                }
            )
            PasswordTextField(
                modifier = modifier,
                password = password,
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
                buttonAction = {
                    viewModel.setEvent(
                        event = CreateAccountScreenEvent.SIGN_UP,
                        data = openAndPopUp
                    )
                }
            )
        }
    }
}