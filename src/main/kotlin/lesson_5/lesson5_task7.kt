package org.example.lesson_5

fun main() {

    fun readDoubleWithRetry(): Double {
        while (true) {
            try {
                return readln().toDouble()
            } catch (e: NumberFormatException) {
                println("Ошибка ввода. Введите корректное число")
            }
        }
    }

    print("Введите расстояние поездки (в километрах):")
    val distance = readDoubleWithRetry()

    print("Введите расход топлива на 100 км (в литрах):")
    val fuelConsumption = readDoubleWithRetry()

    print("Введите текущую цену за литр топлива:")
    val fuelPrice = readDoubleWithRetry()

    val totalFuelConsumption = distance * fuelConsumption * FLOW_RATE_COEFFICIENT
    val totalFuelPrice = totalFuelConsumption * fuelPrice

    println(
        """
        Общее количество топлива, необходимого на поездку: ${"%.2f".format(totalFuelConsumption)}
        Итоговая стоимость поездки(расходы на топливо): ${"%.2f".format(totalFuelPrice)}
    """.trimIndent()
    )

}

const val FLOW_RATE_COEFFICIENT = 0.01