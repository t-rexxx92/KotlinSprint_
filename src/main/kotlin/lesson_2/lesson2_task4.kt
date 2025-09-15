package org.example.lesson_2

fun main() {

    val crystallineOre: Int = 7     // количество кристаллической руды
    val ironOre: Int = 11           // количество железной руды
    val buff: Int = 20              // бафф на ресурсы в процентах

    val extraCrystallineOre = (crystallineOre*buff/100).toInt()
    val extraIronOre = (ironOre*buff/100).toInt()
    println("""
        После бафа!
        количество дополнительной кристаллической руды: $extraCrystallineOre
        количество дополнительной железной руды: $extraIronOre
    """.trimIndent())
}