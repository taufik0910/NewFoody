package com.example.newfoody.data

import com.example.newfoody.data.network.FoodRecipesApi
import com.example.newfoody.models.MovieTittleByTittle
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSource @Inject constructor(
    private val foodRecipesApi : FoodRecipesApi
) {
    suspend fun getRecipes(queries: Map<String, String>): Response<MovieTittleByTittle>{
       return foodRecipesApi.getRecipes(queries)
    }
}