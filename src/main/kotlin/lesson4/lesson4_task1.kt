package org.example.lesson4

fun main() {
    val totalTables = 13

    val bookedToday = 13
    val bookedTomorrow = 9

    val isAvailableToday = bookedToday < totalTables
    val isAvailableTomorrow = bookedTomorrow < totalTables

    println("Доступность столов на сегодня: $isAvailableToday")
    println("Доступность столов на завтра: $isAvailableTomorrow")
}