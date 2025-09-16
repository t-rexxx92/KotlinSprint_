package org.example.lesson_1

fun main() {

    val lenght: Long = 40868600000L
    val age: UByte = 27u
    val partOfDay: Float = 0.075f
    val seconds: UShort = 6480u
    val partOfYear: Double = 2.0547945205479453E-4
    val apogee: UInt = 327000u
    /* При форматировании значения в строку с использованием функции format()
    у меня в консоль выводятся переменная formatted либо c пробелами при запуске с помощью инструмена run with coverage,
    либо со значками ромбика с вопросом внутри вместо нужных мне символов подчеркивания. Проверил код в онлайн интерпритаторе,
    все выводится корректно. Явно проблема у меня в среде разработки. (пишу прямо здесь для себя, комментарии
    дублирую в github для Вас)
     */
    val formatted = "%,d".format(lenght).replace(',', '_')

    val outputAnswer = """
        Расстояние: $formatted
        Возраст: $age
        Часть дня: $partOfDay
        Секунды: $seconds
        Часть года: $partOfYear
        Апогей орбиты: $apogee
    """.trimIndent()

    println(outputAnswer)

}