package org.example.lesson1

fun main() {
    val year: Int = 1961
    var hour: Int = 9
    var minute: Int = 7

    println(year)
    print("0$hour:")
    println("0$minute")

    hour = 10
    minute = 55

    print("$hour:")
    println(minute)
}