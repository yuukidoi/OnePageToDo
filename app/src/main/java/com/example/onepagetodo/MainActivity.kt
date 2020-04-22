package com.example.onepagetodo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.CalendarView
import android.widget.TextView
import android.widget.Toast
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val format = SimpleDateFormat("yyyy/MM/dd", Locale.US)
        val calendarView = findViewById<CalendarView>(R.id.main_calendar)
        val defaultDate = calendarView.date


        //calendar click
        calendarView.setOnDateChangeListener{view, year, month, dayOfMonth ->
            val date = "$year/$month/$dayOfMonth"
            val dateText = findViewById<TextView>(R.id.textView_date)
            dateText.text = date.toString()
            Toast.makeText(this, date, Toast.LENGTH_SHORT).show()
        }


        Log.d("Main", "calendar ${format.format(defaultDate)}")
    }
}
