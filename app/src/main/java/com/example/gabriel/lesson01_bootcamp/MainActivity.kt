package com.example.gabriel.lesson01_bootcamp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun changeText(){
        btnSayHello.setOnClickListener{
            lblText.setText("hello")
        }
    }
}
