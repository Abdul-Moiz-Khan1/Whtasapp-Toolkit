package com.example.memesapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.example.memesapp.databinding.FragmentTrendingFragBinding

class trending_frag : Fragment() {
private var bindingg : FragmentTrendingFragBinding?=null
    private val binding get() = bindingg!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bindingg = FragmentTrendingFragBinding.inflate(layoutInflater)

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_trending_frag, container, false)
        val items = data()
//        val adapter = RecyclerViewAdapter(MainActivity, items)
//        val gridLayout = GridLayoutManager(requireContext(),3)
//        binding.recView.layoutManager = gridLayout
//        binding.recView.adapter = adapter
//        return  binding.root

    }

    private fun data(): List<memedata> {
        val returnlist = mutableListOf<memedata>()
        returnlist.add(memedata("Asif Zardaro" , R.drawable.trend1))
        returnlist.add(memedata("3 idiots" , R.drawable.trend2))
        returnlist.add(memedata("Hera Pheri" , R.drawable.trend3))
        returnlist.add(memedata("Politics" , R.drawable.trend4))
        returnlist.add(memedata("Singles" , R.drawable.trend5))
        returnlist.add(memedata("Cricket" , R.drawable.trend6))
        returnlist.add(memedata("Tom n Jerry" , R.drawable.trend7))
        returnlist.add(memedata("Muslim" , R.drawable.trend8))
        returnlist.add(memedata("Kevin" , R.drawable.trend9))
        returnlist.add(memedata("Winters" , R.drawable.trend10))
        return returnlist
    }


}