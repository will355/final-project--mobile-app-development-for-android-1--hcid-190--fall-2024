package com.example.matrixdiamondapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // References to buttons
        val matrixButton = findViewById<Button>(R.id.matrixButton)
        val diamondButton = findViewById<Button>(R.id.diamondButton)

        // Navigate to MatrixActivity
        matrixButton.setOnClickListener {
            val intent = Intent(this, MatrixActivity::class.java)
            startActivity(intent)
        }

        // Navigate to DiamondActivity
        diamondButton.setOnClickListener {
            val intent = Intent(this, DiamondActivity::class.java)
            startActivity(intent)
        }
    }
}
