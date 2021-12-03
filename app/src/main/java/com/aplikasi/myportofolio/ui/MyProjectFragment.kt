package com.aplikasi.myportofolio.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.aplikasi.myportofolio.DataProjects
import com.aplikasi.myportofolio.MyProjectsAdapter
import com.aplikasi.myportofolio.databinding.FragmentMyProjectBinding

class MyProjectFragment : Fragment() {

    private var _binding: FragmentMyProjectBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentMyProjectBinding.inflate(inflater, container, false)

        binding.rvMyProject.apply {
            layoutManager = GridLayoutManager(context, 1)
            adapter = MyProjectsAdapter(DataProjects.listAllProjects)
        }
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}