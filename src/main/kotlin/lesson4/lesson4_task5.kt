package org.example.lesson4

fun main() {
    print("Есть ли повреждения корпуса (true/false): ")
    val hasDamage = readLine()?.toBoolean() ?: false

    print("Введите текущий состав экипажа: ")
    val crewSize = readLine()?.toIntOrNull() ?: 0

    print("Введите количество ящиков с провизией: ")
    val foodSupply = readLine()?.toIntOrNull() ?: 0

    print("Благоприятная ли погода (true/false): ")
    val isWeatherGood = readLine()?.toBoolean() ?: false

    val canSail = (!hasDamage && crewSize in 55..70 && foodSupply > 50) ||
            (hasDamage && crewSize == 70 && isWeatherGood && foodSupply >= 50)

    println("Корабль может отправиться в плавание: $canSail")
}