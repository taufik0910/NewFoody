package com.example.newfoody.util

import androidx.recyclerview.widget.DiffUtil
import com.example.newfoody.models.D

class RecipesDiffUtil(
    private val oldList : List<D>,
    private val newList : List<D>
) : DiffUtil.Callback() {
    override fun getOldListSize(): Int {
      return oldList.size
    }

    override fun getNewListSize(): Int {
        return  newList.size
    }

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition] === newList[newItemPosition]
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
      return oldList[oldItemPosition] == newList[newItemPosition]
    }


}