package com.example.designapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.designapplication.databinding.FragmentApplyTestBinding
import com.example.designapplication.databinding.FragmentBottomNavigationBinding
import com.example.designapplication.databinding.FragmentContactBinding

class ApplyTestFragment : Fragment() {

    private lateinit var binding: FragmentApplyTestBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentApplyTestBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnApplyTest.setOnClickListener {
            findNavController().navigate(R.id.action_applyTestFragment_to_Chapters1Fragment2)
        }
    }
}
