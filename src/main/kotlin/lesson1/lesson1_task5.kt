package org.example.lesson1

fun main() {
    val totalSeconds: Short = 6480

    val SECONDS_IN_MINUTE = 60
    val SECONDS_IN_HOUR = 3600

    val hours = totalSeconds / SECONDS_IN_HOUR
    val remainingSeconds = totalSeconds % SECONDS_IN_HOUR
    val minutes = remainingSeconds / SECONDS_IN_MINUTE
    val seconds = remainingSeconds % SECONDS_IN_MINUTE

    val time = String.format("%02d:%02d:%02d", hours, minutes, seconds)

    println(time)

}