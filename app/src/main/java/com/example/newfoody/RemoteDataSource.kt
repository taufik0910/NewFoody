package com.example.newfoody

import com.example.newfoody.models.Antah
import retrofit2.Response
import java.time.temporal.TemporalQueries
import javax.inject.Inject

class RemoteDataSource @Inject constructor(
    private val foodRecipesApi : FoodRecipesApi
) {
    suspend fun getRecipes(queries: Map<String, String>): Response<Antah>{
       return foodRecipesApi.getRecipes(queries)
    }
}