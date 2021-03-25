package com.skillbox.a03loopsrecursivnullabletypes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

fun main() {
    var number = inputNumber()
    var counter: Int = 0
    var  sum = 0

    repeat(number) {
            val n: Int = readLine()?.toIntOrNull() ?: return
            number--
            if (n > 0) counter++
                sum += n

        }

    println(counter)
    println(sum)
    val b: Int = readLine()?.toIntOrNull() ?: return
    println("НОД = ${{ { gcd(sum, b) } }}")



}

private fun inputNumber(): Int {
    return readLine()?.toIntOrNull() ?: inputNumber()

}
tailrec fun gcd(a: Int, b: Int): Int {
    if (b == 0) return a
    return gcd(b,a% b)
}