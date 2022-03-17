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

        binding.apply {
            cv1.setOnClickListener {
                CustomTabsIntent.Builder().build().launchUrl(requireContext(), Uri.parse(LINK_A_D))
            }

            cv2.setOnClickListener {
                CustomTabsIntent.Builder().build().launchUrl(requireContext(), Uri.parse(LINK_B_D))
            }

            cv3.setOnClickListener {
                CustomTabsIntent.Builder().build().launchUrl(requireContext(), Uri.parse(LINK_C_D))
            }

            cvH1.setOnClickListener {
                CustomTabsIntent.Builder().build().launchUrl(requireContext(), Uri.parse(LINK_A_H))
            }

            cvH2.setOnClickListener {
                CustomTabsIntent.Builder().build().launchUrl(requireContext(), Uri.parse(LINK_B_H))
            }

            cvH3.setOnClickListener {
                CustomTabsIntent.Builder().build().launchUrl(requireContext(), Uri.parse(LINK_C_H))
            }

            cvD1.setOnClickListener {
                CustomTabsIntent.Builder().build().launchUrl(requireContext(), Uri.parse(LINK_A))
            }

            cvD2.setOnClickListener {
                CustomTabsIntent.Builder().build().launchUrl(requireContext(), Uri.parse(LINK_B))
            }

            cvD3.setOnClickListener {
                CustomTabsIntent.Builder().build().launchUrl(requireContext(), Uri.parse(LINK_C))
            }
        }
    }
}

private const val LINK_A = "https://sitcordova.sch.id/"
private const val LINK_B = "https://sqiboardingschool.com/"
private const val LINK_C = "https://idn.sch.id/"
private const val LINK_A_H = "https://sdit.lpitharumpurbalingga.com/"
private const val LINK_B_H = "https://smpitharumpurbalingga.sch.id/"
private const val LINK_C_H = "https://idn.sch.id/"
private const val LINK_A_D = "https://dapo.kemdikbud.go.id/sekolah/B881A51F3DFEB7A3C48D"
private const val LINK_B_D = "https://psb.syathiby.id/"
private const val LINK_C_D = "https://idn.sch.id/"