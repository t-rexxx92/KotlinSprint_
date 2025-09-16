package org.example.lesson_4

fun main() {

    /*Критерии благоприятных условий включают:

    - наличие солнечной погоды;
    - открытый тент;
    - влажность воздуха составляет 20%;
    - текущее время года - не зима.*/

    val weatherIsSunny = true
    val awningIsOpen = true
    val airHumidity = 20
    val season = "зима"

    println(
        "Благоприятные ли условия сейчас для роста бобовых? " +
                "${
                    weatherIsSunny && awningIsOpen &&
                            airHumidity == 20 && season != "зима"
                }"
    )
}