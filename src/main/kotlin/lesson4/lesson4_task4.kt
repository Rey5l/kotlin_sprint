package org.example.lesson4

fun main() {
    val day = 5

    val isUpperBody = day % 2 != 0

    println("""
        Упражнения для рук: ${isUpperBody}
        Упражнения для ног: ${!isUpperBody}
        Упражнения для спины: ${!isUpperBody}
        Упражнения для пресса: ${isUpperBody}
    """.trimIndent())
}