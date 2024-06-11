package com.example.memesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.memesapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        //replaing frags
        replacefragment(Home_frag())
        binding.bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId){
                R.id.home -> replacefragment(Home_frag())
                R.id.memes -> replacefragment(Memes_frag())
                R.id.save -> replacefragment(saved())
                R.id.sticker -> replacefragment(sticker())

                else -> {
                }

            }
        true
        }

    }
private fun replacefragment (fragment : Fragment){
    val fragmentManager = supportFragmentManager
    val fragmentTransaction  = fragmentManager.beginTransaction()
    fragmentTransaction.replace(R.id.main_frame,fragment)
    fragmentTransaction.commit()
}

}