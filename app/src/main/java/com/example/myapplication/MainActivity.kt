package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity: AppCompatActivity() {
    private val dialog1 = DemoBottomSheetDialog()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)

        button1.setOnClickListener {
            dialog1.show(supportFragmentManager, "TAG1")
        }

        button2.setOnClickListener {
            DemoBottomSheetDialog().show(supportFragmentManager, "TAG2")
        }
    }
}