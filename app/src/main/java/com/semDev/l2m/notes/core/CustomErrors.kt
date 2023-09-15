package com.semDev.l2m.notes.core

sealed class CustomErrors : Exception() {
    class AppError(override val message: String) : CustomErrors()
}
