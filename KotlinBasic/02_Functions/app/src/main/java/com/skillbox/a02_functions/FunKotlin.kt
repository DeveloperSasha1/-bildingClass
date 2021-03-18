package com.skillbox.a02_functions

import kotlin.math.sqrt

fun main() {

    val solutionSum = solveEquation(a = 3, b = 2, c = 4)
    println(solutionSum)

}


fun  solveEquation (a: Int, b: Int, c: Int): Double {

    val d = b * b - 4 * a * c // расчет дискриминанта
    val x1 = (-b + sqrt(d.toDouble())) / (2 * a) //расчет корня
    val x2 = (-b - sqrt(d.toDouble())) / (2 * a) //расчет корня
    return x1 + x2
}










