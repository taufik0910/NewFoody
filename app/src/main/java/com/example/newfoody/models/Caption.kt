package com.example.newfoody.models


import com.google.gson.annotations.SerializedName

data class Caption(
    @SerializedName("plainText")
    val plainText: String,
    @SerializedName("__typename")
    val typename: String
)