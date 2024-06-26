package com.example.a5in1mobile

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val rlPajak = findViewById<RelativeLayout>(R.id.rl_pajak)
        rlPajak.setOnClickListener {
            val intent = Intent(this, PajakActivity::class.java)
            startActivity(intent)
        }

        val rlUang = findViewById<RelativeLayout>(R.id.rl_uang)
        rlUang.setOnClickListener {
            val intent = Intent(this, UangActivity::class.java)
            startActivity(intent)
        }

        val rlDiskon = findViewById<RelativeLayout>(R.id.rl_diskon)
        rlDiskon.setOnClickListener {
            val intent = Intent(this, DiskonActivity::class.java)
            startActivity(intent)
        }

        val rlBmi = findViewById<RelativeLayout>(R.id.rl_bmi)
        rlBmi.setOnClickListener {
            val intent = Intent(this, BmiActivity::class.java)
            startActivity(intent)
        }

        val rlKalori = findViewById<RelativeLayout>(R.id.rl_kalori)
        rlKalori.setOnClickListener {
            val intent = Intent(this, KaloriActivity::class.java)
            startActivity(intent)
        }
    }

}