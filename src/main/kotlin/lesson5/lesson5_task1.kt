package org.example.lesson5

import kotlin.random.Random

fun main() {
    val number1 = Random.nextInt(1, 10)
    val number2 = Random.nextInt(1, 10)

    println("Для входа в приложение, решите пример")
    println("$number1 + $number2 = ?")

    val userAnswer = readLine()!!.toIntOrNull()

    val correctAnswer = number1 + number2

    if (userAnswer == correctAnswer) {
        println(WELCOME_MESSAGE)
    } else {
        println(ACCESS_DENIED_MESSAGE)
    }
}

const val WELCOME_MESSAGE = "Добро пожаловать!"
const val ACCESS_DENIED_MESSAGE = "Доступ запрещен"