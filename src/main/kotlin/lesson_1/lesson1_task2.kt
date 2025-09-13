package org.example.lesson_1

fun main(){
//    println("Тестовое решение к уроку 1 задаче 1")

    val orderCounter: UInt = 75U
    val gratitude: String = "Спасибо за покупку!"

    println("Количество заказов: $orderCounter. \nОтветное сообщение на покупку выглядит следующим образом: $gratitude")

    var employeeCounter: UInt = 2000u

//    println("Количество работников интернет-магазина: $employeeCounter")

    employeeCounter--
    println("К сожалению, один работник уволился. Количество работников интернет-магазина теперь: $employeeCounter")
}