package com.semDev.l2m_wiki.presentation.features.alchemy_statistics

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.ButtonDefaults.outlinedButtonColors
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import co.yml.charts.axis.AxisData
import co.yml.charts.common.model.Point
import co.yml.charts.ui.barchart.BarChart
import co.yml.charts.ui.barchart.models.BarChartData
import co.yml.charts.ui.barchart.models.BarData
import co.yml.charts.ui.barchart.models.BarStyle
import co.yml.charts.ui.barchart.models.SelectionHighlightData
import com.semDev.l2m_wiki.R
import com.semDev.l2m_wiki.core.navigation.SETTINGS_SCREEN
import com.semDev.l2m_wiki.domain.model.alchemy_statistics.AlchemyResultModel
import com.semDev.l2m_wiki.presentation.components.AnimatedProgressIndicator
import com.semDev.l2m_wiki.presentation.components.AppElevatedButton
import com.semDev.l2m_wiki.presentation.components.AppScaffold
import com.semDev.l2m_wiki.presentation.components.BackIconButton
import com.semDev.l2m_wiki.presentation.components.ErrorDialog
import com.semDev.l2m_wiki.presentation.components.HorizontalSpacing
import com.semDev.l2m_wiki.presentation.components.SettingsIconButton
import com.semDev.l2m_wiki.presentation.components.TopBar
import com.semDev.l2m_wiki.presentation.components.VerticalSpacing
import com.semDev.l2m_wiki.presentation.components.WarningDialog
import com.semDev.l2m_wiki.presentation.theme.Blue
import com.semDev.l2m_wiki.presentation.theme.DarkBlue
import com.semDev.l2m_wiki.presentation.theme.Golden
import com.semDev.l2m_wiki.presentation.theme.Green
import com.semDev.l2m_wiki.presentation.theme.LiteBlue
import com.semDev.l2m_wiki.presentation.theme.LiteGray
import com.semDev.l2m_wiki.presentation.theme.Red
import com.semDev.l2m_wiki.presentation.theme.VeryLiteBlue
import com.semDev.l2m_wiki.presentation.theme.White
import com.semDev.l2m_wiki.utils.AlchemyGlowColors.BLUE_GLOW_COLOR
import com.semDev.l2m_wiki.utils.AlchemyGlowColors.GOLDEN_GLOW_COLOR
import com.semDev.l2m_wiki.utils.AlchemyGlowColors.GRAY_GLOW_COLOR
import com.semDev.l2m_wiki.utils.AlchemySlotIndexes.FIFTH_SLOT_INDEX
import com.semDev.l2m_wiki.utils.AlchemySlotIndexes.FIRST_SLOT_INDEX
import com.semDev.l2m_wiki.utils.AlchemySlotIndexes.FOURTH_SLOT_INDEX
import com.semDev.l2m_wiki.utils.AlchemySlotIndexes.SECOND_SLOT_INDEX
import com.semDev.l2m_wiki.utils.AlchemySlotIndexes.THIRD_SLOT_INDEX

@Composable
fun AlchemyStatisticsScreen(
    popUpScreen: () -> Unit,
    openScreen: (String) -> Unit,
    viewModel: AlchemyStatisticsViewModel = hiltViewModel()
) {
    BackHandler(onBack = {
        popUpScreen()
    })
    val state = viewModel.viewState.value
    AppScaffold(
        topBar = {TopBar(
            title = stringResource(id = R.string.alchemy_statistics_screen_title),
            navigationIcon = {
                BackIconButton(action = popUpScreen)
            },
            actionIcon = {
                SettingsIconButton(action = {
                    openScreen(SETTINGS_SCREEN)
                })
            }
        )
        },
    ) { contentPadding ->
        if (state.isLoading) {
            AnimatedProgressIndicator()
        } else if (state.errorMessage != null) {
            ErrorDialog(
                errorMessage = state.errorMessage,
                confirmButtonAction = {
                    viewModel.setEvent(
                        event = AlchemyStatisticsScreenEvent.HIDE_ERROR_DIALOG,
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
            if (state.isShowWarningDialog) {
                WarningDialogView(viewModel = viewModel)
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
                bottom = 8.dp
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
                        1 -> LiteGray
                        2 -> Green
                        3 -> DarkBlue
                        4 -> Red
                        5 -> Golden
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
        .axisLineColor(DarkBlue)
        .axisLabelColor(Blue)
        .backgroundColor(White)
        .build()

    val yAxisData = AxisData.Builder()
        .steps(1)
        .topPadding(32.dp)
        .axisLineColor(DarkBlue)
        .axisLabelColor(Blue)
        .backgroundColor(White)
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
        backgroundColor = White,
        paddingEnd = 0.dp,
        barStyle = BarStyle(
            paddingBetweenBars = 32.dp,
            selectionHighlightData = SelectionHighlightData(
                highlightTextBackgroundColor = White,
                highlightTextColor = Blue,
                highlightBarColor = Blue,
                popUpLabel = { _, y -> "$quantityString${y.toInt()} - ${((y.toDouble() / alchemyResultSlotsQuantity.sum().toDouble())*100).toInt()}%" }
            )
        )
    )
    BarChart(
        modifier = Modifier
            .fillMaxSize()
            .background(White),
        barChartData = barChartData,
    )
}

@Composable
private fun ChartSettingsView(
    viewModel: AlchemyStatisticsViewModel
) {
    Column(modifier = Modifier) {
        Row(
            horizontalArrangement = Arrangement.SpaceAround,
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
                        selectedColor = Blue,
                        unselectedColor = Blue,
                    )
                )
                Text(
                    text = stringResource(id = R.string.statistics_for_all_slots),
                    fontSize = 12.sp,
                    color = Blue
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
                        selectedColor = Blue,
                        unselectedColor = Blue,
                    )
                )
                Text(
                    text = stringResource(id = R.string.statistics_for_glow_color),
                    fontSize = 12.sp,
                    color = Blue
                )
            }
        }
        if (viewModel.viewState.value.chartOption == ChartOptions.SHOW_SLOTS_FOR_GLOW) {
            VerticalSpacing(spacing = 8)
            Row(
                horizontalArrangement = Arrangement.SpaceAround,
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
                            selectedColor = Blue,
                            unselectedColor = Blue,
                        )
                    )
                    Text(
                        text = stringResource(id = R.string.gray_glow),
                        fontSize = 12.sp,
                        color = Blue
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
                            selectedColor = Blue,
                            unselectedColor = Blue,
                        )
                    )
                    Text(
                        text = stringResource(id = R.string.blue_glow),
                        fontSize = 12.sp,
                        color = Blue
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
                            selectedColor = Blue,
                            unselectedColor = Blue,
                        )
                    )
                    Text(
                        text = stringResource(id = R.string.golden_glow),
                        fontSize = 12.sp,
                        color = Blue
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
    val alchemyResults = viewModel.viewState.value.alchemyResults

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
                GRAY_GLOW_COLOR -> LiteGray
                BLUE_GLOW_COLOR -> LiteBlue
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
                text = alchemyResultModel.alchemyInsertDate.take(10),
                fontSize = 14.sp,
                color = Blue
            )
            Text(
                text = "${stringResource(id = R.string.slot)} - ${alchemyResultModel.alchemySlotIndex}",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                color = Blue
            )
            IconButton(
                onClick = {
                    viewModel.setEvent(
                        event = AlchemyStatisticsScreenEvent.SHOW_WARNING_DIALOG,
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
                    tint = Red
                )
            }
        }
    }
}

@Composable
private fun AddAlchemyResultButton(
    viewModel: AlchemyStatisticsViewModel
) {
    AppElevatedButton(
        modifier = Modifier,
        label = stringResource(id = R.string.add_alchemy_result).uppercase(),
        enabled = true,
        buttonAction = {
            viewModel.setEvent(
                event = AlchemyStatisticsScreenEvent.SHOW_BOTTOM_SHEET,
                data = null,
            )
        }
    )
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
        containerColor = VeryLiteBlue,
        sheetState = rememberModalBottomSheetState(skipPartiallyExpanded = true),
        modifier = Modifier,
        scrimColor = Color.Transparent.copy(alpha = 0.8f)
    ) {
        Column(
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(8.dp)
        )
        {
            Text(
                text = stringResource(id = R.string.select_slot_index),
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Blue,
                modifier = Modifier.padding(bottom = 24.dp)
            )
            Row(
                modifier = Modifier.padding(bottom = 32.dp)
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
                text = stringResource(id = R.string.select_glow_color),
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Blue,
                modifier = Modifier.padding(bottom = 24.dp)
            )
            Row(
                modifier = Modifier.padding(bottom = 32.dp),
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
            VerticalSpacing(spacing = 40)
        }
    }

}


@Composable
private fun WarningDialogView(
    viewModel: AlchemyStatisticsViewModel
) {
    WarningDialog(
        message = stringResource(id = R.string.delete_item),
        confirmButtonAction = {
            viewModel.setEvent(
                event = AlchemyStatisticsScreenEvent.DELETE_ALCHEMY_RESULT,
                data = null,
            )
        },
        dismissButtonAction = {
            viewModel.setEvent(
                event = AlchemyStatisticsScreenEvent.HIDE_WARNING_DIALOG,
                data = null
            )
        }
    )
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
            contentColor = Blue,
        ),
        border = BorderStroke(
            width = 1.dp,
            color = if (viewModel.viewState.value.selectedSlotIndex == index) Color.Red else Blue
        )
    ) {
        Text(
            text = index,
            fontSize = 24.sp,
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
                GRAY_GLOW_COLOR -> LiteGray
                BLUE_GLOW_COLOR -> LiteBlue
                GOLDEN_GLOW_COLOR -> Golden
                else -> LiteGray
            },
        ),
        border = BorderStroke(
            width = 1.dp,
            color = if (viewModel.viewState.value.selectedGlowColor == glowColor) Color.Red else Blue
        )
    ) {}
}

@Composable
private fun SaveAlchemyResultButton(
    viewModel: AlchemyStatisticsViewModel
) {
    AppElevatedButton(
        modifier = Modifier,
        label = stringResource(id = R.string.save_alchemy_result).uppercase(),
        enabled = true,
        buttonAction = {
            viewModel.setEvent(
                event = AlchemyStatisticsScreenEvent.SAVE_ALCHEMY_RESULT,
                data = null
            )
        }
    )
}