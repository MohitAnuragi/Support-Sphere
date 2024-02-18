package com.example.supportsphere


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class food1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food1)

        // Sample data - you can replace this with your own data
        val foodItemsList = listOf(
            fooditem("Burger", "60Rs", R.drawable.burger),
            fooditem(" Margherita Pizza", "120Rs", R.drawable.pizza2),
            fooditem(" Chocolate Cake", "250Rs", R.drawable.cake1),
            fooditem("Chinese", "70Rs", R.drawable.chinese),
            fooditem("Coffee", "40Rs", R.drawable.coffe),
            fooditem("Panipuri", "20Rs", R.drawable.indian4),
            fooditem("Vadapav", "20rs", R.drawable.indian9),
            fooditem("Samosa", "20Rs", R.drawable.indian3),
            fooditem("chole Bhature", "50Rs", R.drawable.indian),
            fooditem("Steam momos", "35Rs",R.drawable.momos3),
            fooditem("Fried Momos","45Rs",R.drawable.moms),
            fooditem("Capsicum Pizza","169Rs",R.drawable.pizza4),
            fooditem("Cutting Tea","10Rs",R.drawable.tea),
            fooditem("Lemon Tea","40Rs",R.drawable.tea2),
            fooditem("Tomato Pizza","149Rs",R.drawable.pizza7)
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