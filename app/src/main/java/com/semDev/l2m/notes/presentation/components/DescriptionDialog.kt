package com.semDev.l2m.notes.presentation.components

import android.util.Log
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import com.semDev.l2m.notes.R

@Composable
fun DescriptionDialog(
    showDialog: Boolean,
    onDismiss: () -> Unit,
    description: String
){
    if (showDialog) {
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

