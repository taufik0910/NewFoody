package com.example.newfoody.models


import com.google.gson.annotations.SerializedName

data class DataBerita(
    @SerializedName("articles")
    val articles: List<Article>,
    @SerializedName("status")
    val status: String,
    @SerializedName("totalResults")
    val totalResults: Int
)