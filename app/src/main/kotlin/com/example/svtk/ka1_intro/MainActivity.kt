package com.example.svtk.ka1_intro

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.singleTop
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast
import kotlinx.android.synthetic.activity_main.click_me_button
import kotlinx.android.synthetic.activity_main.and_me_button


public class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clickMeButton = findViewById(R.id.click_me_button) as Button

        clickMeButton.setOnClickListener {
            Toast.makeText(this, "Thank you!", Toast.LENGTH_SHORT).show()

//            toast("Thank you!")
        }

        and_me_button.setOnClickListener {
            val intent = Intent(this, javaClass<NewActivity>())
            intent.putExtra("ANSWER", 42)
            intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP)
            startActivity(intent)

        }
    }
}

//            startActivity(intentFor<NewActivity>("ANSWER" to 42).singleTop())
//            startActivity<NewActivity>("ANSWER" to 42)
