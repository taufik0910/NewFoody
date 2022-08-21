package com.example.newfoody.models


import com.google.gson.annotations.SerializedName

data class MovieTittleByTittle(
    @SerializedName("entries")
    val entries: Int,
    @SerializedName("next")
    val next: String,
    @SerializedName("page")
    val page: Int,
    @SerializedName("results")
    val results: List<Result>
)