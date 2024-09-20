package org.example.lesson3

fun main() {
    val userName = "Иван"

    var greeting: String

    greeting = "Добрый день, $userName!"
    println(greeting)

    greeting = "Добрый вечер, $userName!"
    println(greeting)
}