package org.example.lesson_4

fun main() {

    val todayRes = 13
    val tomorrowRes = 9
    println("[Доступность столиков на сегодня: ${todayRes == FULLY_BOOKED}],\n[Доступность столиков на завтра: ${tomorrowRes == FULLY_BOOKED}]")

}

const val FULLY_BOOKED = 13