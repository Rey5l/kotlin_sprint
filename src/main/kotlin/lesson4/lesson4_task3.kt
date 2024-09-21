package org.example.lesson4

const val REQUIRED_HUMIDITY = 20
const val WINTER_SEASON = "зима"

fun main() {
    val isSunny = true
    val isTentOpen = true
    val humidity = 20
    val currentSeason = "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? ${(isSunny) && (isTentOpen) && 
            (humidity == REQUIRED_HUMIDITY) && (currentSeason != WINTER_SEASON)}")
}