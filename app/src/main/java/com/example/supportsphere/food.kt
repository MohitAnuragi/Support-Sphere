package com.example.supportsphere

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.cardview.widget.CardView

class food : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food)
clickOnListner()

    }
        public fun clickOnListner() {
            var party = findViewById<TextView>(R.id.txtparty)
            var lunch = findViewById<TextView>(R.id.txtlunch)

            party.setOnClickListener {
                openParty()
            }
            lunch.setOnClickListener {
                openLunch()
            }
        }

    public fun openParty()
    {
        startActivity(Intent(this,food1::class.java))
    }
    public fun openLunch()
    {
        startActivity(Intent(this,food2::class.java))
    }
    }
