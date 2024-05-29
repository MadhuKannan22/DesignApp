package com.example.designapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.designapplication.databinding.FragmentChaptersListBinding

class ChaptersListFragment : Fragment() {
    private lateinit var binding: FragmentChaptersListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentChaptersListBinding.inflate(inflater, container, false)
        val recyclerView = binding.designRecyclerview
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        val items = listOf(
            ListOfItems(1, "Mathematics", "(Real Numbers)"),
            ListOfItems(2, "Mathematics", "(Polynomials)"),
            ListOfItems(3, "Mathematics", "(Pair of Linear Equations in two...)"),
            ListOfItems(4, "Mathematics", "(Quadratic Equations)"),
            ListOfItems(5, "Mathematics", "(Arithmetic Progressions)"),
            ListOfItems(6, "Mathematics", "(Triangles)")
        )
        val adapter = CustomAdapter(items)
        recyclerView.adapter = adapter
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.textviewChapters.setOnClickListener {
            findNavController().navigate(R.id.action_chaptersListFragment_to_otpVerificationFragment)
        }
    }
}