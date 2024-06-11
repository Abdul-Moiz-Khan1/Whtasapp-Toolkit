package com.example.memesapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.view.LayoutInflater
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import com.example.memesapp.databinding.ActivityTask4FirebaseStorageBinding
import com.github.barteksc.pdfviewer.PDFView
import com.google.android.gms.tasks.OnSuccessListener
import com.google.firebase.storage.FirebaseStorage
import java.io.File
import java.io.FileOutputStream
import java.lang.Exception

class Task4_firebase_storage : AppCompatActivity() {
    private lateinit var bindingtask4: ActivityTask4FirebaseStorageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        bindingtask4 = ActivityTask4FirebaseStorageBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(bindingtask4.root)


        bindingtask4.getpdf.setOnClickListener {
            val pdfname = bindingtask4.getname.text.toString()
            val intent = Intent(this, showpdf::class.java)
            intent.putExtra("pdfname", pdfname)
            startActivity(intent)


        }

    }
}