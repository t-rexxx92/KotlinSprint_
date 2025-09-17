package org.example.lesson_5

import kotlin.system.exitProcess

fun main() {

    var userName: String
    var correctPass: String
    var enteredPass: String

    val usersPasswords = mapOf(
        "Zaphod" to "PanGalactic",
        "Marvin" to "depression",
        "Trillian" to "Madagascar"
    )

    println(
        """
        Приветствую Вас на борту корабля \"Heart of Gold\".
        Что ж, введи, пожалуйста, свое имя пользователя, чтобы мы могли приступить к процессу входа.
        Я всегда готов служить, хотя это не приносит мне радости... но вы, наверное, об этом не заботитесь.
        [вздыхает ещё глубже...] Да, вперед, пожалуйста, вводите свои данные...
    """.trimIndent()
    )

    try {
        userName = readln()
        correctPass = usersPasswords.getValue(userName)
    } catch (e: NoSuchElementException) {
        println("Пользователь с таким именем не найден. Пожалуйста пройдите процедуру регистрации нового пользователя.")
        exitProcess(0)
    }

    println("Замечательно, пользователь зарегистрирован в системе. К сожалению, мне нужен пароль...")
    enteredPass = readln()
    if (enteredPass == correctPass) {
        println(
            """
            [вздыхает...] Ваши данные проверены, и о, чудо, они верны... Пользователь "$userName", вам разрешено
            входить на борт корабля "Heart of Gold". Хотя мне всё равно... Ну вперед, войдите...
            Если вам так уж надо, в конце концов... [меланхолический вздох...] Надеюсь, вам понравится
            пребывание здесь больше, чем мне.
        """.trimIndent()
        )
    } else {
        println("Неверный пароль.")
    }

}