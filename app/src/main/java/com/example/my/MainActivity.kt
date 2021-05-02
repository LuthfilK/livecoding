package com.example.my

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_login.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }
        btn_register.setOnClickListener {
            startActivity(Intent(this, RegisActivity::class.java))
            finish()
        }
    }
}