package com.example.newfoody.ui.fragment.recipes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.newfoody.viewModel.MainViewModel
import com.example.newfoody.R
import com.example.newfoody.adapters.RecipesAdapter
import com.example.newfoody.util.NetworkResult
import com.example.newfoody.viewModel.RecipesViewModel
import dagger.hilt.android.AndroidEntryPoint

import kotlinx.android.synthetic.main.fragment_recipes_fregment.view.*


@AndroidEntryPoint
class RecipesFragment : Fragment() {
    private lateinit var mainViewModel: MainViewModel
    private val mAdapter by lazy { RecipesAdapter() }
    private lateinit var recipesViewModel: RecipesViewModel
    private lateinit var mView: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainViewModel = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)
        recipesViewModel = ViewModelProvider(requireActivity()).get(RecipesViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_recipes_fregment, container, false)


        setupRecyclerView()
        requestApiData()
        return mView
    }

    private fun requestApiData() {
        mainViewModel.getRecipes(recipesViewModel.applyQueries())
        mainViewModel.receipesResponse.observe(viewLifecycleOwner) { response ->
            when (response) {
                is NetworkResult.Success -> {
                    response.data?.let { mAdapter.setData(it) }
                }
                is NetworkResult.Error -> {
                    Toast.makeText(
                        requireContext(),
                        response.message.toString(),
                        Toast.LENGTH_SHORT
                    ).show()
                }
                is NetworkResult.Loading -> {}

            }
        }


    }



    private fun setupRecyclerView() {
        mView.recyclerview.adapter = mAdapter
        mView.recyclerview.layoutManager = LinearLayoutManager(requireContext())

    }


}