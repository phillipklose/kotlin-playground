package com.phillipklose.kotlinplayground.sandpit.ifnull

class IfNullBasics {

    fun execute() {
        val numbers = listOf(1, 2, 3)
        var possiblyNullNumbers: List<Int>? = null

        println(numbers.size)
        println(possiblyNullNumbers?.size)
        println(possiblyNullNumbers?.size ?: "empty list")
        println(possiblyNullNumbers?.firstOrNull() ?: "empty list")

        possiblyNullNumbers = listOf(5, 6, 7, 8)
        println(possiblyNullNumbers?.size)

        val emails = mapOf(
            "a@mail.com" to "Kowalski",
            "b@mail.com" to "Nowak"
        )
        emails["kowalski@mail.com"] ?: println("Email was not found :/")
        emails["kowalski@mail.com"].let { println("This is not executed, the value was null") }

    }
}