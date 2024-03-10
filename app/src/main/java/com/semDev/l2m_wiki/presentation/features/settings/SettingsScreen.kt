package com.semDev.l2m_wiki.presentation.features.settings
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.semDev.l2m_wiki.R
import com.semDev.l2m_wiki.presentation.components.AnimatedProgressIndicator
import com.semDev.l2m_wiki.presentation.components.AppElevatedButton
import com.semDev.l2m_wiki.presentation.components.BackIconButton
import com.semDev.l2m_wiki.presentation.components.EmailTextField
import com.semDev.l2m_wiki.presentation.components.ErrorDialog
import com.semDev.l2m_wiki.presentation.components.PasswordTextField
import com.semDev.l2m_wiki.presentation.components.TopBar
import com.semDev.l2m_wiki.presentation.components.VerticalSpacing
import com.semDev.l2m_wiki.presentation.theme.Blue
import com.semDev.l2m_wiki.presentation.theme.LiteBlue
import com.semDev.l2m_wiki.presentation.theme.Red
import com.semDev.l2m_wiki.presentation.theme.VeryLiteBlue
import com.semDev.l2m_wiki.presentation.theme.White


@Composable
fun SettingsScreen(
    openAndPopUp: (String, String) -> Unit,
    popUpScreen: () -> Unit,
    modifier: Modifier = Modifier,
    viewModel: SettingsViewModel = hiltViewModel()
) {
    BackHandler(onBack = {
        popUpScreen()
    })
    Scaffold(
        containerColor = White,
        modifier = modifier.fillMaxSize(),
        topBar = {
            TopBar(
                title = stringResource(id = R.string.settings_screen_title),
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
                        event = SettingsScreenEvent.HIDE_ERROR_DIALOG,
                        data = null,
                    )
                }
            )
        } else {
            SettingsScreenView(
                modifier = modifier,
                padding = padding,
                viewModel = viewModel,
                openAndPopUp = openAndPopUp,
            )
            if (state.isShowBottomSheet) {
                DeleteAccountBottomSheet(
                    viewModel = viewModel,
                    openAndPopUp = openAndPopUp
                )
            }
        }
    }
}

@Composable
fun SettingsScreenView(
    modifier: Modifier,
    padding: PaddingValues,
    viewModel: SettingsViewModel,
    openAndPopUp: (String, String) -> Unit,
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(vertical = padding.calculateTopPadding(), horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        VerticalSpacing(32)
        Text(
            text = stringResource(R.string.account),
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp,
            color = Blue
        )
        VerticalSpacing(32)
        AppElevatedButton(
            modifier = modifier,
            label = stringResource(R.string.logout),
            enabled = true,
            buttonAction = {
                viewModel.setEvent(
                    event = SettingsScreenEvent.LOGOUT,
                    data = openAndPopUp
                )
            }
        )
        VerticalSpacing(32)
        AppElevatedButton(
            modifier = modifier,
            label = stringResource(R.string.delete_account),
            enabled = true,
            buttonAction = {
                viewModel.setEvent(
                    event = SettingsScreenEvent.SHOW_BOTTOM_SHEET,
                    data = null
                )
            },
            color = Red
        )
        VerticalSpacing(32)
        HorizontalDivider(
            color = LiteBlue
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun DeleteAccountBottomSheet(
    modifier: Modifier = Modifier,
    viewModel: SettingsViewModel,
    openAndPopUp: (String, String) -> Unit,
) {
    ModalBottomSheet(
        onDismissRequest = {
            viewModel.setEvent(
                event = SettingsScreenEvent.HIDE_BOTTOM_SHEET,
                data = null,
            )
        },
        containerColor = VeryLiteBlue,
        sheetState = rememberModalBottomSheetState(skipPartiallyExpanded = true),
        modifier = Modifier,
        scrimColor = Color.Transparent.copy(alpha = 0.8f)
    ) {
        Column(
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(8.dp)
        )
        {
            Text(
                text = stringResource(id = R.string.you_want_delete_account),
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Red,
                modifier = Modifier.padding(bottom = 24.dp),
                textAlign = TextAlign.Center
            )
            EmailTextField(
                modifier = modifier,
                email = viewModel.viewState.value.email,
                updateEmailAction = {
                    viewModel.setEvent(
                        event = SettingsScreenEvent.UPDATE_EMAIL,
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
                        event = SettingsScreenEvent.UPDATE_PASSWORD,
                        data = it,
                    )
                }
            )
            VerticalSpacing(32)
            AppElevatedButton(
                modifier = Modifier,
                label = stringResource(R.string.delete_account),
                enabled = viewModel.viewState.value.email.isNotEmpty() && viewModel.viewState.value.password.isNotEmpty(),
                buttonAction = {
                    viewModel.setEvent(
                        event = SettingsScreenEvent.DELETE_ACCOUNT,
                        data = openAndPopUp
                    )
                },
                color = Red
            )
            VerticalSpacing(spacing = 40)
        }
    }

}