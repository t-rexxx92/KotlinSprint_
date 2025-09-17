package org.example.lesson_5

import kotlin.random.Random

fun main() {

    var counter = 0
    val targetNumbers = mutableListOf<Int>()
    val enteredNumbers = mutableListOf<Int>()

    while (counter != QUANTITY_OF_NUMBERS) {
        targetNumbers.add(Random.nextInt(MAX_NUMBER + 1))
        counter++
    }

    println("Добрый день! Нужно угадать $QUANTITY_OF_NUMBERS числа, участвуют числа от 0 до $MAX_NUMBER. Удачи в лотерее!")

    counter = 0
    while (counter != QUANTITY_OF_NUMBERS) {
        print("Введите ${counter + 1}-е число: ")
        enteredNumbers.add(readln().toInt())
        if (enteredNumbers[counter] !in 0..MAX_NUMBER) {
            println("Введенное число выходит за границы разрешенного диапазона. Попробуйте еще раз")
            enteredNumbers.removeAt(counter)
            counter--
        }
        counter++
    }

    val coincided = enteredNumbers.intersect(targetNumbers.toSet()).size
    when (coincided) {
        0 -> println("К сожалению, вы проиграли.")
        1 -> println("Вы выйграли утешительный приз.")
        2 -> println("Вы выйграли крупный приз.")
        3 -> println("Вы выйграли джекпот!")
    }

    println("Выйгрышные числа: $targetNumbers")
}

const val QUANTITY_OF_NUMBERS = 3
const val MAX_NUMBER = 42