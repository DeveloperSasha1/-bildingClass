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
    var height = 140
    var weight = 40f
    var isChild = height < 150 || weight < 40
    var info = "My name is $firstName and lastName is $lastName. My height is $height sm." +
            " and weight is $weight kg. I'am is child and it is $isChild"
    println(info)
    height = 150
    weight = 40f
    isChild = height < 150 || weight < 40
    info = "My name is $firstName and lastName is $lastName. My height is $height sm." +
            " and weight is $weight kg. I'am is child and it is $isChild"
    println(info)

}