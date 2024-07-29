package com.example.hw6_3month

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, FirstFragment())
            .commit()

        findViewById<Button>(R.id.buttonFirstFragment).setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, FirstFragment())
                .commit()
        }

        findViewById<Button>(R.id.buttonSecondFragment).setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, SecondFragment())
                .commit()
        }

        findViewById<Button>(R.id.buttonThirdFragment).setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, ThirdFragment())
                .commit()
        }
    }
}
