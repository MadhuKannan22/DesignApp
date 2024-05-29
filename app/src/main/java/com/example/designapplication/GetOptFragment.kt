package com.example.designapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.designapplication.databinding.FragmentCreateBinding
import com.example.designapplication.databinding.FragmentGetOptBinding

class GetOptFragment : Fragment() {
    private lateinit var binding: FragmentGetOptBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentGetOptBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnGetOpt.setOnClickListener {
            findNavController().navigate(R.id.action_getOptFragment_to_chaptersListFragment)
        }
    }
}