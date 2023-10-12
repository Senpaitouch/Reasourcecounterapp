package com.example.resourcecounterapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Navigate to Page 1
        findViewById<View>(R.id.btnPage1).setOnClickListener {
            startActivity(Intent(this, Page1Activity::class.java))
        }

        // Navigate to Page 2
        findViewById<View>(R.id.btnPage2).setOnClickListener {
            startActivity(Intent(this, Page2Activity::class.java))
        }

        // Navigate to Page 3 (assuming you have a Page3Activity and a button for it)
        findViewById<View>(R.id.btnPage3).setOnClickListener {
            startActivity(Intent(this, Page3Activity::class.java))
        }
    }
}
