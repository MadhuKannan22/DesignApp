package com.example.designapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.designapplication.databinding.FragmentEditProfileBinding
import com.example.designapplication.databinding.FragmentWinnerBinding

class WinnerFragment : Fragment() {
    private lateinit var binding: FragmentWinnerBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentWinnerBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnClose.setOnClickListener {
            findNavController().navigate(R.id.action_winnerFragment_to_homeFragment)
        }
    }
}