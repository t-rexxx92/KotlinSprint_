package org.example.lesson_2

fun main() {

    val timeStartHours = 19      // время отправления "часы"
    val timeStartMinutes = 39   // время отправления "минуты"
    val travelTime = 457        // время в пути
    var timeFinishHours: Int    // время прибития "часы"
    var timeFinishMinutes: Int  // время прибытия "минуты"

    val timeFinish = timeStartHours * HOUR + timeStartMinutes + travelTime
    timeFinishHours = timeFinish % DAY / HOUR
    timeFinishMinutes = timeFinish % DAY % (timeFinishHours * HOUR)
    println("Время прибытия поезда Москва-Краснодар: ${"%02d".format(timeFinishHours)}:${"%02d".format(timeFinishMinutes)}")
}

const val HOUR = 60
const val DAY = 1440