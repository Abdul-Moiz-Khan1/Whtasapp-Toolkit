package com.example.memesapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.viewpager2.widget.ViewPager2
import com.example.memesapp.databinding.FragmentMemesFragBinding
import com.google.android.material.tabs.TabLayout


class Memes_frag : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private var _binding : FragmentMemesFragBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?


    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentMemesFragBinding.inflate(inflater,container,false)
        binding.viewpager.adapter = FragmentAdapter(childFragmentManager,lifecycle)
        binding.tablayout.addOnTabSelectedListener(object: TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                if (tab != null) {
                    binding.viewpager.currentItem = tab.position
                }

            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }
        })
        binding.viewpager.registerOnPageChangeCallback(object  : ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                binding.tablayout.selectTab(binding.tablayout.getTabAt(position))
            }
        })
        return binding.root
    }

}