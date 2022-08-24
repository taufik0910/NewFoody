package com.example.newfoody.data.network

import com.example.newfoody.models.DataBerita
import retrofit2.Response
import retrofit2.http.GET

import retrofit2.http.QueryMap

interface FoodRecipesApi {


    @GET("/v2/everything")
   suspend fun getRecipes(
        @QueryMap queries: Map<String,String>
    ) :Response<DataBerita>
}