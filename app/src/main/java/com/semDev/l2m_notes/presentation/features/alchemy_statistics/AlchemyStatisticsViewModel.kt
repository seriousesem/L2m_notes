package com.semDev.l2m_notes.presentation.features.alchemy_statistics

import android.content.Context
import android.widget.Toast
import androidx.lifecycle.viewModelScope
import com.semDev.l2m_notes.domain.core.AppResult
import com.semDev.l2m_notes.domain.model.alchemy_statistics.AlchemyResultModel
import com.semDev.l2m_notes.domain.repository.AlchemyStatisticsRepository
import com.semDev.l2m_notes.presentation.core.BaseViewModel
import com.semDev.l2m_notes.utils.AlchemyGlowColors.BLUE_GLOW_COLOR
import com.semDev.l2m_notes.utils.AlchemyGlowColors.GOLDEN_GLOW_COLOR
import com.semDev.l2m_notes.utils.AlchemyGlowColors.GRAY_GLOW_COLOR
import com.semDev.l2m_notes.utils.AlchemySlotIndexes
import com.semDev.l2m_notes.utils.MapKeys.CONTEXT_KEY
import com.semDev.l2m_notes.utils.MapKeys.MESSAGE_KEY
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import javax.inject.Inject

@HiltViewModel
class AlchemyStatisticsViewModel @Inject constructor(
    private val repository: AlchemyStatisticsRepository
) : BaseViewModel<AlchemyStatisticsScreenEvent, AlchemyStatisticsScreenState>() {

    init {
        showLoading()
        fetchAllAlchemyResults()
    }

    override fun setInitialState(): AlchemyStatisticsScreenState {
        return AlchemyStatisticsScreenState(
            isLoading = false,
            isShowBottomSheet = false,
            errorMessage = null,
            alchemyResults = listOf(),
            alchemyResultSlotsQuantity = listOf(),
            chartOption = ChartOptions.SHOW_ALL_SLOTS,
            glowColor = GlowColors.GRAY,
            selectedSlotIndex = AlchemySlotIndexes.FIRST_SLOT_INDEX,
            selectedGlowColor = GRAY_GLOW_COLOR
        )
    }

    override fun <T> setEvent(event: AlchemyStatisticsScreenEvent, data: T) {
        when (event) {
            AlchemyStatisticsScreenEvent.SHOW_SHORT_TOAST -> {
                val dataMap = data as Map<*, *>
                val context = dataMap[CONTEXT_KEY] as Context
                val message = dataMap[MESSAGE_KEY] as Int
                Toast.makeText(context, context.getText(message), Toast.LENGTH_SHORT).show()
            }

            AlchemyStatisticsScreenEvent.SELECT_CHART_OPTION -> {
                val chartOption = data as ChartOptions
                val alchemyResultSlotsQuantity =
                    getAlchemyResultSlotsQuantity(
                        allAlchemyResults = viewState.value.alchemyResults,
                        chartOption = chartOption,
                        glowColor = viewState.value.glowColor
                    )
                setState {
                    copy(
                        isLoading = this.isLoading,
                        isShowBottomSheet = this.isShowBottomSheet,
                        errorMessage = this.errorMessage,
                        alchemyResults = this.alchemyResults,
                        alchemyResultSlotsQuantity = alchemyResultSlotsQuantity,
                        chartOption = chartOption,
                        glowColor = this.glowColor,
                        selectedSlotIndex = this.selectedSlotIndex,
                        selectedGlowColor = this.selectedGlowColor
                    )
                }
            }

            AlchemyStatisticsScreenEvent.SELECT_GLOW_COLOR_OPTION -> {
                val glowColor = data as GlowColors
                val alchemyResultSlotsQuantity =
                    getAlchemyResultSlotsQuantity(
                        allAlchemyResults = viewState.value.alchemyResults,
                        chartOption = viewState.value.chartOption,
                        glowColor = glowColor
                    )
                setState {
                    copy(
                        isLoading = this.isLoading,
                        isShowBottomSheet = this.isShowBottomSheet,
                        errorMessage = this.errorMessage,
                        alchemyResults = this.alchemyResults,
                        alchemyResultSlotsQuantity = alchemyResultSlotsQuantity,
                        chartOption = this.chartOption,
                        glowColor = glowColor,
                        selectedSlotIndex = this.selectedSlotIndex,
                        selectedGlowColor = this.selectedGlowColor
                    )
                }
            }

            AlchemyStatisticsScreenEvent.SHOW_BOTTOM_SHEET -> {
                showBottomSheet()
            }

            AlchemyStatisticsScreenEvent.HIDE_BOTTOM_SHEET -> {
                hideBottomSheet()
            }

            AlchemyStatisticsScreenEvent.HIDE_ERROR_DIALOG -> {
                hideErrorDialog()
                fetchAllAlchemyResults()
            }

            AlchemyStatisticsScreenEvent.DELETE_ALCHEMY_RESULT -> {
                val alchemyResultModel = data as AlchemyResultModel
                deleteAlchemyResult(alchemyResultModel = alchemyResultModel)
            }

            AlchemyStatisticsScreenEvent.SELECT_SLOT_INDEX -> {
                val selectedSlotIndex = data as String
                setState {
                    copy(
                        isLoading = this.isLoading,
                        isShowBottomSheet = this.isShowBottomSheet,
                        errorMessage = null,
                        alchemyResults = this.alchemyResults,
                        alchemyResultSlotsQuantity = this.alchemyResultSlotsQuantity,
                        chartOption = this.chartOption,
                        glowColor = this.glowColor,
                        selectedSlotIndex = selectedSlotIndex,
                        selectedGlowColor = this.selectedGlowColor
                    )
                }
            }

            AlchemyStatisticsScreenEvent.SELECT_GLOW_COLOR -> {
                val selectedGlowColor = data as String
                setState {
                    copy(
                        isLoading = this.isLoading,
                        isShowBottomSheet = this.isShowBottomSheet,
                        errorMessage = null,
                        alchemyResults = this.alchemyResults,
                        alchemyResultSlotsQuantity = this.alchemyResultSlotsQuantity,
                        chartOption = this.chartOption,
                        glowColor = this.glowColor,
                        selectedSlotIndex = this.selectedSlotIndex,
                        selectedGlowColor = selectedGlowColor
                    )
                }
            }

            AlchemyStatisticsScreenEvent.SAVE_ALCHEMY_RESULT -> {
                val currentDate = LocalDateTime.now()
                val formatter: DateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")
                val formattedDate: String = currentDate.format(formatter)
                val alchemyResultModel = AlchemyResultModel(
                    id = null,
                    alchemySlotIndex = viewState.value.selectedSlotIndex,
                    alchemyGlowColor = viewState.value.selectedGlowColor,
                    alchemyInsertDate = formattedDate
                )
                saveAlchemyResult(alchemyResultModel = alchemyResultModel)
            }
        }

    }

    private fun showLoading() {
        setState {
            copy(
                isLoading = true,
                isShowBottomSheet = this.isShowBottomSheet,
                errorMessage = this.errorMessage,
                alchemyResults = this.alchemyResults,
                alchemyResultSlotsQuantity = this.alchemyResultSlotsQuantity,
                chartOption = this.chartOption,
                glowColor = this.glowColor,
                selectedSlotIndex = this.selectedSlotIndex,
                selectedGlowColor = this.selectedGlowColor
            )
        }
    }

    private fun showBottomSheet() {
        setState {
            copy(
                isLoading = this.isLoading,
                isShowBottomSheet = true,
                errorMessage = this.errorMessage,
                alchemyResults = this.alchemyResults,
                alchemyResultSlotsQuantity = this.alchemyResultSlotsQuantity,
                chartOption = this.chartOption,
                glowColor = this.glowColor,
                selectedSlotIndex = this.selectedSlotIndex,
                selectedGlowColor = this.selectedGlowColor
            )
        }
    }

    private fun hideBottomSheet() {
        setState {
            copy(
                isLoading = this.isLoading,
                isShowBottomSheet = false,
                errorMessage = this.errorMessage,
                alchemyResults = this.alchemyResults,
                alchemyResultSlotsQuantity = this.alchemyResultSlotsQuantity,
                chartOption = this.chartOption,
                glowColor = this.glowColor,
                selectedSlotIndex = this.selectedSlotIndex,
                selectedGlowColor = this.selectedGlowColor
            )
        }
    }

    private fun showErrorDialog(errorMessage: String?) {
        setState {
            copy(
                isLoading = this.isLoading,
                isShowBottomSheet = false,
                errorMessage = errorMessage,
                alchemyResults = this.alchemyResults,
                alchemyResultSlotsQuantity = this.alchemyResultSlotsQuantity,
                chartOption = this.chartOption,
                glowColor = this.glowColor,
                selectedSlotIndex = this.selectedSlotIndex,
                selectedGlowColor = this.selectedGlowColor
            )
        }
    }

    private fun hideErrorDialog() {
        setState {
            copy(
                isLoading = this.isLoading,
                isShowBottomSheet = false,
                errorMessage = null,
                alchemyResults = this.alchemyResults,
                alchemyResultSlotsQuantity = this.alchemyResultSlotsQuantity,
                chartOption = this.chartOption,
                glowColor = this.glowColor,
                selectedSlotIndex = this.selectedSlotIndex,
                selectedGlowColor = this.selectedGlowColor
            )
        }
    }

    private fun fetchAllAlchemyResults() {
        try {
            viewModelScope.launch {
                try {
                    when (val responseResult = repository.fetchAlchemyResults()) {
                        is AppResult.Success -> {
                            val allAlchemyResults = responseResult.data
                            allAlchemyResults?.let {
                                val alchemyResultSlotsQuantity =
                                    getAlchemyResultSlotsQuantity(
                                        allAlchemyResults = allAlchemyResults,
                                        chartOption = viewState.value.chartOption,
                                        glowColor = viewState.value.glowColor
                                    )
                                setState {
                                    copy(
                                        isLoading = false,
                                        isShowBottomSheet = false,
                                        errorMessage = this.errorMessage,
                                        alchemyResults = allAlchemyResults,
                                        alchemyResultSlotsQuantity = alchemyResultSlotsQuantity,
                                        chartOption = this.chartOption,
                                        glowColor = this.glowColor,
                                        selectedSlotIndex = this.selectedSlotIndex,
                                        selectedGlowColor = this.selectedGlowColor
                                    )
                                }
                            }
                        }

                        is AppResult.Error -> {
                            showErrorDialog(responseResult.message)
                        }
                    }
                } catch (e: Exception) {
                    showErrorDialog(e.message)
                }
            }
        } catch (e: Exception) {
            showErrorDialog(e.message)
        }
    }
private fun getAlchemyResultSlotsQuantity(
    allAlchemyResults: List<AlchemyResultModel>,
    chartOption: ChartOptions,
    glowColor: GlowColors
): List<Int> {
    val glowColorString = when (glowColor) {
        GlowColors.GRAY -> GRAY_GLOW_COLOR
        GlowColors.BLUE -> BLUE_GLOW_COLOR
        GlowColors.GOLDEN -> GOLDEN_GLOW_COLOR
    }
    val groupedResults = when (chartOption) {
        ChartOptions.SHOW_SLOTS_FOR_GLOW -> {
            allAlchemyResults
                .filter { it.alchemyGlowColor == glowColorString }
                .groupBy { it.alchemySlotIndex}
        }
        else -> {
            allAlchemyResults.groupBy { it.alchemySlotIndex }
        }
    }
    val slotQuantities = (1..5).map { index ->
        groupedResults[index.toString()]?.size ?: 0
    }
    return slotQuantities
}


    private fun deleteAlchemyResult(alchemyResultModel: AlchemyResultModel) {
        try {
            viewModelScope.launch {
                try {
                    when (val responseResult =
                        repository.deleteAlchemyResult(alchemyResultModel = alchemyResultModel)) {
                        is AppResult.Success -> {
                            fetchAllAlchemyResults()
                        }

                        is AppResult.Error -> {
                            showErrorDialog(responseResult.message)
                        }
                    }
                } catch (e: Exception) {
                    showErrorDialog(e.message)
                }
            }
        } catch (e: Exception) {
            showErrorDialog(e.message)
        }
    }

    private fun saveAlchemyResult(alchemyResultModel: AlchemyResultModel) {
        try {
            viewModelScope.launch {
                try {
                    when (val responseResult =
                        repository.saveAlchemyResult(alchemyResultModel = alchemyResultModel)) {
                        is AppResult.Success -> {
                            fetchAllAlchemyResults()
                        }

                        is AppResult.Error -> {
                            showErrorDialog(responseResult.message)
                        }
                    }
                } catch (e: Exception) {
                    showErrorDialog(e.message)
                }
            }
        } catch (e: Exception) {
            showErrorDialog(e.message)
        }
    }


}