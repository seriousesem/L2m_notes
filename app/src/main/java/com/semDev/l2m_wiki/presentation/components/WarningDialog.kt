package com.semDev.l2m_wiki.presentation.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.graphics.Color.Companion.Transparent
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.semDev.l2m_wiki.R
import com.semDev.l2m_wiki.presentation.theme.Blue
import com.semDev.l2m_wiki.presentation.theme.Gray
import com.semDev.l2m_wiki.presentation.theme.VeryLiteBlue

@Composable
fun WarningDialog(
    message: String,
    confirmButtonAction: () -> Unit,
    dismissButtonAction: () -> Unit,
) {
    AlertDialog(
        modifier = Modifier.padding(horizontal = 16.dp),
        onDismissRequest = {},
        confirmButton = {
            OutlinedButton(
                modifier = Modifier.width(80.dp),
                onClick = confirmButtonAction,
                colors = ButtonColors(
                    containerColor = Transparent,
                    contentColor = Red,
                    disabledContainerColor = Gray,
                    disabledContentColor = Gray
                ),
                border = BorderStroke(width = 1.dp, color = Red)
            )
            {
                Text(
                    text = stringResource(id = R.string.yes).uppercase(),
                )
            }
        },
        dismissButton = {
            OutlinedButton(
                modifier = Modifier.width(96.dp).padding(end = 16.dp),
                onClick = dismissButtonAction,
                colors = ButtonColors(
                    containerColor = Transparent,
                    contentColor = Blue,
                    disabledContainerColor = Gray,
                    disabledContentColor = Gray
                ),
                border = BorderStroke(width = 1.dp, color = Blue)
            )
            {
                Text(
                    text = stringResource(id = R.string.no).uppercase(),
                )
            }
        },
        title = {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = stringResource(id = R.string.warning_dialog_title),
                    fontSize = 20.sp,
                    color = Red,
                )
            }
        },
        text = {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp)
            ) {
                Text(
                    text = message,
                    modifier = Modifier.verticalScroll(rememberScrollState()),
                    maxLines = 8,
                    textAlign = TextAlign.Center
                )
            }
        },
        containerColor = VeryLiteBlue,
        titleContentColor = Blue,
        textContentColor = Blue,
        )
}