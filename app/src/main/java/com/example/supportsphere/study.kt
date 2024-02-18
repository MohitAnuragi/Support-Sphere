package com.example.supportsphere

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import com.example.supportsphere.databinding.ActivityLoginBinding
import com.example.supportsphere.databinding.ActivitySplaceScreenBinding
import com.google.firebase.auth.FirebaseAuth

class study : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_study)
        clickListener()
    }
    public fun clickListener()
    {
        var first = findViewById<CardView>(R.id.cardView4)
        var second = findViewById<CardView>(R.id.cardView5)
        var third = findViewById<CardView>(R.id.cardthird)
        var fourth = findViewById<CardView>(R.id.cardView6)
        var fifth = findViewById<CardView>(R.id.cardView7)
        var sixth = findViewById<CardView>(R.id.cardView8)
        var seventh = findViewById<CardView>(R.id.cardView9)
        var eigthth = findViewById<CardView>(R.id.cardeigth)

        first.setOnClickListener{
            openFirst()
        }
        second.setOnClickListener {
            openSecond()
        }
        third.setOnClickListener{
            openThird()
        }
        fourth.setOnClickListener {
            openFourth()
        }
        fifth.setOnClickListener{
            openFifth()
        }
        sixth.setOnClickListener {
            openSixth()
        }
        seventh.setOnClickListener{
            openSeventh()
        }
        eigthth.setOnClickListener {
            openEigthth()
        }

    }
    public fun openFirst()
    {
      startActivity(Intent(this,firstsem::class.java))
    }
    public fun openSecond()
    {
        startActivity(Intent(this,secondsem::class.java))
    }
    public fun openThird()
    {
        startActivity(Intent(this,thirdsem::class.java))
    }
    public fun openFourth()
    {
        startActivity(Intent(this,foursem::class.java))
    }
    public fun openFifth()
    {
        startActivity(Intent(this,fifthsem::class.java))
    }
    public fun openSixth()
    {
        startActivity(Intent(this,sixthsem::class.java))
    }
    public fun openSeventh()
    {
        startActivity(Intent(this,seventhsem::class.java))
    }
    public fun openEigthth()
    {
        startActivity(Intent(this,eightsem::class.java))
    }

}