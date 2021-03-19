package com.skillbox.a02_functions

import kotlin.math.sqrt

fun main() {

    val solutionSum = solveEquation(a = -1, b = 2, c = 3344556)
    println(solutionSum)

}


fun  solveEquation (a: Int, b: Int, c: Int): Double {

    val dis = (b * b - 4 * a * c).toDouble() // расчет дискриминанта
    if (dis < 0) println("Нет корней") else if (dis > 0) println("Два корня") else println("Один корень")
    //проверка дискриминанта на три условия до расчета корней
    val x1 = (-b + sqrt(dis)) / (2 * a) //расчет 1 корня
    val x2 = (-b - sqrt(dis)) / (2 * a) //расчет 2 корня
    val solutionSum = x1 + x2//сумму корней сохраняем в переменную
    return solutionSum

}










