package com.example.firebase_demo1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.firebase_demo1.databinding.ActivityMainBinding
import com.example.firebase_demo1.databinding.ActivityRegisterBinding
import com.google.firebase.auth.FirebaseAuth

class Register : AppCompatActivity() {

    lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnregister.setOnClickListener {
            val username = binding.edtname.text.toString()
            val email = binding.edtemail.text.toString()
            val pass = binding.edtpassword.text.toString()


            if (username.isNotEmpty() && email.isNotEmpty() && pass.isNotEmpty()) {

                Toast.makeText(this, "input provided", Toast.LENGTH_SHORT).show()

            } else {

                Toast.makeText(this, "input required", Toast.LENGTH_SHORT).show()

            }

        }
    }
}