package com.semDev.l2m.notes.presentation.screens.alchemy

import android.util.Log
import androidx.compose.foundation.BorderStroke
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
import androidx.compose.foundation.lazy.LazyRow
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
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import coil.compose.AsyncImage
import com.semDev.l2m.notes.R
import com.semDev.l2m.notes.domain.alchemy.model.alchemy.AlchemyCombinations
import com.semDev.l2m.notes.domain.alchemy.model.alchemy.AlchemyCombinationItem
import com.semDev.l2m.notes.domain.alchemy.model.alchemy.AlchemyResultItem
import com.semDev.l2m.notes.presentation.components.AppScaffold
import com.semDev.l2m.notes.presentation.components.BackIconButton
import com.semDev.l2m.notes.presentation.components.DescriptionDialog
import com.semDev.l2m.notes.presentation.components.HorizontalDivider
import com.semDev.l2m.notes.presentation.components.HorizontalSpacing
import com.semDev.l2m.notes.presentation.components.LanguageIconButton
import com.semDev.l2m.notes.presentation.components.ScreenProgress
import com.semDev.l2m.notes.presentation.components.TopBar


@Composable
fun AlchemyScreen(
    navHostController: NavHostController = rememberNavController(),
    viewModel: AlchemyViewModel = hiltViewModel()
) {
    val context = LocalContext.current
//    BackHandler(onBack = {
//        navHostController.popBackStack()
//    })
    val state = viewModel.viewState.value
    AppScaffold(
        topBar = {
            TopBar(
                title = "",
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
                        event = AlchemyScreenEvent.SELECT_ALCHEMY_TYPE,
                        data = alchemyType
                    )
                }
            )
        }
    ) { contentPadding ->
        if (state.isLoading) {
            ScreenProgress()
        } else {
            AlchemyCombinations(
                alchemyCombinationsList = state.alchemyCombinations,
                combinationItemAction = { description ->
                    viewModel.setEvent(
                        event = AlchemyScreenEvent.OPEN_DIALOG,
                        data = description
                    )
                },
                contentPadding = contentPadding
            )
        }
        DescriptionDialog(
            showDialog = state.isShowDialog,
            onDismiss = {
                viewModel.setEvent(
                    event = AlchemyScreenEvent.CLOSE_DIALOG,
                    data = null
                )
            },
            description = stringResource(id = state.combinationItemDescription)
        )
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

    BottomNavigation {
        alchemyTypes.forEach { currentAlchemyType ->
            BottomBar(
                selectedAlchemyType = selectedAlchemyType,
                currentAlchemyType = currentAlchemyType,
                description = currentAlchemyType.description,
                icon = currentAlchemyType.icon,
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
    icon: ImageVector,
    action: (AlchemyType) -> Unit
) {
    BottomNavigationItem(
        label = {
            Text(text = stringResource(id = description))
        },
        icon = {
            Icon(
                imageVector = icon,
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

@Composable
private fun AlchemyCombinations(
    alchemyCombinationsList: List<AlchemyCombinations>,
    combinationItemAction: (Int) -> Unit,
    contentPadding: PaddingValues
) {
    LazyColumn(
        modifier = Modifier
            .padding(
                top = contentPadding.calculateTopPadding(),
                bottom = contentPadding.calculateBottomPadding()
            )
            .fillMaxSize(),
        state = rememberLazyListState(),
    ) {
        items(alchemyCombinationsList) { alchemyCombinations ->
            AlchemyCombinationCard(
                alchemyCombinations = alchemyCombinations,
                combinationItemAction = combinationItemAction
            )
        }
    }
}

@Composable
private fun AlchemyCombinationCard(
    alchemyCombinations: AlchemyCombinations,
    combinationItemAction: (Int) -> Unit
) {
    Card(
        modifier = Modifier
            .padding(vertical = 16.dp, horizontal = 8.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.Black.copy(alpha = 0.3f)
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
                color = Color.DarkGray

            )
            HorizontalDivider()
            for (combinationItems in alchemyCombinations.combinationItems) {
                Row(
                    modifier = Modifier
                        .padding(8.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                ) {
                    for (combinationItem in combinationItems) {
                        HorizontalSpacing(spacing = 8)
                        AlchemyCombinationItem(
                            alchemyCombinationItem = combinationItem,
                            combinationItemAction = combinationItemAction
                        )
                        HorizontalSpacing(spacing = 8)
                    }
                }
            }
            HorizontalDivider()
            Text(
                text = stringResource(id = R.string.alchemy_result_combination_title),
                modifier = Modifier.padding(vertical = 8.dp),
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color.DarkGray

            )
            AlchemyResult(
                items = alchemyCombinations.alchemyResult.items,
                alchemyStage = alchemyCombinations.alchemyStage
            )
        }
    }
}

@Composable
private fun AlchemyCombinationItem(
    alchemyCombinationItem: AlchemyCombinationItem,
    combinationItemAction: (Int) -> Unit
) {

    OutlinedButton(
        onClick = {
            combinationItemAction(alchemyCombinationItem.description)
        },
        modifier = Modifier
            .size(48.dp),
        shape = CircleShape,
        contentPadding = PaddingValues(0.dp),
        colors = ButtonDefaults.outlinedButtonColors(
            backgroundColor = alchemyCombinationItem.slotColor,
            contentColor = Color.DarkGray
        ),
    ) {
        Text(
            text = alchemyCombinationItem.itemEnchant,
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
private fun AlchemyResultItem(
    item: Any?,
    index: Int,
    alchemyStage: Int
) {
    OutlinedButton(
        onClick = {},
        modifier = Modifier.size(48.dp),
        shape = CutCornerShape(16.dp),
        border = BorderStroke(1.dp, Color.LightGray),
        contentPadding = PaddingValues(0.dp),
        colors = ButtonDefaults.outlinedButtonColors(backgroundColor = Color.LightGray)
    ) {
        AsyncImage(
            model = item,
            contentDescription = null,
            modifier = Modifier
                .size(48.dp)
        )
    }
}

@Composable
private fun AlchemyResult(
    items: List<AlchemyResultItem>,
    alchemyStage: Int
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center,
    ) {
        for (item in items) {
            HorizontalSpacing(spacing = 8)
            AlchemyResultItem(
                item = item.item,
                index = 1,
                alchemyStage = alchemyStage
            )
            HorizontalSpacing(spacing = 8)
        }
    }
}

//@Composable
//private fun ResultItem() {
//
//    Row(
//        modifier = Modifier.fillMaxWidth(),
//        verticalAlignment = Alignment.CenterVertically,
//        horizontalArrangement = Arrangement.Center
//    ) {
//        AsyncImage(
//            model = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_WP_Sword_G4_005.png",
//            contentDescription = null,
//            modifier = Modifier
//                .size(32.dp)
//                .padding(end = 8.dp)
//        )
//        Text(text = "+0 Меч Гигантов (0.0033%)")
//    }
//}
//
//@Composable
//private fun ResultItems() {
//
//    LazyColumn {
//        items(50) {
//            ResultItem()
//        }
//    }
//
//}
