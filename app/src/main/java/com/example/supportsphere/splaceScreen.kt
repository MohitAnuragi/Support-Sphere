package com.example.supportsphere

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.supportsphere.databinding.ActivitySplaceScreenBinding
import com.google.firebase.auth.FirebaseAuth

class splaceScreen : AppCompatActivity() {
    private lateinit var binding: ActivitySplaceScreenBinding
    private lateinit var Auth : FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_splace_screen)
        binding = ActivitySplaceScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Auth = FirebaseAuth.getInstance()
   // supportActionBar?.hide()
//        binding.study.setOnClickListener {
//            startActivity(Intent(this, study::class.java))
//     }
        val stu = findViewById<ImageView>(R.id.imgstudy)
        val foo = findViewById<ImageView>(R.id.imgfood)
        val alu = findViewById<ImageView>(R.id.imgallumani)
        val tra = findViewById<ImageView>(R.id.imgtravel)

        val hel = findViewById<ImageView>(R.id.imghelp)
        binding.study.setOnClickListener {
            startActivity(Intent(this, study::class.java))
        }
//stu.setOnClickListener{
//    val i1 = Intent(this,study::class.java)
//    startActivity(i1)
//}
foo.setOnClickListener {
    val i2 = Intent(this,food::class.java)
    startActivity(i2)
}
        tra.setOnClickListener{
            val i3 = Intent(this,senior::class.java)
            startActivity(i3)
        }

  alu.setOnClickListener {
      val i5 = Intent(this,alumni::class.java)
      startActivity(i5)
  }

hel.setOnClickListener {
    val i7 = Intent(this,query::class.java)
    startActivity(i7)
}



    }
}