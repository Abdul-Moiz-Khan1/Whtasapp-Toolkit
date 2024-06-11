package com.example.memesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.memesapp.databinding.ActivityWaToolkitBinding

class WA_toolkit : AppCompatActivity() {
    private lateinit var binding:ActivityWaToolkitBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWaToolkitBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.cleaner1.setOnClickListener {
            startActivity(Intent(this,Task3_cleaner::class.java))
        }
        binding.cleaner2.setOnClickListener {
            startActivity(Intent(this,Task3_cleaner::class.java))
        }
        binding.cleaner3.setOnClickListener {
            startActivity(Intent(this,Task3_cleaner::class.java))
        }
    }
}