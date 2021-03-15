package com.skillbox.a01_basicsyntax

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

fun main() {

    val  firstName = "Aleksandr"
    val lastName = "Shchekin"
    val height = 150
    val weight = 40f
    val isChild = height >= 150 && weight >= 30
    val info = "My name is $firstName and lastName is $lastName. My height is $height sm. and weight is $weight kg. " +
            "I'am is child and it is $isChild"
    println(info)

}