package org.example.lesson_2

fun main() {

    val gradeBook = intArrayOf(3, 4, 3, 5)
    val studentCounter = gradeBook.size
    var sum = 0
    for(i in gradeBook) {
        sum += i
    }
    val roundedGrade = "%.2f".format(sum.toFloat()/gradeBook.size)

    println("students: $studentCounter\naverage grade: $roundedGrade")
}