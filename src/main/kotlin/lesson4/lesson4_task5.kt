package org.example.lesson4

const val MIN_CREW_SIZE = 55
const val MAX_CREW_SIZE = 70
const val MIN_FOOD_SUPPLY = 50
const val RECOMMENDED_CREW_SIZE = 70

fun main() {
    print("Есть ли повреждения корпуса (true/false): ")
    val hasDamage = readLine()?.toBoolean() ?: false

    print("Введите текущий состав экипажа: ")
    val crewSize = readLine()?.toIntOrNull() ?: 0

    print("Введите количество ящиков с провизией: ")
    val foodSupply = readLine()?.toIntOrNull() ?: 0

    print("Благоприятная ли погода (true/false): ")
    val isWeatherGood = readLine()?.toBoolean() ?: false

    val canSail = (!hasDamage && crewSize in MIN_CREW_SIZE..MAX_CREW_SIZE && foodSupply > MIN_FOOD_SUPPLY) ||
            (hasDamage && crewSize == RECOMMENDED_CREW_SIZE && isWeatherGood && foodSupply >= MIN_FOOD_SUPPLY)

    println("Корабль может отправиться в плавание: $canSail")
}