package org.example.lesson_3

fun main() {

    val packageMove = "D2-D4;0"

    // Пояснительная бригада по следующим трем строкам кода(в первую очередь для меня самого):
    // функкция split делит строку на отдельные строки по определенным мной разделителям,
    // которые я перечисляю в аргументах функции через запятую. Потом использую функцию map для
    // преобразования элементов в списке с помощью лямбды. it.trim() - обращение к текущему элементу списка
    // и удаление невидимых пробелов и других символов в начале и в конце строки. Функция filter возвращает
    // только те элементы, для которых условие в лямбде возвращает значение true. it.isNotBlank() - возвращает
    // true, если строка не пустая, не null и содержит хотя бы один видимый символ.
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