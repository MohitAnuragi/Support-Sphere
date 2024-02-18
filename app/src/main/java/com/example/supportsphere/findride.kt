package com.example.supportsphere



import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity



class findride : AppCompatActivity() {

    private val passengers = listOf(
        ridedata("John", "City A", "City C", "17-02-2024","12:55PM"),
        ridedata("Jane", "City B", "City D", "17-02-2024", "12:55PM")
        // Add more passengers as needed
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_findride)
        val editTextFrom = findViewById<EditText>(R.id.editTxtFrom)
        val editTextDestination = findViewById<EditText>(R.id.editTxtTo)
        val editTextDate = findViewById<EditText>(R.id.editTxtDate)
        val editTextTime = findViewById<EditText>(R.id.editTxtTime)
        val buttonSearch = findViewById<Button>(R.id.btnFindRide)

        buttonSearch.setOnClickListener {
            val from = editTextFrom.text.toString()
            val destination = editTextDestination.text.toString()
            val date = editTextDate.text.toString()
            val time = editTextTime.text.toString()

            val matchingPassengers = passengers.filter {
                it.destination == destination && it.date == date && it.time == time
            }


        }
    }

    private fun displayMatchingPassengers(matchingPassengers: List<ridedata>) {
        val passengerNames = matchingPassengers.joinToString { it.name }
        Toast.makeText(this, "Matching Passengers: $passengerNames", Toast.LENGTH_SHORT).show()
    }
}