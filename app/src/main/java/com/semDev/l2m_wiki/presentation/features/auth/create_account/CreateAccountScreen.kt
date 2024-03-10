package com.semDev.l2m_wiki.presentation.features.auth.create_account

import android.content.Context
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.semDev.l2m_wiki.R
import com.semDev.l2m_wiki.presentation.components.AnimatedProgressIndicator
import com.semDev.l2m_wiki.presentation.components.AppElevatedButton
import com.semDev.l2m_wiki.presentation.components.AuthImage
import com.semDev.l2m_wiki.presentation.components.BackIconButton
import com.semDev.l2m_wiki.presentation.components.EmailTextField
import com.semDev.l2m_wiki.presentation.components.ErrorDialog
import com.semDev.l2m_wiki.presentation.components.PasswordTextField
import com.semDev.l2m_wiki.presentation.components.TopBar
import com.semDev.l2m_wiki.presentation.components.VerticalSpacing
import com.semDev.l2m_wiki.presentation.theme.White
import com.semDev.l2m_wiki.utils.MapKeys


@Composable
fun CreateAccountScreen(
    openAndPopUp: (String, String) -> Unit,
    popUpScreen: () -> Unit,
    modifier: Modifier = Modifier,
    viewModel: CreateAccountViewModel = hiltViewModel()
) {
    val context = LocalContext.current
    BackHandler(onBack = {
        popUpScreen()
    })
    Scaffold(
        containerColor = White,
        modifier = modifier.fillMaxSize(),
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
            AnimatedProgressIndicator()
        } else if (state.errorMessage != null) {
            ErrorDialog(
                errorMessage = state.errorMessage,
                confirmButtonAction = {
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
                context = context,
            )
        }
    }
}

@Composable
fun CreateAccountScreenView(
    modifier: Modifier,
    padding: PaddingValues,
    context: Context,
    viewModel: CreateAccountViewModel,
    openAndPopUp: (String, String) -> Unit,
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(vertical = padding.calculateTopPadding(), horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        VerticalSpacing(16)
        AuthImage()
        VerticalSpacing(16)
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
        VerticalSpacing(16)
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
        VerticalSpacing(32)
        AppElevatedButton(
            modifier = modifier,
            label = stringResource(R.string.create_account),
            enabled = viewModel.viewState.value.email.isNotEmpty() && viewModel.viewState.value.password.isNotEmpty(),
            buttonAction = {
                viewModel.setEvent(
                    event = CreateAccountScreenEvent.CREATE_ACCOUNT,
                    data = mapOf(
                        MapKeys.CONTEXT_KEY to context,
                        MapKeys.ACTION_KEY to openAndPopUp
                    )
                )
            }
        )
    }
}