package com.cjeongmin.nestedrecyclerviewwithviewbinding

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.cjeongmin.nestedrecyclerviewwithviewbinding.databinding.RecyclerViewItemBinding

class ChildRecyclerViewAdapter(private val todoList: ArrayList<Todo>) :
    RecyclerView.Adapter<ChildRecyclerViewAdapter.ViewHolder>() {
    inner class ViewHolder(private val itemBinding: RecyclerViewItemBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {
        fun bindItem(todo: Todo) {
            itemBinding.time.text = todo.time
            itemBinding.title.text = todo.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            RecyclerViewItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(todoList[position])
    }

    override fun getItemCount(): Int {
        return todoList.size
    }

}