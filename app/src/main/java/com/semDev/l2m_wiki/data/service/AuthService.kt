package com.semDev.l2m_wiki.data.service

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseAuthException
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.semDev.l2m_wiki.domain.model.account.User
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.tasks.await
import javax.inject.Inject

class AuthService @Inject constructor() {
    val currentUser: Flow<User?>
        get() = try {
            callbackFlow {
                val listener =
                    FirebaseAuth.AuthStateListener { auth ->
                        this.trySend(auth.currentUser?.let { User(it.uid) })
                    }
                Firebase.auth.addAuthStateListener(listener)
                awaitClose { Firebase.auth.removeAuthStateListener(listener) }
            }
        } catch (e: FirebaseAuthException) {
            throw e
        }

    val currentUserId: String
        get() = try {
            Firebase.auth.currentUser?.uid.orEmpty()
        } catch (e: FirebaseAuthException) {
            throw e
        }


    fun hasUser(): Boolean {
        return try {
            Firebase.auth.currentUser != null
        } catch (e: FirebaseAuthException) {
            throw e
        }
    }

    suspend fun login(email: String, password: String) {
        try {
            Firebase.auth.signInWithEmailAndPassword(email, password).await()
        } catch (e: FirebaseAuthException) {
            throw e
        }
    }

    suspend fun createAccount(email: String, password: String) {
        try {
            Firebase.auth.createUserWithEmailAndPassword(email, password).await()
        } catch (e: FirebaseAuthException) {
            throw e
        }
    }

    suspend fun resetPassword(email: String) {
        try {
            Firebase.auth.sendPasswordResetEmail(email).await()
        } catch (e: FirebaseAuthException) {
            throw e
        }
    }

    suspend fun logout() {
        try {
            Firebase.auth.signOut()
        } catch (e: FirebaseAuthException) {
            throw e
        }
    }

    suspend fun deleteAccount() {
        try {
            Firebase.auth.currentUser!!.delete().await()
        } catch (e: FirebaseAuthException) {
            throw e
        }
    }
}