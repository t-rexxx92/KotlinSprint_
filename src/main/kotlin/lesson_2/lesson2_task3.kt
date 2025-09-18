package org.example.lesson_2

fun main() {

    val timeStartHours = 19
    val timeStartMinutes = 39
    val travelTime = 457
    var timeFinishHours: Int
    var timeFinishMinutes: Int

    val timeFinish = timeStartHours * HOUR + timeStartMinutes + travelTime
    timeFinishHours = timeFinish % DAY / HOUR
    timeFinishMinutes = timeFinish % DAY % (timeFinishHours * HOUR)
    println("Время прибытия поезда Москва-Краснодар: ${"%02d".format(timeFinishHours)}:${"%02d".format(timeFinishMinutes)}")
}

const val HOUR = 60
const val DAY = 1440