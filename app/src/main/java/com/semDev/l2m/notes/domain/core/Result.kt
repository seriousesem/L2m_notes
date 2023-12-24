package com.semDev.l2m.notes.domain.core
sealed class AppResult<T>(val data: T? = null, val message: String? = null) {
    class Success<T>(data: T?) : AppResult<T>(data)
    class Error<T>(message: String, data: T? = null) : AppResult<T>(data, message)
}
