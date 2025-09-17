package org.example.lesson_2

fun main() {

    val gradeBook = intArrayOf(3, 4, 3, 5)
    val studentCounter = gradeBook.size
    val roundedGrade = "%.2f".format(gradeBook.sum().toFloat()/gradeBook.size)

    println("students: $studentCounter\naverage grade: $roundedGrade")
}