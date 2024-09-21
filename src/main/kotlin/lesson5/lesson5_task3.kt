package org.example.lesson5

import kotlin.random.Random

fun main() {
    val correctNumber1 = 10
    val correctNumber2 = 25

    print("Введите первое число от 0 до 42: ")
    val userNumber1 = readLine()?.toIntOrNull() ?: -1

    print("Введите второе число от 0 до 42: ")
    val userNumber2 = readLine()?.toIntOrNull() ?: -1


    val bothNumberGuessed =
        (userNumber1 == correctNumber1 && userNumber2 == correctNumber2) || (userNumber1 == correctNumber2 && userNumber2 == correctNumber1)

    val oneNumberGuessed =
        (userNumber1 == correctNumber1 || userNumber1 == correctNumber2) || (userNumber2 == correctNumber1 || userNumber2 == correctNumber2)

    when {
        bothNumberGuessed -> println("Поздравляем! Вы выиграли главный приз!")
        oneNumberGuessed -> println("Вы выиграли утешительный приз!")
        else -> println("Неудача!")
    }

    println("Правильные числа были: $correctNumber1 и $correctNumber2")
}