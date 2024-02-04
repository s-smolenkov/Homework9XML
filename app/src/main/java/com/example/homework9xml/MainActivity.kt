package com.example.homework9xml

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var counter: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_layout)

        val savedData = MyApplication.getApp().getSavedData()
        counter = savedData
        val result: TextView = findViewById(R.id.result)
        "Result: $counter".also { result.text = it }

        val plusButton: Button = findViewById(R.id.addButton)
        plusButton.setOnClickListener {
            counter += 1
            "Result: $counter".also { result.text = it }
        }

        val minusButton: Button = findViewById(R.id.subButton)
        minusButton.setOnClickListener {
            counter -= 1
            if (counter < 1) {
                Toast.makeText(this, "Variable less than 1", Toast.LENGTH_SHORT).show()
            } else {
                "Result: $counter".also { result.text = it }
            }
        }
    }

    override fun onPause() {
        super.onPause()
        MyApplication.getApp().saveData(counter)
    }
}