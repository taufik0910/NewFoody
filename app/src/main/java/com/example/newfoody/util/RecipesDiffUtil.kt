package com.example.newfoody.util

import androidx.recyclerview.widget.DiffUtil
import com.example.newfoody.models.Article

class RecipesDiffUtil(
    private val oldList : List<Article>,
    private val newList : List<Article>
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