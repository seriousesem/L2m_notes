package com.semDev.l2m_notes.presentation.components

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.semDev.l2m_notes.R

@Composable
fun DescriptionDialog(
    isShowDialog: Boolean,
    onDismiss: () -> Unit,
    description: String
){
    if (isShowDialog) {
        AlertDialog(
            onDismissRequest = { onDismiss() },
            text = {
                Text(
                    description,
                )
            },
            confirmButton = {
            },
            dismissButton = {
                TextButton(
                    onClick = {
                        onDismiss()
                    }
                ) {
                    Text(stringResource(id = R.string.close))
                }
            }
        )
    }
}

