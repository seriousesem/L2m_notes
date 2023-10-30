package com.semDev.l2m.notes.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.semDev.l2m.notes.presentation.navigation.AlchemyNavGraph
import com.semDev.l2m.notes.presentation.navigation.HomeNavGraph
import com.semDev.l2m.notes.presentation.theme.L2mNotesTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            L2mNotesTheme {
                HomeNavGraph(
                    navHostController = rememberNavController()
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    L2mNotesTheme {
        AlchemyNavGraph(
            navHostController = rememberNavController()
        )
    }
}