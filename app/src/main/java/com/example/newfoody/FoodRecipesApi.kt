package com.example.newfoody

import com.example.newfoody.models.Antah
import retrofit2.Response
import retrofit2.http.GET

import retrofit2.http.Headers
import retrofit2.http.QueryMap

interface FoodRecipesApi {

    @Headers(
        "X-RapidAPI-Key:" + "077581ee37msh4c903e71207247bp1c5f1djsn6ee626762c20",
        "X-RapidAPI-Host :" + "online-movie-database.p.rapidapi.com"
    )
    @GET("https://online-movie-database.p.rapidapi.com/auto-complete/")
   suspend fun getRecipes(
        @QueryMap queries: Map<String,String>
    ) :Response<Antah>
}