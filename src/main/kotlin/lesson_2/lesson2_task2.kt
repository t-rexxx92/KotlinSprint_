package org.example.lesson_2

fun main() {

    val employees = 50
    val interns = 30
    val eSalary = 50_000
    val iSalary = 20_000

    val primalSSalaryExpenses = employees * eSalary
    val fullSalaryExpenses = primalSSalaryExpenses + interns * iSalary
    val averageSalary = fullSalaryExpenses / (employees + interns)

    println("""
        Расходы на выплату зарплаты постоянных сотрудников: ${"%,d".format(primalSSalaryExpenses)}
        Общие расходы по ЗП после прихода стажеров: ${"%,d".format(fullSalaryExpenses)}
        Средняя ЗП одного сотрудника после устройства стажеров: ${"%,d".format(averageSalary)}
    """.trimIndent())
}