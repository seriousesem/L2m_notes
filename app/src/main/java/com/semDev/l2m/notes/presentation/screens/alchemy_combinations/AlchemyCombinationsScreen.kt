package com.semDev.l2m.notes.presentation.screens.alchemy_combinations

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
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
import com.semDev.l2m.notes.utils.MapKeys.CONTEXT_KEY
import com.semDev.l2m.notes.utils.MapKeys.MESSAGE_KEY


@Composable
fun AlchemyCombinationsScreen(
    navHostController: NavHostController,
    viewModel: AlchemyCombinationsViewModel = hiltViewModel()
) {
    val context = LocalContext.current
    BackHandler(onBack = {
        navHostController.popBackStack()
    })
    val state = viewModel.viewState.value
    AppScaffold(
        topBar = {
            TopBar(
                title = stringResource(id = state.alchemyType.description),
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
            BottomBar(
                selectedAlchemyType = state.alchemyType,
                action = { alchemyType ->
                    viewModel.setEvent(
                        event = AlchemyCombinationsScreenEvent.SELECT_ALCHEMY_TYPE,
                        data = alchemyType
                    )
                }
            )
        }
    ) { contentPadding ->
        if (state.isLoading) {
            ScreenProgress()
        } else {
            AlchemyCombinationsView(
                alchemyCombinationsList = state.alchemyCombinations,
                showShortToast = { message ->
                    viewModel.setEvent(
                        event = AlchemyCombinationsScreenEvent.SHOW_SHORT_TOAST,
                        data = mapOf(
                            CONTEXT_KEY to context,
                            MESSAGE_KEY to message
                        )
                    )
                },
                contentPadding = contentPadding
            )
        }
    }
}

@Composable
private fun AlchemyCombinationsView(
    alchemyCombinationsList: List<AlchemyCombinations>,
    showShortToast: (Int) -> Unit,
    contentPadding: PaddingValues
) {
    LazyColumn(
        modifier = Modifier
            .padding(
                top = contentPadding.calculateTopPadding(),
                bottom = contentPadding.calculateBottomPadding()
            )
            .fillMaxSize(),
        state = rememberLazyListState(initialFirstVisibleItemIndex = 0),
    ) {
        items(alchemyCombinationsList) { alchemyCombinations ->
            AlchemyCombinationCard(
                alchemyCombinations = alchemyCombinations,
                showShortToast = showShortToast,
            )
        }
    }
}

@Composable
private fun AlchemyCombinationCard(
    alchemyCombinations: AlchemyCombinations,
    showShortToast: (Int) -> Unit,
) {
    Card(
        modifier = Modifier
            .padding(vertical = 16.dp, horizontal = 8.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.Black.copy(alpha = 0.6f)
        )
    ) {
        Column(
            modifier = Modifier
                .padding(vertical = 8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "${stringResource(id = R.string.stage_of_alchemy)} ${alchemyCombinations.alchemyStage}",
                modifier = Modifier.padding(vertical = 8.dp),
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = LightGray

            )
            for (combinationItems in alchemyCombinations.combinationItems) {
                Row(
                    modifier = Modifier
                        .padding(horizontal = 8.dp, vertical = 8.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                ) {
                    for (combinationItem in combinationItems) {
                        HorizontalSpacing(spacing = 8)
                        AlchemyCombinationItem(
                            alchemyCombinationItem = combinationItem,
                            showShortToast = showShortToast
                        )
                        HorizontalSpacing(spacing = 8)
                    }
                }
            }
            VerticalSpacing(spacing = 8)
            HorizontalDivider()
            Text(
                text = stringResource(id = R.string.alchemy_result_combination_title),
                modifier = Modifier.padding(vertical = 16.dp),
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = LightGray

            )
            AlchemyResultView(
                alchemyResultItems = alchemyCombinations.alchemyResult.items,
                showShortToast = showShortToast
            )
        }
    }
}

@Composable
private fun AlchemyCombinationItem(
    alchemyCombinationItem: AlchemyCombinationItem,
    showShortToast: (Int) -> Unit
) {
    OutlinedButton(
        onClick = {
            showShortToast(alchemyCombinationItem.description)
        },
        modifier = Modifier
            .size(48.dp),
        shape = CircleShape,
        contentPadding = PaddingValues(0.dp),
        colors = ButtonDefaults.outlinedButtonColors(
            backgroundColor = alchemyCombinationItem.slotColor,
            contentColor = DarkGray,
        ),
        border = BorderStroke(
            width = 1.dp,
            color = DarkGray
        )
    ) {
        Text(
            text = alchemyCombinationItem.itemEnchant,
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
private fun AlchemyResultView(
    alchemyResultItems: List<AlchemyResultItem>,
    showShortToast: (Int) -> Unit
) {
    Row(
        modifier = Modifier
            .padding(bottom = 8.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.Center,
    ) {
        for (alchemyResultItem in alchemyResultItems) {
            HorizontalSpacing(spacing = 8)
            AlchemyResultItemView(
                alchemyResultItem = alchemyResultItem,
                showShortToast = showShortToast
            )
            HorizontalSpacing(spacing = 8)
        }
    }
}

@Composable
private fun AlchemyResultItemView(
    alchemyResultItem: AlchemyResultItem,
    showShortToast: (Int) -> Unit
) {
    OutlinedButton(
        onClick = {
            showShortToast(alchemyResultItem.description)
        },
        modifier = Modifier.size(48.dp),
        shape = CutCornerShape(16.dp),
        border = BorderStroke(1.dp, DarkGray),
        contentPadding = PaddingValues(0.dp),
        colors = ButtonDefaults.outlinedButtonColors(backgroundColor = Color.LightGray)
    ) {
        if (alchemyResultItem.imageAssets != null) {
            Image(
                painter = painterResource(id = alchemyResultItem.imageAssets),
                contentDescription = null,
                modifier = Modifier
                    .size(42.dp)
            )
        }
    }
}

@Composable
fun BottomBar(
    selectedAlchemyType: AlchemyType,
    action: (AlchemyType) -> Unit
) {
    val alchemyTypes = listOf(
        AlchemyType.NormalAlchemy(),
        AlchemyType.TopAlchemy()
    )

    BottomNavigation(
        backgroundColor = DarkGray,
        contentColor = LightGray
    ) {
        alchemyTypes.forEach { currentAlchemyType ->
            BottomBar(
                selectedAlchemyType = selectedAlchemyType,
                currentAlchemyType = currentAlchemyType,
                description = currentAlchemyType.description,
                action = action,
            )
        }
    }
}

@Composable
fun RowScope.BottomBar(
    selectedAlchemyType: AlchemyType,
    currentAlchemyType: AlchemyType,
    description: Int,
    action: (AlchemyType) -> Unit
) {
    BottomNavigationItem(
        label = {
            Text(text = stringResource(id = description))
        },
        icon = {
            Icon(
                imageVector = ImageVector.vectorResource(id = R.drawable.alchemy_ic),
                contentDescription = null
            )
        },
        selected = selectedAlchemyType == currentAlchemyType,
        unselectedContentColor = LocalContentColor.current.copy(alpha = ContentAlpha.disabled),
        onClick = {
            action(currentAlchemyType)
        }
    )
}
