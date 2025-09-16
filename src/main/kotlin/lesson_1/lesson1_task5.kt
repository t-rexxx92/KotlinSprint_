package org.example.lesson_1

fun main() {

    val fullTime = 6480
    val hours = fullTime / HOUR
    val minutes = fullTime % HOUR / MINUTE
    val seconds = fullTime % MINUTE

    // посмотрел функционал format() в предыдущес уроке, пригодилось)
    println("Время в космосе: ${"%02d:%02d:%02d".format(hours, minutes, seconds)}")

}

const val MINUTE = 60
const val HOUR = 3600