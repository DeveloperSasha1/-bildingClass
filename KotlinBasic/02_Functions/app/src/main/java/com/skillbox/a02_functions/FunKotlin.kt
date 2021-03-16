package com.skillbox.a02_functions

import kotlin.math.sqrt


fun main() {

    println(solveEquation(a = 2, b = 2, c = 2))

}

fun  solveEquation (a: Int, b: Int, c: Int): Double {

    val d = b * b - 4 * a * c // расчет дискриминанта
    val sd = sqrt(3.0.toDouble())
    val x1 = (-b + sd) / (2 * a) //расчет корня
    val x2 = (-b - sd) / (2 * a) //расчет корня

    return x1 + x2

}










