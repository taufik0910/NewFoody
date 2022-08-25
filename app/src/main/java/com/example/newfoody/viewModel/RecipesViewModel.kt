package com.example.newfoody.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.newfoody.util.Constants.Companion.API_KEY
import com.example.newfoody.util.Constants.Companion.QUERY_API_KEY
import com.example.newfoody.util.Constants.Companion.QUERY_FROM
import com.example.newfoody.util.Constants.Companion.QUERY_Q
import com.example.newfoody.util.Constants.Companion.QUERY_SORT_BY

class RecipesViewModel(application: Application): AndroidViewModel(application){

     fun applyQueries(): HashMap<String, String> {
        val queries: HashMap<String, String> = HashMap()
        queries[QUERY_Q] = "tesla"
        queries[QUERY_FROM] = "2022-07-24"
        queries[QUERY_SORT_BY] = "publishedAt"
        queries[QUERY_API_KEY] = API_KEY

        return queries
    }
}