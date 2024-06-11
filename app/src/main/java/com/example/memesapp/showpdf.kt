package com.example.memesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.memesapp.databinding.ActivityShowpdfBinding
import com.google.firebase.storage.FirebaseStorage

class showpdf : AppCompatActivity() {
    private lateinit var binding: ActivityShowpdfBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityShowpdfBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.showpdf.visibility = View.INVISIBLE
        binding.progressBar.visibility = View.VISIBLE
        val name = intent.getStringExtra("pdfname")

        val storageRef = FirebaseStorage.getInstance().getReference()
        storageRef.child("pdfs/${name}.pdf").getBytes(Long.MAX_VALUE)
            .addOnSuccessListener { bytes ->
                binding.progressBar.visibility = View.GONE
                binding.showpdf.visibility = View.VISIBLE
                binding.showpdf.fromBytes(bytes)
                    .pages(0, 2, 1, 3, 3, 3) // all pages are displayed by default
                    .enableSwipe(true) // allows to block changing pages using swipe
                    .swipeHorizontal(false)
                    .enableDoubletap(true)
                    .defaultPage(0).password(null)
                    .load()

            }.addOnFailureListener {

                Toast.makeText(this, it.message.toString(), Toast.LENGTH_SHORT).show()
            }
    }
}