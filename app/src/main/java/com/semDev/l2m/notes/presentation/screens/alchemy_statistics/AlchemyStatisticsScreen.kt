package com.semDev.l2m.notes.presentation.screens.alchemy_statistics

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.ContentAlpha
import androidx.compose.material.Icon
import androidx.compose.material.LocalContentColor
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.DarkGray
import androidx.compose.ui.graphics.Color.Companion.LightGray
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.semDev.l2m.notes.R
import com.semDev.l2m.notes.domain.alchemy.model.alchemy_combinations.AlchemyCombinations
import com.semDev.l2m.notes.domain.alchemy.model.alchemy_combinations.AlchemyCombinationItem
import com.semDev.l2m.notes.domain.alchemy.model.alchemy_combinations.AlchemyResultItem
import com.semDev.l2m.notes.presentation.components.AppScaffold
import com.semDev.l2m.notes.presentation.components.BackIconButton
import com.semDev.l2m.notes.presentation.components.HorizontalDivider
import com.semDev.l2m.notes.presentation.components.HorizontalSpacing
import com.semDev.l2m.notes.presentation.components.LanguageIconButton
import com.semDev.l2m.notes.presentation.components.ScreenProgress
import com.semDev.l2m.notes.presentation.components.TopBar
import com.semDev.l2m.notes.presentation.components.VerticalSpacing
import com.semDev.l2m.notes.presentation.screens.alchemy_combinations.AlchemyType
import com.semDev.l2m.notes.utils.MapKeys.CONTEXT_KEY
import com.semDev.l2m.notes.utils.MapKeys.MESSAGE_KEY


@Composable
fun AlchemyStatisticsScreen(
    navHostController: NavHostController,
    viewModel: AlchemyStatisticsViewModel = hiltViewModel()
) {
    val context = LocalContext.current
    BackHandler(onBack = {
        navHostController.popBackStack()
    })
    val state = viewModel.viewState.value
    AppScaffold(
        topBar = {
            TopBar(
                title = stringResource(id = R.string.alchemy_statistics_screen_title),
                navigationIcon = {
                    BackIconButton(navController = navHostController)
                },
                actionIcon = {
                    LanguageIconButton(
                        action = {}
                    )
                }
            )
        },
        bottomBar = {
        }
    ) { contentPadding ->
        if (state.isLoading) {
            ScreenProgress()
        } else {
            Box {
                Text(text = stringResource(id = R.string.alchemy_statistics_screen_title))
            }
        }
    }
}
