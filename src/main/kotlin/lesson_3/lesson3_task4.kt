package org.example.lesson_3

fun main() {

    var moveFrom = "E2"
    var moveTo = "E4"
    var moveNumber = 1
    var packageMove = "$moveFrom-$moveTo;$moveNumber"
    println("Строка для отправки: $packageMove")

    moveFrom = "D2"
    moveTo = "D3"
    moveNumber++
    packageMove = "$moveFrom-$moveTo;$moveNumber"
    println("Строка для отправки: $packageMove")

}