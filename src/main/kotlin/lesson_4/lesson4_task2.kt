package org.example.lesson_4

data class Cargo(val weight: Int, val volume: Int)

fun main() {

    // Average - условия:
    // weight >35 && <=100
    // volume <100

    val cargo1 = Cargo(20, 80)
    val cargo2 = Cargo(50, 100)
    println(
        "Груз #1 с весом ${cargo1.weight}кг и объемом ${cargo1.volume}л соответствует категории 'Average': " +
                "${cargo1.weight > 35 && cargo1.weight <= 100 && cargo1.volume < 100}"
    )
    println(
        "Груз #1 с весом ${cargo2.weight}кг и объемом ${cargo2.volume}л соответствует категории 'Average': " +
                "${cargo2.weight > 35 && cargo2.weight <= 100 && cargo2.volume < 100}"
    )

}