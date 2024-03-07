package com.semDev.l2m_wiki.presentation.features.alchemy_statistics

import android.content.Context
import android.content.res.Resources
import android.widget.Toast
import com.semDev.l2m_wiki.R
import com.semDev.l2m_wiki.domain.core.AppResult
import com.semDev.l2m_wiki.domain.model.alchemy_statistics.AlchemyResultModel
import com.semDev.l2m_wiki.domain.repository.AlchemyStatisticsRepository
import com.semDev.l2m_wiki.presentation.core.BaseViewModel
import com.semDev.l2m_wiki.utils.AlchemyGlowColors.BLUE_GLOW_COLOR
import com.semDev.l2m_wiki.utils.AlchemyGlowColors.GOLDEN_GLOW_COLOR
import com.semDev.l2m_wiki.utils.AlchemyGlowColors.GRAY_GLOW_COLOR
import com.semDev.l2m_wiki.utils.AlchemySlotIndexes
import com.semDev.l2m_wiki.utils.MapKeys.CONTEXT_KEY
import com.semDev.l2m_wiki.utils.MapKeys.MESSAGE_KEY
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import javax.inject.Inject

@HiltViewModel
class AlchemyStatisticsViewModel @Inject constructor(
    private val repository: AlchemyStatisticsRepository,
    private val resources: Resources,
) : BaseViewModel<AlchemyStatisticsScreenEvent, AlchemyStatisticsScreenState>() {

    init {
        showLoading()
        fetchAllAlchemyResults()
    }

    override fun setInitialState(): AlchemyStatisticsScreenState {
        return AlchemyStatisticsScreenState(
            isLoading = false,
            isShowBottomSheet = false,
            isShowWarningDialog = false,
            errorMessage = null,
            alchemyResults = listOf(),
            alchemyResultSlotsQuantity = listOf(),
            chartOption = ChartOptions.SHOW_ALL_SLOTS,
            glowColor = GlowColors.GRAY,
            selectedSlotIndex = AlchemySlotIndexes.FIRST_SLOT_INDEX,
            selectedGlowColor = GRAY_GLOW_COLOR,
            selectedAlchemyResultModel = null,
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
                        alchemyResultSlotsQuantity = alchemyResultSlotsQuantity,
                        chartOption = chartOption,
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
                        alchemyResultSlotsQuantity = alchemyResultSlotsQuantity,
                        glowColor = glowColor,
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
                showLoading()
                deleteAlchemyResult()
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
                val formatter: DateTimeFormatter =
                    DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")
                val formattedDate: String = currentDate.format(formatter)
                val alchemyResultModel = AlchemyResultModel(
                    id = null,
                    alchemySlotIndex = viewState.value.selectedSlotIndex,
                    alchemyGlowColor = viewState.value.selectedGlowColor,
                    alchemyInsertDate = formattedDate
                )
                hideBottomSheet()
                showLoading()
                saveAlchemyResult(alchemyResultModel = alchemyResultModel)
            }

            AlchemyStatisticsScreenEvent.SHOW_WARNING_DIALOG -> {
                val alchemyResultModel = data as AlchemyResultModel
                showWarningDialog(alchemyResultModel = alchemyResultModel)
            }

            AlchemyStatisticsScreenEvent.HIDE_WARNING_DIALOG -> {
                hideWarningDialog()
            }
        }

    }

    private fun showLoading() {
        setState {
            copy(
                isLoading = true,
            )
        }
    }

    private fun hideLoading() {
        setState {
            copy(
                isLoading = false,
            )
        }
    }

    private fun showWarningDialog(alchemyResultModel: AlchemyResultModel) {
        setState {
            copy(
                isShowWarningDialog = true,
                selectedAlchemyResultModel = alchemyResultModel
            )
        }
    }

    private fun hideWarningDialog() {
        setState {
            copy(
                isShowWarningDialog = false,
                selectedAlchemyResultModel = null
            )
        }
    }

    private fun showBottomSheet() {
        setState {
            copy(
                isShowBottomSheet = true,
            )
        }
    }

    private fun hideBottomSheet() {
        setState {
            copy(
                isShowBottomSheet = false,
            )
        }
    }

    private fun showErrorDialog(errorMessage: String?) {
        setState {
            copy(
                errorMessage = errorMessage,
            )
        }
    }

    private fun hideErrorDialog() {
        setState {
            copy(
                errorMessage = null,
            )
        }
    }

    private fun fetchAllAlchemyResults() {
        try {
            launchCatching {
                try {
                    delay(1000L)
                    when (val responseResult = repository.fetchAlchemyResults()) {
                        is AppResult.Success -> {
                            hideLoading()
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
                                        alchemyResults = allAlchemyResults,
                                        alchemyResultSlotsQuantity = alchemyResultSlotsQuantity,
                                    )
                                }
                            }
                        }

                        is AppResult.Error -> {
                            hideLoading()
                            showErrorDialog(responseResult.message)
                        }
                    }
                } catch (e: Exception) {
                    hideLoading()
                    showErrorDialog(e.message)
                }
            }
        } catch (e: Exception) {
            hideLoading()
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
                    .groupBy { it.alchemySlotIndex }
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


    private fun deleteAlchemyResult() {
        try {
            launchCatching {
                try {
                    delay(1000L)
                    when (val responseResult =
                        viewState.value.selectedAlchemyResultModel?.let {
                            repository.deleteAlchemyResult(
                                alchemyResultModel = it
                            )
                        }) {
                        is AppResult.Success -> {
                            hideWarningDialog()
                            fetchAllAlchemyResults()
                        }

                        is AppResult.Error -> {
                            hideLoading()
                            hideWarningDialog()
                            showErrorDialog(responseResult.message)
                        }

                        null -> {
                            hideWarningDialog()
                            showErrorDialog(resources.getString(R.string.no_item_selected))
                        }
                    }
                } catch (e: Exception) {
                    hideLoading()
                    showErrorDialog(e.message)
                }
            }
        } catch (e: Exception) {
            showErrorDialog(e.message)
        }
    }

    private fun saveAlchemyResult(alchemyResultModel: AlchemyResultModel) {
        try {
            launchCatching {
                try {
                    delay(1000L)
                    when (val responseResult =
                        repository.saveAlchemyResult(alchemyResultModel = alchemyResultModel)) {
                        is AppResult.Success -> {
                            fetchAllAlchemyResults()
                        }

                        is AppResult.Error -> {
                            hideLoading()
                            showErrorDialog(responseResult.message)
                        }
                    }
                } catch (e: Exception) {
                    hideLoading()
                    showErrorDialog(e.message)
                }
            }
        } catch (e: Exception) {
            hideLoading()
            showErrorDialog(e.message)
        }
    }


}