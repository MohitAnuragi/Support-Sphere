package com.example.supportsphere

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.window.SplashScreen
import androidx.annotation.RequiresApi
import com.example.supportsphere.databinding.ActivitySignupBinding
import com.google.firebase.auth.FirebaseAuth

class Signup : AppCompatActivity() {
    private val binding: ActivitySignupBinding by lazy {
        ActivitySignupBinding.inflate(layoutInflater)
    }
    private lateinit var firebaseAuth: FirebaseAuth

    @RequiresApi(Build.VERSION_CODES.S)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
       firebaseAuth = FirebaseAuth.getInstance()

        binding.btnSignup.setOnClickListener {
            binding.btnSignup.setOnClickListener {
                startActivity(Intent(this,Login::class.java))
                finish()
            }
  }

        binding.btnSignup.setOnClickListener {

            val name:String = binding.editTextText.text.toString()
            val email:String = binding.edtTextEmail.text.toString()
            val pass:String = binding.editTextText3.text.toString()
            val cnf : String = binding.editcnfpassword.text.toString()
            if (name.isEmpty() || email.isEmpty() || pass.isEmpty() || cnf.isEmpty()) {

                Toast.makeText(this, "Please Fill All The Details", Toast.LENGTH_SHORT).show()
            }

                  else if (pass != cnf) {
                      Toast.makeText(this,"Confirm Password Must be Same",Toast.LENGTH_SHORT).show()
                    } else {
                        firebaseAuth.createUserWithEmailAndPassword(email,pass).addOnCompleteListener(this){task ->
                            if(task.isSuccessful)
                            {
                                Toast.makeText(this,"Registration Successful",Toast.LENGTH_SHORT).show()
                                startActivity(Intent(this,Login::class.java))
                                finish()
                            }
                            else
                            {
                                Toast.makeText(this,"Registration Failed : ${task.exception?.message}",Toast.LENGTH_SHORT).show()
                            }
                    }
                }

        }

 }
}
