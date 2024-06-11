package com.example.memesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.memesapp.databinding.ActivityMainHomeBinding

class Main_Home : AppCompatActivity() {
    private lateinit var binding: ActivityMainHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainHomeBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.task1btn.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
        binding.task2btn.setOnClickListener {
            startActivity(Intent(this,Task2::class.java))
        }
        binding.task3btn.setOnClickListener {
            startActivity(Intent(this , WA_toolkit::class.java))

        }
        binding.task4btn.setOnClickListener {
            startActivity(Intent(this , Task4_firebase_storage::class.java))

        }
    }
}