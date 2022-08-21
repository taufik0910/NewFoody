package com.example.newfoody.models


import com.google.gson.annotations.SerializedName

data class ReleaseDate(
    @SerializedName("day")
    val day: Int,
    @SerializedName("month")
    val month: Int,
    @SerializedName("__typename")
    val typename: String,
    @SerializedName("year")
    val year: Int
)