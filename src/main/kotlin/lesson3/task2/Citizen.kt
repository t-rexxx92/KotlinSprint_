package org.example.lesson3.task2

data class AgeSurname(val age: Int, val surname: String)

class Citizen(
    surname: String,
    val name: String,
    val patronymic: String,) {

    val zeroAge:AgeSurname  = AgeSurname(0,surname)
    // пары возрст-фамилия. По умолчанию, с рождения уже есть пара с девечьей фамилией
    val listOfSurnames: MutableList<AgeSurname> = mutableListOf(zeroAge)


    fun setNewSurname(age: Int, newSurname: String){
        val newAgeSurname = AgeSurname(age, newSurname)
        listOfSurnames.addLast(newAgeSurname)
    }


    fun getInfo(age: Int){
        if (listOfSurnames.size > 1) {
            var counter = 1
            while (listOfSurnames.size != counter){
                if (listOfSurnames[counter-1].age <= age && listOfSurnames[counter].age > age){
                    println("ФИО: ${listOfSurnames[counter-1].surname} $name $patronymic\nВозраст: $age")
                    return
                }
                counter++
                if (counter == listOfSurnames.size){
                    println("ФИО: ${listOfSurnames[counter-1].surname} $name $patronymic\nВозраст: $age")
                    return
                }
            }
        } else {
            println("Ф.И.О.: ${listOfSurnames[0].surname} $name $patronymic\nВозраст: $age")
        }
    }

}