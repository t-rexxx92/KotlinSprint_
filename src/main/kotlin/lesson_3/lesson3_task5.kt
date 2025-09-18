package org.example.lesson_3

fun main() {

    val packageMove = "D2-D4;0"
    val multiSplit = packageMove.split("-", ";").map { it.trim() }.filter { it.isNotBlank() }
    val moveFrom = multiSplit[0]
    val moveTo = multiSplit[1]
    val moveNumber = multiSplit[2].toInt()

    println(
        """
        moveFrom $moveFrom
        moveTo $moveTo
        moveNumber $moveNumber
    """.trimIndent()
    )

}