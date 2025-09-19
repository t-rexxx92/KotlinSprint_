package org.example.lesson_5

import java.time.LocalDate

fun main() {

    print("Введите год рождения пользователя: ")
    val userAge = LocalDate.now().year - readln().toInt()
    if (userAge >= AGE_OF_MAJORITY) print("Показать экран со скрытым контентом")
    else println("Доступ к скрытому контенту ограничен")

}

const val AGE_OF_MAJORITY = 18