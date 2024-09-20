package org.example.lesson2

fun main() {
    val initialAmount = 70000
    val interestRate = 16.7 / 100
    val years = 20

    val finalAmount = initialAmount * Math.pow(1 + interestRate, years.toDouble())

    println("Размер вклада через $years лет: ${String.format("%.3f", finalAmount)}")
}