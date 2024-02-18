package com.example.supportsphere

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import android.window.SplashScreen
import androidx.annotation.RequiresApi
import com.example.supportsphere.databinding.ActivityLoginBinding
import com.example.supportsphere.databinding.ActivitySignupBinding
import com.google.firebase.auth.FirebaseAuth

class Login : AppCompatActivity() {
    private val binding: ActivityLoginBinding
            by lazy { ActivityLoginBinding.inflate(layoutInflater) }
    private lateinit var firabaseAuth: FirebaseAuth

    @RequiresApi(Build.VERSION_CODES.S)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        firabaseAuth = FirebaseAuth.getInstance()

        binding.signup.setOnClickListener {
            startActivity(Intent(this, Signup::class.java))
        }

        binding.btnlogin.setOnClickListener {
            val email = binding.edtTextEmail.text.toString()


            val pass = binding.edtTextPassword.text.toString()

            if (email.isEmpty() || pass.isEmpty()) {

                Toast.makeText(this, "Please Fill All The Details", Toast.LENGTH_SHORT).show()
            } else {
                firabaseAuth.signInWithEmailAndPassword(email, pass)
                    .addOnCompleteListener { task ->
                        if (task.isSuccessful) {
                            Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()
                            startActivity(Intent(this, splaceScreen::class.java))
                        } else {
                            Toast.makeText(
                                this,
                                "Login Failed : ${task.exception?.message}",
                                Toast.LENGTH_SHORT
                            ).show()

                        }
                    }
            }
        }
    }
}




