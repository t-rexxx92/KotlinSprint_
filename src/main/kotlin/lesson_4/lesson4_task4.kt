package org.example.lesson_4

fun main() {

    val trainingDayNumber = 5

    println("""
        Текущий тренировочный день: $trainingDayNumber
        Упражнения для рук:     ${trainingDayNumber % 2 != 0}
        Упражнения для ног:     ${trainingDayNumber % 2 == 0}
        Упражнения для спины:   ${trainingDayNumber % 2 == 0}
        Упражнения для пресса:  ${trainingDayNumber % 2 != 0}
    """.trimIndent())
}