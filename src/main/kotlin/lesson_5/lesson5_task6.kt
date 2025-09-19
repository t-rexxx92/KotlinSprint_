package org.example.lesson_5

import  kotlin.math.pow

fun main() {

    print("Это простой калькулятор ИМТ. Введите вес(в кг) пользователя: ")
    val weight = readln().toDouble()

    print("Введите рост(в см) пользователья: ")
    val high = readln().toDouble() * HIGH_CONVERTER

    val bmi: Double = weight / high.pow(2)

    when {
        bmi < 18.5 -> print("Недостаточная масса тела. ")
        bmi in 18.5..<25.0 -> print("Нормальная масса тела. ")
        bmi in 25.0..<30.0 -> print("Избыточная масса тела. ")
        bmi >= 30 -> print("Ожирение. ")
    }

    print("Ваш ИМТ: ${"%.2f".format(bmi)}")
}

const val HIGH_CONVERTER = 0.01