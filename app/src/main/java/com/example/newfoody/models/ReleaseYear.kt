package com.example.newfoody.models


import com.google.gson.annotations.SerializedName

data class ReleaseYear(
    @SerializedName("endYear")
    val endYear: Any,
    @SerializedName("__typename")
    val typename: String,
    @SerializedName("year")
    val year: Int
)