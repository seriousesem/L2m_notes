package com.semDev.l2m_wiki.data.repository

import com.semDev.l2m_wiki.data.service.AuthService
import com.semDev.l2m_wiki.domain.core.AppResult
import com.semDev.l2m_wiki.domain.model.account.User
import com.semDev.l2m_wiki.domain.repository.AuthRepository
import kotlinx.coroutines.flow.Flow

class AuthRepositoryImpl(
    private val authService: AuthService
) : AuthRepository {
    override val currentUser: AppResult<Flow<User?>>
        get() = try {
            val user = authService.currentUser
            AppResult.Success(data = user)
        } catch (e: Exception) {
            AppResult.Error(message = e.message ?: "Get current user failed")
        }

    override val currentUserId: AppResult<String>
        get() = try {
            val userId = authService.currentUserId
            AppResult.Success(data = userId)
        } catch (e: Exception) {
            AppResult.Error(message = e.message ?: "Get current user id failed")
        }

    override fun hasUser(): AppResult<Boolean> {
        return try {
            val hasUser = authService.hasUser()
            AppResult.Success(data = hasUser)
        } catch (e: Exception) {
            AppResult.Error(message = e.message ?: "Has user failed")
        }

    }

    override suspend fun login(email: String, password: String): AppResult<Boolean> {
        return try {
            authService.login(email = email, password = password)
            AppResult.Success(data = true)
        } catch (e: Exception) {
            AppResult.Error(message = e.message ?: "Login is failed")
        }
    }

    override suspend fun createAccount(email: String, password: String): AppResult<Boolean> {
        return try {
            authService.createAccount(email = email, password = password)
            AppResult.Success(data = true)
        } catch (e: Exception) {
            AppResult.Error(message = e.message ?: "Create account is failed")
        }
    }

    override suspend fun resetPassword(email: String): AppResult<Boolean> {
        return try {
            authService.resetPassword(email = email)
            AppResult.Success(data = true)
        } catch (e: Exception) {
            AppResult.Error(message = e.message ?: "Reset password is failed")
        }
    }

    override suspend fun logout(): AppResult<Boolean> {
        return try {
            authService.logout()
            AppResult.Success(data = true)
        } catch (e: Exception) {
            AppResult.Error(message = e.message ?: "Logout is failed")
        }
    }

    override suspend fun deleteAccount(): AppResult<Boolean> {
        return try {
            authService.deleteAccount()
            AppResult.Success(data = true)
        } catch (e: Exception) {
            AppResult.Error(message = e.message ?: "Delete account is failed")
        }
    }

}