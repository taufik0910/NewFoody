package com.example.newfoody.models


import com.google.gson.annotations.SerializedName

data class TitleText(
    @SerializedName("text")
    val text: String,
    @SerializedName("__typename")
    val typename: String
)