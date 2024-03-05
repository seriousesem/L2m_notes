package com.semDev.l2m_wiki.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.semDev.l2m_wiki.R

@Composable
fun AuthImage(modifier: Modifier = Modifier){

    Image(
        painter = painterResource(id = R.drawable.login_image),
        contentDescription = "Auth image",
        modifier = modifier
            .size(100.dp)
    )
}
