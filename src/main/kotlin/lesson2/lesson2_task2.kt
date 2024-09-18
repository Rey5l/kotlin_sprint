package org.example.lesson2

fun main() {
    val numberOfEmployees = 50
    val wagesOfEmployees = 30000

    val numberOfTrainees = 30
    val wagesOfTrainees = 20000

    val expensesForEmployees = numberOfEmployees * wagesOfEmployees
    val expensesForTrainees = numberOfTrainees * wagesOfTrainees

    val generalExpenses = expensesForEmployees + expensesForTrainees

    val averageSalary = (generalExpenses / (numberOfEmployees + numberOfTrainees))

    println("Расходы на выплату зарплаты постоянных сотрудников: $expensesForEmployees")
    println("Общие расходы по ЗП после прихода стажеров: $generalExpenses")
    println("Средняя ЗП одного сотрудника после прихода стажеров: $averageSalary")
}