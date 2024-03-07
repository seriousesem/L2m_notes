package com.semDev.l2m_wiki.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.semDev.l2m_wiki.R
import kotlinx.coroutines.delay

@Composable
fun AnimatedProgressIndicator(
    animationDuration: Int = 250
) {
    val images = listOf(
        R.drawable.heroic_item,
        R.drawable.legendary_item,
        R.drawable.mythic_item
    )

    var currentImageIndices by remember { mutableStateOf(listOf(0)) }

    LaunchedEffect(key1 = true) {
        while (true) {
           for (index in 0..3){
               delay(animationDuration.toLong())
               when(index) {
                   0 ->  currentImageIndices = listOf(0)
                   1 ->  currentImageIndices = listOf(0, 1)
                   2 ->  currentImageIndices = listOf(0, 1, 2)
                   3 ->  currentImageIndices = listOf()
               }
           }
        }
    }
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        LazyRow(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            items(currentImageIndices){ imageIndex ->
                Image(
                    painter = painterResource(id = images[imageIndex]),
                    contentDescription = null,
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .size(50.dp)
                        .padding(end = 24.dp)
                )
            }
        }
    }

}

