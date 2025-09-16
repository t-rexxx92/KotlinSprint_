package org.example.lesson_3

fun main() {

    print("Введите число: ")
    val multiplier: Int = readln().toInt()

    println("""
        $multiplier x 1 = ${multiplier * 1}
        $multiplier x 2 = ${multiplier * 2}
        $multiplier x 3 = ${multiplier * 3}
        $multiplier x 4 = ${multiplier * 4}
        $multiplier x 5 = ${multiplier * 5}
        $multiplier x 6 = ${multiplier * 6}
        $multiplier x 7 = ${multiplier * 7}
        $multiplier x 8 = ${multiplier * 8}
        $multiplier x 9 = ${multiplier * 9}
    """.trimIndent())
}