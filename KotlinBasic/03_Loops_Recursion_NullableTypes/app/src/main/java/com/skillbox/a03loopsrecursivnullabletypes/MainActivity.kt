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
    var N = readLine()?.toIntOrNull() ?: return
    var counter: Int = 0
    var  sum = 0

    while (N > 0) {
            var n: Int = readLine()?.toIntOrNull() ?: continue
            N--
            if (n > 0) counter++
                sum += n

        }

    println(counter)
    println(sum)
    val b: Int = readLine()?.toIntOrNull() ?: return
    println("НОД = ${{ { gcd(sum, b) } }}")



}
tailrec fun gcd(a: Int, b: Int): Int {
    if (b == 0) return a
    return gcd(b,a% b)
}