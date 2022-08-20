package com.example.newfoody.models


import com.google.gson.annotations.SerializedName

data class I(
    @SerializedName("height")
    val height: Int,
    @SerializedName("imageUrl")
    val imageUrl: String,
    @SerializedName("width")
    val width: Int
)