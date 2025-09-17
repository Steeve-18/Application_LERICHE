package com.example.lericheapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.view.View
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.flashcard_question).setOnClickListener {

            findViewById<View>(R.id.flashcard_answer).visibility = View.VISIBLE
            findViewById<View>( R.id.flashcard_question).visibility = View.INVISIBLE


        // Do something here
        }

        findViewById<View>(R.id.flashcard_answer).setOnClickListener {

            findViewById<View>(R.id.flashcard_answer).visibility = View.INVISIBLE
            findViewById<View>( R.id.flashcard_question).visibility = View.VISIBLE


            // Do something here
        }





    }
}