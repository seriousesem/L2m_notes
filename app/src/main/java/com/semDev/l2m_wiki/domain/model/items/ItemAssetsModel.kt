package com.semDev.l2m_wiki.domain.model.items

import com.google.gson.annotations.SerializedName

data class ItemAssetsModel
    (
    @SerializedName("id") val id: String,
    @SerializedName("image") val image: String
)