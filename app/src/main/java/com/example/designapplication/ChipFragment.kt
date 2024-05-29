package com.example.designapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.graphics.drawable.toDrawable
import androidx.navigation.fragment.findNavController
import com.example.designapplication.databinding.FragmentChipBinding
import com.google.android.material.chip.ChipGroup

class ChipFragment : Fragment() {
    private lateinit var binding: FragmentChipBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentChipBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val chipGroup: ChipGroup = binding.chipGroup


        val subjects = listOf(
            ChipItem(R.drawable.pic_tamil, "ગણિત",R.color.blue),
            ChipItem(R.drawable.pic_science, "વિજ્ઞાન",R.color.lightPink),
            ChipItem(R.drawable.pic_social, "ગુજરાતી",R.color.yellow),
            ChipItem(R.drawable.pic_english, "English",R.color.facecolor)
        )

        ChipAdapter(requireContext(), subjects, chipGroup) { subject ->
            // Handle chip click
            // Navigate to another fragment or activity
            findNavController().navigate(R.id.action_chipFragment_to_applyTestFragment)
        }
    }
}
