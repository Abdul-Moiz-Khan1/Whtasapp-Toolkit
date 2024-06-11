package com.example.memesapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class FragmentAdapter(fm:FragmentManager , lifecycle:Lifecycle) : FragmentStateAdapter(fm,lifecycle) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return if(position == 0) trending_frag()
                else if(position == 1)  insta_frag()
                else funny_frag()
    }
}