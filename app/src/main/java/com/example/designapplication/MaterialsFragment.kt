package com.example.designapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.designapplication.databinding.FragmentMaterialsBinding

class MaterialsFragment : Fragment() {
    private lateinit var binding: FragmentMaterialsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMaterialsBinding.inflate(inflater, container, false)

        val recyclerView = binding.designRecyclerview2
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        val items = listOf(
            ListOfItems2(R.drawable.ic_action_text_book, "TEXT BOOK", "see", null),
            ListOfItems2(R.drawable.ic_action_edit, "MATHEMATICS", "see", "2020-2023 total videos"),

            )
        val adapter = CustomAdapter2(items)
        recyclerView.adapter = adapter
        return binding.root
    }
}