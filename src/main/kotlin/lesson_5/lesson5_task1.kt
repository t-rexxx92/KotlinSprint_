package org.example.lesson_5

import kotlin.random.Random

fun main() {

    val min = 1
    val max = 10
    val randomInt1 = Random.nextInt(max - min + 1) + min
    val randomInt2 = Random.nextInt(max - min + 1) + min
    print("Вы не робот? Решите уравнение: $randomInt1+$randomInt2=")
    val answer = readln().toInt()
    if (answer == randomInt1 + randomInt2){
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен")
    }
}