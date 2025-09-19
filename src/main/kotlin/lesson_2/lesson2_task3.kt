package org.example.lesson_2

fun main() {

    val timeStartHours = 19
    val timeStartMinutes = 39
    val travelTime = 457
    var timeFinishHours: Int
    var timeFinishMinutes: Int

    val timeFinish = timeStartHours * MINUTES_IN_HOUR + timeStartMinutes + travelTime
    timeFinishHours = timeFinish % MINUTES_IN_DAY / MINUTES_IN_HOUR
    timeFinishMinutes = timeFinish % MINUTES_IN_DAY % (timeFinishHours * MINUTES_IN_HOUR)
    println("Время прибытия поезда Москва-Краснодар: ${"%02d".format(timeFinishHours)}:${"%02d".format(timeFinishMinutes)}")
}

const val MINUTES_IN_HOUR = 60
const val MINUTES_IN_DAY = 1440