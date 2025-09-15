package org.example.lesson_2

fun main() {

    val timeStartHours = 9      // время отправления "часы"
    val timeStartMinutes = 39   // время отправления "минуты"
    val travelTime = 457        // время в пути
    var timeFinishHours: Int    // время прибития "часы"
    var timeFinishMinutes: Int  // время прибытия "минуты"

    var timeFinish = timeStartHours*60 + timeStartMinutes + travelTime
    if (timeFinish < 1440){
        timeFinishHours = timeFinish/60
        timeFinishMinutes = timeFinish - timeFinishHours*60
    } else {
        timeFinish -= 1440
        timeFinishHours = timeFinish/60
        timeFinishMinutes = timeFinish - timeFinishHours*60
    }

    println("Время прибытия поезда Москва-Краснодар: ${"%02d".format(timeFinishHours)}:${"%02d".format(timeFinishMinutes)}")
}