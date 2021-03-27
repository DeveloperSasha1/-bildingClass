package com.skillbox.learnkotlin

fun main() {
    val akt: String = vasya(25, 76)
    println(akt)

    val a = 6
    val b = 10
    val result = summa(a, b)
    println(result)

}

fun tolya(nails: Int, tap: Int) {
    println("Снять старую сантехнику")
    println("Заменить отводы")
    println("И ещё работу ....")
    println("Установить новую сантехнику")
    println("$nails и $tap")
}

fun vasya(nails: Int, tap: Int): String {
    println("Снять старый паркет")

    println("И ещё работу ....")
    println("Установить новый паркет")
    println("$nails и $tap")
    return "Акт о проделанной работе"
}

fun summa(param1: Int, param2: Int): Int {
    return param1 + param2
}

