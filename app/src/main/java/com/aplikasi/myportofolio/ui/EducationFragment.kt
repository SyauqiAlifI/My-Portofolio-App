package com.aplikasi.myportofolio.ui

import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.browser.customtabs.CustomTabsIntent
import com.aplikasi.myportofolio.databinding.FragmentEducationBinding
class EducationFragment : Fragment() {

    private var _binding: FragmentEducationBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentEducationBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.cv1.setOnClickListener {
            CustomTabsIntent.Builder().build().launchUrl(requireContext(), Uri.parse(LINK_A))
        }

        binding.cv2.setOnClickListener {
            CustomTabsIntent.Builder().build().launchUrl(requireContext(), Uri.parse(LINK_B))
        }

        binding.cv3.setOnClickListener {
            CustomTabsIntent.Builder().build().launchUrl(requireContext(), Uri.parse(LINK_C))
        }
    }
}

private const val LINK_A = "https://sitcordova.sch.id/"
private const val LINK_B = "https://sqiboardingschool.com/"
private const val LINK_C = "https://idn.sch.id/"