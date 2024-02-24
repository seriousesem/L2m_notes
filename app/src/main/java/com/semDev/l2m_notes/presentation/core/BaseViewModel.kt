package com.semDev.l2m_notes.presentation.core
import android.util.Log
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

interface ScreenEvent

interface ViewState

abstract class BaseViewModel<Event : ScreenEvent,  UiState : ViewState> :
    ViewModel() {

    private val initialState: UiState by lazy { setInitialState() }
    abstract fun setInitialState(): UiState

    private val _viewState: MutableState<UiState> = mutableStateOf(initialState)
    val viewState: State<UiState> = _viewState
    abstract fun <T> setEvent(event: Event, data: T)

    protected fun setState(reducer: UiState.() -> UiState) {
        val newState = viewState.value.reducer()
        _viewState.value = newState
    }

    fun launchCatching(block: suspend CoroutineScope.() -> Unit) =
        viewModelScope.launch(
            CoroutineExceptionHandler { _, throwable ->
                Log.d(ERROR_TAG, throwable.message.orEmpty())
            },
            block = block
        )

    companion object {
        const val ERROR_TAG = "NOTES APP ERROR"
    }
}