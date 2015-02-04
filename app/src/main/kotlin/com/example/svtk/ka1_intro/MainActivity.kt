package com.example.svtk.ka1_intro

import android.os.Bundle
import android.support.v7.app.ActionBarActivity
import android.view.View
import android.widget.Button
import android.widget.Toast


public class MainActivity : ActionBarActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById(R.id.click_me_button) as Button

        button.setOnClickListener {
            Toast.makeText(this, "Thank you!", Toast.LENGTH_SHORT).show()
        }
    }
}
