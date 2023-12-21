package com.example.homework9xml

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_layout)

        var counter = 0;

        val plusButton: Button = findViewById(R.id.plusButton)
        plusButton.setOnClickListener {
            counter += 1
            if (counter < 1) {
                Toast.makeText(this, "Variable less than 1", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "$counter", Toast.LENGTH_SHORT).show()
            }
        }

        val minusButton: Button = findViewById(R.id.minusButton)
        minusButton.setOnClickListener {
            counter -= 1
            if (counter < 1) {
                Toast.makeText(this, "Variable less than 1", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "$counter", Toast.LENGTH_SHORT).show()
            }
        }
    }
}