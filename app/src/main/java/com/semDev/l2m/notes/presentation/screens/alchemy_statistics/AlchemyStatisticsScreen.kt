package com.semDev.l2m.notes.presentation.screens.alchemy_statistics

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonDefaults.outlinedButtonColors
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import co.yml.charts.axis.AxisData
import co.yml.charts.common.model.Point
import co.yml.charts.ui.barchart.BarChart
import co.yml.charts.ui.barchart.models.BarChartData
import co.yml.charts.ui.barchart.models.BarData
import co.yml.charts.ui.barchart.models.BarStyle
import co.yml.charts.ui.barchart.models.SelectionHighlightData
import com.semDev.l2m.notes.R
import com.semDev.l2m.notes.domain.model.alchemy_statistics.AlchemyResultModel
import com.semDev.l2m.notes.presentation.components.AppScaffold
import com.semDev.l2m.notes.presentation.components.BackIconButton
import com.semDev.l2m.notes.presentation.components.ErrorDialog
import com.semDev.l2m.notes.presentation.components.HorizontalSpacing
import com.semDev.l2m.notes.presentation.components.LanguageIconButton
import com.semDev.l2m.notes.presentation.components.ScreenProgress
import com.semDev.l2m.notes.presentation.components.TopBar
import com.semDev.l2m.notes.presentation.components.VerticalSpacing
import com.semDev.l2m.notes.presentation.theme.Blue
import com.semDev.l2m.notes.presentation.theme.Golden
import com.semDev.l2m.notes.presentation.theme.Grey700
import com.semDev.l2m.notes.utils.AlchemyGlowColors.BLUE_GLOW_COLOR
import com.semDev.l2m.notes.utils.AlchemyGlowColors.GOLDEN_GLOW_COLOR
import com.semDev.l2m.notes.utils.AlchemyGlowColors.GRAY_GLOW_COLOR
import com.semDev.l2m.notes.utils.AlchemySlotIndexes.FIFTH_SLOT_INDEX
import com.semDev.l2m.notes.utils.AlchemySlotIndexes.FIRST_SLOT_INDEX
import com.semDev.l2m.notes.utils.AlchemySlotIndexes.FOURTH_SLOT_INDEX
import com.semDev.l2m.notes.utils.AlchemySlotIndexes.SECOND_SLOT_INDEX
import com.semDev.l2m.notes.utils.AlchemySlotIndexes.THIRD_SLOT_INDEX

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
        } else if (state.errorMessage != null) {
            ErrorDialog(
                errorMessage = state.errorMessage,
                action = {
                    viewModel.setEvent(
                        event = AlchemyStatisticsScreenEvent.SELECT_CHART_OPTION,
                        data = null,
                    )
                }
            )
        } else {
            AlchemyStatisticsScreenView(
                contentPadding = contentPadding,
                viewModel = viewModel
            )
            if (state.isShowBottomSheet) {
                AddAlchemyResultBottomSheet(viewModel = viewModel)
            }
        }
    }
}

@Composable
private fun AlchemyStatisticsScreenView(
    contentPadding: PaddingValues,
    viewModel: AlchemyStatisticsViewModel
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(
                top = contentPadding.calculateTopPadding(),
                start = 8.dp,
                end = 8.dp,
                bottom = contentPadding.calculateBottomPadding()
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .weight(
                    if (viewModel.viewState.value.chartOption == ChartOptions.SHOW_ALL_SLOTS) 0.4f else 0.35f
                ),
            contentAlignment = Alignment.Center
        ) {
            BarChartView(
                viewModel = viewModel
            )
        }
        Box(
            modifier = Modifier.weight(
                if (viewModel.viewState.value.chartOption == ChartOptions.SHOW_ALL_SLOTS) 0.1f else 0.15f
            ),
            contentAlignment = Alignment.Center
        ) {
            ChartSettingsView(viewModel = viewModel)
        }
        Box(
            modifier = Modifier.weight(0.4f),
            contentAlignment = Alignment.Center
        ) {
            AlchemyResultsView(viewModel = viewModel)
        }
        Box(
            modifier = Modifier.weight(0.1f),
            contentAlignment = Alignment.Center
        ) {
            AddAlchemyResultButton(viewModel = viewModel)
        }
    }
}

@Composable
private fun BarChartView(
    viewModel: AlchemyStatisticsViewModel
) {
    val alchemyResultSlotsQuantity = viewModel.viewState.value.alchemyResultSlotsQuantity
    val maxRange = if (alchemyResultSlotsQuantity.isEmpty()) 0 else alchemyResultSlotsQuantity.max()
    val stepSize = if (maxRange == 0) 1 else if (maxRange < 5) maxRange else 4

    val quantityString = stringResource(id = R.string.quantity)
    val slotString = stringResource(id = R.string.slot)

    val barData = mutableListOf<BarData>()
    for (index in 0..6) {
        if (index == 0 || index == 6) {
            barData.add(
                BarData(
                    Point(
                        x = index.toFloat(),
                        y = 0f,
                    ),
                    color = Color.Transparent,
                    label = ""
                )
            )
        } else {
            barData.add(
                BarData(
                    Point(
                        x = index.toFloat(),
                        y = if (alchemyResultSlotsQuantity.isEmpty()) 0f
                        else if (alchemyResultSlotsQuantity.size < index ) 0f
                        else alchemyResultSlotsQuantity[index-1].toFloat(),
                    ),
                    color =
                    when (index) {
                        1 -> Color.DarkGray
                        2 -> Color.Blue
                        3 -> Color.Magenta
                        4 -> Color.Green
                        5 -> Color.Red
                        else -> Color.Transparent
                    },
                    label = "$slotString $index",
                )
            )
        }
    }

    val xAxisData = AxisData.Builder()
        .steps(barData.size)
        .startDrawPadding(0.dp)
        .labelData { index -> barData[index].label }
        .bottomPadding(8.dp)
        .build()

    val yAxisData = AxisData.Builder()
        .steps(1)
        .topPadding(32.dp)
        .backgroundColor(Color.White)
        .axisOffset(
            if (maxRange < 100) 12.dp
            else if (maxRange < 1000) 16.dp
            else if (maxRange < 10000) 24.dp
            else if (maxRange < 100000) 32.dp
            else 40.dp
        )
        .labelData { index -> if (maxRange == 0) "$index" else (index * maxRange).toString() }
        .build()

    val barChartData = BarChartData(
        chartData = barData,
        xAxisData = xAxisData,
        yAxisData = yAxisData,
        paddingEnd = 0.dp,
        barStyle = BarStyle(
            paddingBetweenBars = 24.dp,
            selectionHighlightData = SelectionHighlightData(
                highlightTextBackgroundColor = Color.Transparent,
                popUpLabel = { _, y -> "$quantityString${y.toInt()}" }
            )
        )
    )
    BarChart(
        modifier = Modifier.fillMaxSize(),
        barChartData = barChartData,
    )
}

@Composable
private fun ChartSettingsView(
    viewModel: AlchemyStatisticsViewModel
) {

    Column(modifier = Modifier) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .padding(0.dp)
                .fillMaxWidth()
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
            ) {
                RadioButton(
                    modifier = Modifier
                        .size(32.dp),
                    selected = viewModel.viewState.value.chartOption == ChartOptions.SHOW_ALL_SLOTS,
                    onClick = {
                        viewModel.setEvent(
                            event = AlchemyStatisticsScreenEvent.SELECT_CHART_OPTION,
                            data = ChartOptions.SHOW_ALL_SLOTS
                        )
                    },
                    colors = RadioButtonDefaults.colors(
                        selectedColor = Color.Cyan,
                        unselectedColor = Color.Gray,
                    )
                )
                Text(
                    text = "Statistics for all slots",
                    fontSize = 12.sp
                )
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
            ) {
                RadioButton(
                    modifier = Modifier
                        .size(32.dp),
                    selected = viewModel.viewState.value.chartOption == ChartOptions.SHOW_SLOTS_FOR_GLOW,
                    onClick = {
                        viewModel.setEvent(
                            event = AlchemyStatisticsScreenEvent.SELECT_CHART_OPTION,
                            data = ChartOptions.SHOW_SLOTS_FOR_GLOW
                        )
                    },
                    colors = RadioButtonDefaults.colors(
                        selectedColor = Color.Cyan,
                        unselectedColor = Color.Gray,
                    )
                )
                Text(
                    text = "Statistics for glow color",
                    fontSize = 12.sp
                )
            }
        }
        if (viewModel.viewState.value.chartOption == ChartOptions.SHOW_SLOTS_FOR_GLOW) {
            VerticalSpacing(spacing = 8)
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .padding(0.dp)
                    .fillMaxWidth()
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    RadioButton(
                        modifier = Modifier
                            .size(32.dp),
                        selected = viewModel.viewState.value.glowColor == GlowColors.GRAY,
                        onClick = {
                            viewModel.setEvent(
                                event = AlchemyStatisticsScreenEvent.SELECT_GLOW_COLOR_OPTION,
                                data = GlowColors.GRAY
                            )
                        },
                        colors = RadioButtonDefaults.colors(
                            selectedColor = Color.Cyan,
                            unselectedColor = Color.Gray,
                        )
                    )
                    Text(
                        text = stringResource(id = R.string.gray_glow),
                        fontSize = 12.sp
                    )
                }
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    RadioButton(
                        modifier = Modifier
                            .size(32.dp),
                        selected = viewModel.viewState.value.glowColor == GlowColors.BLUE,
                        onClick = {
                            viewModel.setEvent(
                                event = AlchemyStatisticsScreenEvent.SELECT_GLOW_COLOR_OPTION,
                                data = GlowColors.BLUE
                            )
                        },
                        colors = RadioButtonDefaults.colors(
                            selectedColor = Color.Cyan,
                            unselectedColor = Color.Gray,
                        )
                    )
                    Text(
                        text = stringResource(id = R.string.blue_glow),
                        fontSize = 12.sp
                    )
                }
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    RadioButton(
                        modifier = Modifier
                            .size(32.dp),
                        selected = viewModel.viewState.value.glowColor == GlowColors.GOLDEN,
                        onClick = {
                            viewModel.setEvent(
                                event = AlchemyStatisticsScreenEvent.SELECT_GLOW_COLOR_OPTION,
                                data = GlowColors.GOLDEN
                            )
                        },
                        colors = RadioButtonDefaults.colors(
                            selectedColor = Color.Cyan,
                            unselectedColor = Color.Gray,
                        )
                    )
                    Text(
                        text = stringResource(id = R.string.golden_glow),
                        fontSize = 12.sp
                    )
                }
                VerticalSpacing(spacing = 8)
            }
        }
    }
}


@Composable
private fun AlchemyResultsView(
    viewModel: AlchemyStatisticsViewModel
) {
    val alchemyResults = viewModel.viewState.value.alchemyResults.reversed()

    LazyColumn(
        state = rememberLazyListState(initialFirstVisibleItemIndex = 0),
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        items(alchemyResults) { alchemyResultItem ->
            AlchemyResultItemView(
                viewModel = viewModel,
                alchemyResultModel = alchemyResultItem
            )
        }
    }
}

@Composable
private fun AlchemyResultItemView(
    viewModel: AlchemyStatisticsViewModel,
    alchemyResultModel: AlchemyResultModel,
) {
    Card(
        modifier = Modifier.padding(bottom = 8.dp),
        colors = CardColors(
            containerColor =
            when (alchemyResultModel.alchemyGlowColor) {
                GRAY_GLOW_COLOR -> Color.LightGray
                BLUE_GLOW_COLOR -> Blue
                GOLDEN_GLOW_COLOR -> Golden
                else -> Color.LightGray
            },
            contentColor = Color.DarkGray,
            disabledContainerColor = Color.LightGray,
            disabledContentColor = Color.DarkGray,
        ),

        ) {
        Row(
            modifier = Modifier
                .padding(start = 16.dp)
                .fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = alchemyResultModel.alchemyInsertDate,
                fontSize = 14.sp,
            )
            Text(
                text = "Slot - ${alchemyResultModel.alchemySlotIndex}",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
            IconButton(
                onClick = {
                    viewModel.setEvent(
                        event = AlchemyStatisticsScreenEvent.DELETE_ALCHEMY_RESULT,
                        data = alchemyResultModel
                    )
                },
            ) {
                Icon(
                    imageVector = Icons.Default.Delete,
                    contentDescription = null,
                    modifier = Modifier
                        .padding(0.dp)
                        .size(24.dp),
                    tint = Color.Red
                )
            }
        }
    }
}

@Composable
private fun AddAlchemyResultButton(
    viewModel: AlchemyStatisticsViewModel
) {
    Row(
        modifier = Modifier
    ) {
        Box(
            modifier = Modifier
                .weight(0.2f)
        )
        ElevatedButton(
            onClick = {
                viewModel.setEvent(
                    event = AlchemyStatisticsScreenEvent.SHOW_BOTTOM_SHEET,
                    data = null,
                )
            },
            colors = ButtonDefaults.elevatedButtonColors(
                containerColor = Color.Cyan
            ),
            modifier = Modifier
                .weight(0.6f)
        )
        {
            Text(
                text = stringResource(id = R.string.add_alchemy_result).uppercase(),
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                color = Color.DarkGray,
                modifier = Modifier.padding(vertical = 4.dp)
            )
        }
        Box(
            modifier = Modifier
                .weight(0.2f)
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun AddAlchemyResultBottomSheet(
    viewModel: AlchemyStatisticsViewModel
) {
    ModalBottomSheet(
        onDismissRequest = {
            viewModel.setEvent(
                event = AlchemyStatisticsScreenEvent.HIDE_BOTTOM_SHEET,
                data = null,
            )
        },
        containerColor = Grey700,
        sheetState = rememberModalBottomSheetState(skipPartiallyExpanded = true),
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(8.dp)
                .fillMaxSize()
        )
        {
            Text(
                text = "Select the slot index",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color.LightGray,
                modifier = Modifier.padding(bottom = 24.dp)
            )
            Row(
                modifier = Modifier.padding(bottom = 48.dp)
            ) {
                for (index in 0..4) {
                    HorizontalSpacing(spacing = 8)
                    SlotIndexButton(
                        viewModel = viewModel,
                        index = when(index+1) {
                            1 -> FIRST_SLOT_INDEX
                            2 -> SECOND_SLOT_INDEX
                            3 -> THIRD_SLOT_INDEX
                            4 -> FOURTH_SLOT_INDEX
                            5 -> FIFTH_SLOT_INDEX
                            else -> FIRST_SLOT_INDEX
                        }
                    )
                    HorizontalSpacing(spacing = 8)
                }
            }
            Text(
                text = "Select glow color",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color.LightGray,
                modifier = Modifier.padding(bottom = 24.dp)
            )
            Row(
                modifier = Modifier.padding(bottom = 64.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                for (index in 0..2) {
                    HorizontalSpacing(spacing = 32)
                    GlowColorButton(
                        viewModel = viewModel,
                        glowColor = when (index) {
                            0 -> GRAY_GLOW_COLOR
                            1 -> BLUE_GLOW_COLOR
                            2 -> GOLDEN_GLOW_COLOR
                            else -> GRAY_GLOW_COLOR
                        }
                    )
                    HorizontalSpacing(spacing = 32)
                }
            }
            SaveAlchemyResultButton(viewModel = viewModel)
        }
    }

}

@Composable
private fun SlotIndexButton(
    viewModel: AlchemyStatisticsViewModel,
    index: String,
) {
    OutlinedButton(
        onClick = {
            viewModel.setEvent(
                event = AlchemyStatisticsScreenEvent.SELECT_SLOT_INDEX,
                data = index,
            )
        },
        modifier = Modifier
            .size(48.dp),
        shape = CircleShape,
        contentPadding = PaddingValues(0.dp),
        colors = outlinedButtonColors(
            containerColor = Color.Transparent,
            contentColor = Color.LightGray,
        ),
        border = BorderStroke(
            width = 1.dp,
            color = if (viewModel.viewState.value.selectedSlotIndex == index) Color.Red else Color.LightGray
        )
    ) {
        Text(
            text = index,
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
private fun GlowColorButton(
    viewModel: AlchemyStatisticsViewModel,
    glowColor: String,
) {
    OutlinedButton(
        onClick = {
            viewModel.setEvent(
                event = AlchemyStatisticsScreenEvent.SELECT_GLOW_COLOR,
                data = glowColor,
            )
        },
        modifier = Modifier
            .size(48.dp),
        shape = CircleShape,
        contentPadding = PaddingValues(0.dp),
        colors = outlinedButtonColors(
            containerColor =
            when (glowColor) {
                GRAY_GLOW_COLOR -> Color.LightGray
                BLUE_GLOW_COLOR -> Blue
                GOLDEN_GLOW_COLOR -> Golden
                else -> Color.LightGray
            },
        ),
        border = BorderStroke(
            width = 1.dp,
            color = if (viewModel.viewState.value.selectedGlowColor == glowColor) Color.Red else Color.Transparent
        )
    ) {}
}

@Composable
private fun SaveAlchemyResultButton(
    viewModel: AlchemyStatisticsViewModel
) {
    Row(
        modifier = Modifier
    ) {
        Box(
            modifier = Modifier
                .weight(0.2f)
        )
        ElevatedButton(
            onClick = {
                viewModel.setEvent(
                    event = AlchemyStatisticsScreenEvent.SAVE_ALCHEMY_RESULT,
                    data = null
                )
            },
            colors = ButtonDefaults.elevatedButtonColors(
                containerColor = Color.Cyan
            ),
            modifier = Modifier
                .weight(0.6f)
        )
        {
            Text(
                text = stringResource(id = R.string.save_alchemy_result).uppercase(),
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                color = Color.DarkGray,
                modifier = Modifier.padding(vertical = 4.dp)
            )
        }
        Box(
            modifier = Modifier
                .weight(0.2f)
        )
    }
}