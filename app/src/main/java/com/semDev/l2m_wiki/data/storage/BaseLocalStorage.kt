package com.semDev.l2m_wiki.data.storage

interface BaseLocalStorage {

    fun saveData(key: String, data: Any)
    fun <T> loadData(key: String, defaultValue: Any): T
    fun clearStorage()
}