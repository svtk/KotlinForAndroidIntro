package com.example.svtk.ka1_intro

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.activity_main.*


public class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clickMeButton = findViewById(R.id.click_me_button) as Button
        val andMeButton = findViewById(R.id.and_me_button) as Button

        clickMeButton.setOnClickListener {
            Toast.makeText(this, "Thank you!", Toast.LENGTH_SHORT).show()
        }

        andMeButton.showToastOnClick()
    }

    fun Button.showToastOnClick(text: String = "Thank you!") {
        this.setOnClickListener {
            Toast.makeText(this@MainActivity, text, Toast.LENGTH_SHORT).show()
        }
    }
}
