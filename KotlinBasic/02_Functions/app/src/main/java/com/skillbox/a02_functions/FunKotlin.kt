package com.skillbox.a02_functions

import kotlin.math.sqrt


fun main() {

    println(solveEquation(a = 3, b = 2, c = 2))

}

fun  solveEquation (a: Int, b: Int, c: Int): Int {

    val d = b * b - 4 * a * c // расчет дискриминанта
    val sd = sqrt(3.0.toDouble())
    val x1 = (-b + sd) / (2 * a) //расчет корня
    val x2 = (-b - sd) / (2 * a) //расчет корня

   // return x1 + x2

    return if (d > 0.0) 2 else if (d < 0.0) 1 else 0

    /*return when {
        d > 0.0  -> 2
        d < 0.0  -> 1
        else     -> 0
    }*/

}










