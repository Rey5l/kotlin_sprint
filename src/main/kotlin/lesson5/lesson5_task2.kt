package org.example.lesson5

import java.util.Calendar

fun main() {
    val currentYear = Calendar.getInstance().get(Calendar.YEAR)

    print("Введите ваш год рождения: ")
    val birthYear = readLine()!!.toInt()

    val age = currentYear - birthYear

    if (age >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    } else {
        println("Доступ к контенту запрещен")
    }

}

const val AGE_OF_MAJORITY = 18