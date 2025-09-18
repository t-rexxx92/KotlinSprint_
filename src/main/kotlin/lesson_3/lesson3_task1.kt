package org.example.lesson_3

// Я уже прошел в августе курс котлин на ютубе до 20 урока включительно, поэтому я постоянно обращаюсь к
// пройденным лессонам и использую оттуда полученные знания. В данном примере пригодились уроки 5, 7 и 10
fun getGreeting(hour: Int?): String {
    return when (hour) {
        in 6..10 -> "Доброе утро,"
        in 11..16 -> "Добрый день,"
        in 17..21 -> "Добрый вечер,"
        else -> "Доброй ночи,"
    }
}

fun main() {

    // Объявляю переменные в одном месте для удоюства чтения, хотя понимаю, что мог
    // это сделать далее сразу проиницилизировав вызовом функции getGreeting() и задав нужное время
    val userName: String = "Андрей!"
    var greeting: String
    var hour: Int

/*//    Вариант с текущим временем на системе
    hour = LocalTime.now().hour*/

    hour = 12
    greeting = getGreeting(hour)
    println("$greeting $userName")

    hour = 20
    greeting = getGreeting(hour)
    println("$greeting $userName")

}