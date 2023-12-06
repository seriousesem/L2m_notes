package com.semDev.l2m.notes.presentation.screens.alchemy_statistics

import android.content.Context
import android.widget.Toast
import androidx.lifecycle.viewModelScope
import com.semDev.l2m.notes.core.BaseViewModel
import com.semDev.l2m.notes.core.UiEvent
import com.semDev.l2m.notes.domain.alchemy.repository.AlchemyStatisticsRepository
import com.semDev.l2m.notes.utils.MapKeys.CONTEXT_KEY
import com.semDev.l2m.notes.utils.MapKeys.MESSAGE_KEY
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AlchemyStatisticsViewModel @Inject constructor(
    private val repository: AlchemyStatisticsRepository
) : BaseViewModel<AlchemyStatisticsScreenEvent, AlchemyStatisticsScreenState>() {

    private val _uiEvent = Channel<UiEvent>()

    init {
        setState {
            copy(
                isLoading = false,
            )
        }
    }

    override fun setInitialState(): AlchemyStatisticsScreenState {
        return AlchemyStatisticsScreenState(
            isLoading = true,
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
        }
    }

    override fun sendUiEvent(event: UiEvent) {
        viewModelScope.launch {
            _uiEvent.send(event)
        }
    }

}