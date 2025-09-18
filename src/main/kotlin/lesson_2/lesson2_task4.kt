package org.example.lesson_2

fun main() {

    val crystallineOre: Int = 7
    val ironOre: Int = 11
    val buff: Int = 20

    val extraCrystallineOre = (crystallineOre * buff / PERCENTAGE).toInt()
    val extraIronOre = (ironOre * buff / PERCENTAGE).toInt()
    println(
        """
        После бафа!
        количество дополнительной кристаллической руды: $extraCrystallineOre
        количество дополнительной железной руды: $extraIronOre
    """.trimIndent()
    )
}

const val PERCENTAGE = 100