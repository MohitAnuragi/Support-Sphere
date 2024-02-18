package com.example.supportsphere


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class alumni : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alumni)

        // Sample data - you can replace this with your own data
        val alumniList = listOf(
            alumniname("Gaurav Agarwal", "2014kucp1017@iiitkota.ac.in", R.drawable.gaurav),
            alumniname(" Arushi Gupta", "2013kucp1012@iiitkota.ac.in", R.drawable.arushi),
            alumniname("Joey Pinto","2013kucp1021@iiitkota.ac.in",R.drawable.joey),
            alumniname("Neha Singh","2019kuec2012@iiitkota.ac.in",R.drawable.neha),
            alumniname("Nilesh Agarwal","2015kucp1004@iiitkota.ac.in",R.drawable.nilesh),
            alumniname("Nitesh Kr Meena","2018kucp1070@iiitkota.ac.in",R.drawable.nitesh),
            alumniname("Priya Sharma","2013kucp1003@iiitkota.ac.in",R.drawable.priya2),
            alumniname("Sarthak Singh","2019kuec2052@iiitkota.ac.in",R.drawable.sarswat)
        )

        // Initialize RecyclerView
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)

        // Create and set up the adapter with the data
        val adapter = alumniAdapter(alumniList)
        recyclerView.adapter = adapter

        // Set layout manager to display items linearly
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}
