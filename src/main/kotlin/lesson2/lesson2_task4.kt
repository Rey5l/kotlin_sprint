package org.example.lesson2

const val HUNDRED_PERCENT = 100

fun main() {
    val crystalOre = 7
    val ironOre = 11
    val percent = 20

    val bonusCrystals = (crystalOre * percent / HUNDRED_PERCENT).toInt()
    val bonusIrons = (ironOre * percent / HUNDRED_PERCENT).toInt()

    println("Количество бонусных кристаллов: $bonusCrystals")
    println("Количество бонусного железа: $bonusIrons")
}