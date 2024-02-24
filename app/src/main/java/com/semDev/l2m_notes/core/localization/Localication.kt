package com.semDev.l2m_notes.core.localization

import android.content.Context
import android.content.res.Configuration
import com.semDev.l2m_notes.data.storage.LocalStorage
import dagger.hilt.android.qualifiers.ApplicationContext
import java.util.Locale
import javax.inject.Inject

class Localization @Inject constructor(
    @ApplicationContext private val context: Context,
    private val storage: LocalStorage
) {

    fun changeLanguage(languageCode: String) {
        val locale = Locale(languageCode)
        Locale.setDefault(locale)
        val config = Configuration(context.resources.configuration)
        config.setLocale(locale)
        context.createConfigurationContext(config)
        storage.saveData("Language", languageCode)
    }

    fun loadLanguage() {
        val language = storage.loadData<String>(key = "Language", defaultValue = "en")
        if (language.isNotEmpty()) {
            changeLanguage(language)
        }
    }
}