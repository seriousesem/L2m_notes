package com.semDev.l2m_notes.presentation.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.semDev.l2m_notes.R

@Composable
fun EmailTextField(
    modifier: Modifier,
    email: String,
    updateEmailAction: (String) -> Unit
){
    return OutlinedTextField(
        singleLine = true,
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp),
        value = email,
        onValueChange = {
            updateEmailAction(it)
        },
        shape = RoundedCornerShape(50.dp),
        label = { Text(stringResource(R.string.email)) },
    )
}