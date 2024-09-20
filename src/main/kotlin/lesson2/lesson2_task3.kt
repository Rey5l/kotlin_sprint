package org.example.lesson2

const val MINUTES = 60

fun main() {
    val hourDeparture = 9
    val minuteDeparture = 39

    val minutesInWay = 457

    val totalMinutes = minuteDeparture + minutesInWay
    val hourArrival = hourDeparture + totalMinutes / MINUTES
    val minuteArrival = hourArrival % MINUTES

    println("Поезд прибывает в $hourArrival:$minuteArrival")
}