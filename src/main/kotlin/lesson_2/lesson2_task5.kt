package org.example.lesson_2
import kotlin.math.pow


fun main() {

    val bankDeposit = 70_000    // сумма депозита, в рублях
    val interestRate = 16.7     // процентная ставка
    val validityPeriod = 20     // срок действия вклада, в годах

    val totalAmount = bankDeposit * (1 + interestRate/100).pow(validityPeriod)

    println("итоговая сумма: ${"%.3f".format(totalAmount)}")
}