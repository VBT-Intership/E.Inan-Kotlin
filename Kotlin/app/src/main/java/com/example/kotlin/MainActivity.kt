package com.example.kotlin

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatViewInflater
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var num=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun paintRed(view:View){
        button.setBackgroundColor(Color.RED)

    }
    fun paintYellow(view:View){
        button2.setBackgroundColor(Color.YELLOW)

    }
    fun paintBlue(view:View){
        button3.setBackgroundColor(Color.BLUE)

    }
    fun countNum(view:View){
        num++;
        textView.text="NUM: $num"

    }


}



