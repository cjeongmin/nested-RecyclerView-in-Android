package com.cjeongmin.nestedrecyclerviewwithviewbinding

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cjeongmin.nestedrecyclerviewwithviewbinding.databinding.ChildRecyclerViewBinding

class ParentRecyclerViewAdapter(private val themes: ArrayList<String>) :
    RecyclerView.Adapter<ParentRecyclerViewAdapter.ViewHolder>() {
    inner class ViewHolder(val itemBinding: ChildRecyclerViewBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {
        fun bindItem(theme: String) {
            itemBinding.theme.text = theme
            val todoList = Constant.getTodoByLength(theme.toInt())
            val childAdapter = ChildRecyclerViewAdapter(todoList)
            itemBinding.childRecyclerView.adapter = childAdapter
            itemBinding.childRecyclerView.layoutManager = LinearLayoutManager(
                itemBinding.root.context,
                LinearLayoutManager.VERTICAL,
                false
            )
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ChildRecyclerViewBinding.inflate(
                LayoutInflater.from(
                    parent.context,
                ),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(themes[position])
    }

    override fun getItemCount(): Int {
        return themes.size
    }
}