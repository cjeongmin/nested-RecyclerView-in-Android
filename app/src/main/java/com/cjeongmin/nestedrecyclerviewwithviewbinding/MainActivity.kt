package com.cjeongmin.nestedrecyclerviewwithviewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import com.cjeongmin.nestedrecyclerviewwithviewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.parentRecyclerView.adapter = ParentRecyclerViewAdapter(arrayListOf("4", "5", "7"))
        binding.parentRecyclerView.layoutManager = LinearLayoutManager(
            binding.root.context,
            LinearLayoutManager.VERTICAL,
            false
        )
    }
}