package com.semDev.l2m_notes.domain.repository

import com.semDev.l2m_notes.domain.model.account.User
import kotlinx.coroutines.flow.Flow

interface AuthRepository {
    val currentUser: Flow<User?>

    val currentUserId: String
    fun hasUser(): Boolean
    suspend fun login(email: String, password: String)
    suspend fun createAccount(email: String, password: String)
    suspend fun logout()
    suspend fun deleteAccount()
}