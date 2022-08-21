package com.example.newfoody.data.network

import androidx.compose.ui.text.style.TextDirection.Companion.Content
import com.example.newfoody.models.MovieTittleByTittle
import retrofit2.Response
import retrofit2.http.GET

import retrofit2.http.Headers
import retrofit2.http.QueryMap

interface FoodRecipesApi {

    @Headers(
        "X-RapidAPI-Key:" + "077581ee37msh4c903e71207247bp1c5f1djsn6ee626762c20",
        "Content-type:application/json"
    )
    @GET("https://moviesdatabase.p.rapidapi.com/titles/search/title/null")
   suspend fun getRecipes(
        @QueryMap queries: Map<String,String>
    ) :Response<MovieTittleByTittle>
}