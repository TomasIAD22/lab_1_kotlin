package com.example.lab_1_kotlin

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.About)
        button.setOnClickListener {
            println("press About")
            val intentNavigate=Intent(this,AboutActivity::class.java)
            startActivity(intentNavigate)
        }
        val button1: Button = findViewById(R.id.Signin)
        button1.setOnClickListener {
            println("press Signin")
            val intentNavigate=Intent(this,SigninActivity::class.java)
            startActivity(intentNavigate)
        }
            val button2: Button = findViewById(R.id.Loggin)
            button2.setOnClickListener {
                println("press Loggin")
                val intentNavigate=Intent(this,LoggedinActivity::class.java)
                startActivity(intentNavigate)
            }
            }

    }


