package com.example.firebase_demo1

import android.content.ContentValues
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextPaint
import android.text.TextUtils
import android.util.Log
import android.widget.Toast
import com.example.firebase_demo1.databinding.ActivityMainBinding
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {

    lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()

        binding.btnlogin.setOnClickListener {
            val email = binding.edtemail.text.toString()
            val pass = binding.edtpassword.text.toString()

            if (email.isNotEmpty() && pass.isNotEmpty()) {
                Toast.makeText(this, "input provided", Toast.LENGTH_SHORT).show()

                val intent = Intent(this,Register::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "input required", Toast.LENGTH_SHORT).show()
            }
        }
    }
}