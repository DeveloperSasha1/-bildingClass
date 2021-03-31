package com.skillbox.lessonkotlin

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.inflate
import com.skillbox.lessonkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val a = 324
    val b = 45

    val c = "324 и 45"

    lateinit var bildingClass : ActivityMainBinding
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bildingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bildingClass.root)

        bildingClass.b1.setOnClickListener {
            val result = a + b // to.String
            bildingClass.tvResult.text = "РЕЗУЛЬТАТ СЛОЖЕНИЯ РАВЕН: $result" //result
        }
        bildingClass.b2.setOnClickListener {
            val  result = a - b // to.String
            bildingClass.tvResult.text = "РЕЗУЛЬТАТ ВЫЧИТАНИЯ РАВЕН:$result" //result
        }
        bildingClass.b3.setOnClickListener {
            val result = a * b  // to.String
            bildingClass.tvResult.text = "РЕЗУЛЬТАТ УМНОЖЕНИЯ РАВЕН: $result" //result
        }

        bildingClass.b4.setOnClickListener {

            bildingClass.tvResult.text = c
        }

    }
}