package org.example.lesson3.task2

fun main() {

    val ledy: Citizen = Citizen("Андреева", "Татьяна", "Сергеевна")
    ledy.setNewSurname(22, "Сидорова")
    ledy.setNewSurname(23, "Иванова")
    ledy.getInfo(20)
    ledy.getInfo(22)
//    ledy.getInfo(23)
//    ledy.getInfo(25)

}