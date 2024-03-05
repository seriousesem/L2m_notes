package com.semDev.l2m_wiki.presentation.components

import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.semDev.l2m_wiki.R
import com.semDev.l2m_wiki.presentation.theme.Blue
import com.semDev.l2m_wiki.presentation.theme.LiteBlue



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EmailTextField(
    modifier: Modifier,
    email: String,
    updateEmailAction: (String) -> Unit
) {
    return OutlinedTextField(
        singleLine = true,
        modifier = modifier
            .fillMaxWidth()
            .defaultMinSize(minHeight = 48.dp),
        value = email,
        onValueChange = {
            updateEmailAction(it)
        },
        shape = RoundedCornerShape(12.dp),
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Blue,
            unfocusedBorderColor = LiteBlue,
            focusedLabelColor = Blue,
            cursorColor = Blue,
        ),
        label = {
            Text(
                stringResource(R.string.email),
                fontSize = 14.sp,
                color = LiteBlue
            )
        },
        textStyle = TextStyle(
            fontSize = 16.sp,
            color = Blue
        ),
    )
}