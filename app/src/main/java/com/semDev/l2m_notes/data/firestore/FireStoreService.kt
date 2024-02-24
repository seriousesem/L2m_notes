package com.semDev.l2m_notes.data.firestore

import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.CollectionReference
import com.google.firebase.firestore.Query
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.semDev.l2m_notes.data.firestore.entity.AlchemyResultEntity
import com.semDev.l2m_notes.data.firestore.entity.alchemyResultEntityFromMap
import com.semDev.l2m_notes.utils.AlchemyStatisticsMapKeys
import com.semDev.l2m_notes.utils.FireStoreCollections
import kotlinx.coroutines.tasks.await
import javax.inject.Inject


class FireStoreService @Inject constructor() {

    private var alchemyResultsCollection: CollectionReference

    init {
      val userId = Firebase.auth.currentUser?.uid.orEmpty()
        alchemyResultsCollection = Firebase.firestore.collection(FireStoreCollections.USERS).document(userId)
            .collection(FireStoreCollections.ALCHEMY_RESULTS)
    }

    suspend fun saveAlchemyResult(alchemyResultEntity: AlchemyResultEntity): Boolean {
        try {
            val documentReference = alchemyResultsCollection.add(alchemyResultEntity).await()
            return documentReference.id.isNotEmpty()
        } catch (exception: Exception) {
            throw exception
        }
    }

    suspend fun fetchAlchemyResults(): List<AlchemyResultEntity> {
        try {
            val query = alchemyResultsCollection.orderBy(AlchemyStatisticsMapKeys.ALCHEMY_INSERT_DATE, Query.Direction.DESCENDING)
            val result = query.get().await()
            val alchemyResults = mutableListOf<AlchemyResultEntity>()
            for (document in result.documents) {
                alchemyResults.add(alchemyResultEntityFromMap(id = document.id, map = document.data))
            }
            return alchemyResults
        } catch (exception: Exception) {
            throw exception
        }
    }

    suspend fun deleteAlchemyResult(alchemyResultEntity: AlchemyResultEntity): Boolean {
        if (alchemyResultEntity.id != null) {
            val docRef = alchemyResultsCollection.document(alchemyResultEntity.id)
            try {
                docRef.delete().await()
                return true
            } catch (exception: Exception) {
                throw exception
            }
        }
        return false
    }
}

