package com.semDev.l2m_notes.domain.repository

import com.semDev.l2m_notes.domain.core.AppResult
import com.semDev.l2m_notes.domain.model.account.User
import kotlinx.coroutines.flow.Flow

interface AuthRepository {
    val currentUser: AppResult<Flow<User?>>

    val currentUserId: AppResult<String>
    fun hasUser(): AppResult<Boolean>
    suspend fun login(email: String, password: String): AppResult<Boolean>
    suspend fun createAccount(email: String, password: String): AppResult<Boolean>
    suspend fun logout(): AppResult<Boolean>
    suspend fun deleteAccount(): AppResult<Boolean>
}