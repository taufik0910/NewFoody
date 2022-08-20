package com.example.newfoody.models


import com.google.gson.annotations.SerializedName

data class Antah(
    @SerializedName("d")
    val d: List<D>,
    @SerializedName("q")
    val q: String,
    @SerializedName("v")
    val v: Int
)