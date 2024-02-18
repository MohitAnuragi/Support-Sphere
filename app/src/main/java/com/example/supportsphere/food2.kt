package com.example.supportsphere

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class food2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food2)

        // Sample data - you can replace this with your own data
        val foodItemsList = listOf(
            fooditem("Chach", "40Rs", R.drawable.chach),
            fooditem(" lassi", "50Rs", R.drawable.lassi),
            fooditem(" Dal Makhani", "220Rs", R.drawable.dalmakhani),
            fooditem("Dal Tadka", "160Rs", R.drawable.daltadka),
            fooditem("Jeera Rice", "100Rs", R.drawable.jeerarice),
            fooditem("Veg Biryani", "200Rs", R.drawable.vegbirayani),
            fooditem("Tandoori Roti", "25Rs", R.drawable.tandooriroti),
            fooditem("Matar Paneer", "190Rs", R.drawable.matarpanner),
            fooditem("khadai Paneer", "230Rs", R.drawable.kadaipaneer),
            fooditem("Khadai Chicken", "230Rs",R.drawable.kadaichicken),
            fooditem("Aloo Paratha","30Rs",R.drawable.alooparathe),
            fooditem("Plain Roti","10Rs",R.drawable.plainroti),
            fooditem("Missi Roti","20Rs",R.drawable.missiroti),
            fooditem("Non Veg Biryani","350Rs",R.drawable.nonvegbiryani),
            fooditem("Fish Curry","230Rs",R.drawable.fishcurry),
            // Add more food items as needed
        )

        // Initialize RecyclerView
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)

        // Create and set up the adapter with the data
        val adapter = FoodItemAdapter(foodItemsList)
        recyclerView.adapter = adapter

        // Set layout manager to display items linearly
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}