package org.example.lesson_4

// Идеальные условия для вылета:
// shipHealthStatus == true
// crewSize >= 55 & <= 70
// provision >50
// weatherIsFavorable == true || false (любая в общем, не будем проверять)
//
// Допустимые(альтернативные) условия для вылета
// shipHealhStatus == false
// crewSize == 70
// provision >= 50
// weatherIsFavorable == true

fun main() {

    print("Корабль не имеет повреждений(true/false) ")
    val shipHealthStatus: Boolean = readln().toBoolean()
    print("Текущий состав экипажа: ")
    val crewSize: Int = readln().toInt()
    print("Количество ящиков с провизией на борту: ")
    val provision: Int = readln().toInt()
    print("благоприятность метеоусловий(true/false) ")
    val weatherIsFavorable: Boolean = readln().toBoolean()

    if((shipHealthStatus == true && crewSize in 55..70 && provision > 50) ||
        (shipHealthStatus == false && crewSize == 70 && provision >= 50 && weatherIsFavorable == true)){
        println("Вылет разрешен!")
    }
}