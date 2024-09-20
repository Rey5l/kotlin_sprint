package org.example.lesson2

const val FIFTY_PERCENT = 0.2

fun main() {
    val crystalOre = 7
    val ironOre = 11

    val bonusCrystals = (crystalOre * FIFTY_PERCENT).toInt()
    val bonusIrons = (ironOre * FIFTY_PERCENT).toInt()

    println("Количество бонусных кристаллов: $bonusCrystals")
    println("Количество бонусного железа: $bonusIrons")
}