package com.semDev.l2m_wiki.presentation.components

import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.semDev.l2m_wiki.presentation.theme.Blue
import com.semDev.l2m_wiki.presentation.theme.Gray
import com.semDev.l2m_wiki.presentation.theme.WhiteBlue
import java.util.Locale

@Composable
fun AppElevatedButton(
    modifier: Modifier,
    label: String,
    enabled: Boolean,
    buttonAction: () -> Unit
){
    return  Button(
        onClick = { buttonAction()},
        enabled = enabled,
        modifier = modifier
            .fillMaxWidth()
            .defaultMinSize(minHeight = 48.dp),
        shape = RoundedCornerShape(12.dp),
        colors = ButtonColors(
            containerColor = Blue,
            contentColor = WhiteBlue,
            disabledContentColor = WhiteBlue,
            disabledContainerColor = Gray
        )
    ) {
        Text(
            text = label.uppercase(Locale.ROOT),
            fontSize = 16.sp,
            modifier = modifier.padding(0.dp, 6.dp)
        )
    }
}