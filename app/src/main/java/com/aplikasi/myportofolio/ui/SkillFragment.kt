package com.aplikasi.myportofolio.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.aplikasi.myportofolio.databinding.FragmentSkillBinding

class SkillFragment : Fragment() {

    private var _binding: FragmentSkillBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSkillBinding.inflate(inflater, container, false)

        binding.cv1.setOnClickListener {
            Toast.makeText(context, "Maaf Tidak ada detail untuk skill", Toast.LENGTH_SHORT).show()
        }
        binding.cv2.setOnClickListener {
            Toast.makeText(context, "Maaf Tidak ada detail untuk skill", Toast.LENGTH_SHORT).show()
        }
        binding.cv3.setOnClickListener {
            Toast.makeText(context, "Maaf Tidak ada detail untuk skill", Toast.LENGTH_SHORT).show()
        }
        binding.cv4.setOnClickListener {
            Toast.makeText(context, "Maaf Tidak ada detail untuk skill", Toast.LENGTH_SHORT).show()
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}