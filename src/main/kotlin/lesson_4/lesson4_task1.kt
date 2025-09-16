package org.example.lesson_4

fun main() {

    val todayRes = 13
    val tomorrowRes = 9
    println("[Доступность столиков на сегодня: ${todayRes == TABLES}],\n[Доступность столиков на завтра: ${tomorrowRes == TABLES}]")

}

const val TABLES = 13