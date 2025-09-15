package org.example.lesson_1

fun main() {

    val fullTime = 6480
    val hours = fullTime/3600
    val minutes = (fullTime-hours.toInt()*3600)/60
    val seconds = fullTime-hours.toInt()*3600-minutes.toInt()*60

    // посмотрел функционал format() в предыдущес уроке, пригодилось)
    println("Время в космосе: ${"%02d".format(hours)}:${"%02d".format(minutes)}:${"%02d".format(seconds)}")

}