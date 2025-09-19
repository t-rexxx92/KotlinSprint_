package org.example.lesson_5

fun main() {

    print("Добро пожаловать в спортлото! Введите первое число: ")
    val number1 = readln().toInt()

    print("Отлично! Теперь введите второе число: ")
    var number2 = readln().toInt()
    if (number2 == number1) {
        print("Это число уже учавствует в лотерее. Введите другое число: ")
        number2 = readln().toInt()
    }

    var counter: Int = 0

    if (number1 == NUM1 || number1 == NUM2) counter++
    if (number2 == NUM1 || number2 == NUM2) counter++

    when (counter) {
        2 -> println("Поздравляем! Вы выиграли главный приз!")
        1 -> println("Вы выиграли утешительный приз!")
        else -> println("Неудача!")
    }

}

const val NUM1 = 17
const val NUM2 = 42