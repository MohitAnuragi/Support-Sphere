package com.example.supportsphere

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class senior : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_senior)

        ride()
    }
    public fun ride() {
        var btnride = findViewById<Button>(R.id.button)

        btnride.setOnClickListener {
            openbtnride()
        }
    }
    public fun openbtnride()
    {
        startActivity(Intent(this,findride::class.java))
    }
}