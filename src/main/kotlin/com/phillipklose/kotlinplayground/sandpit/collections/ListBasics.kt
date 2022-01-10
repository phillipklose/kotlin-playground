package com.phillipklose.kotlinplayground.sandpit.collections

class ListBasics {

    fun execute() {
        val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
        val emails = listOf("john@email.com", "jack@email.com", "bob@email.com")

        // Filter elements bigger then 5 and print
        numbers
            .filter { it > 5 }
            .forEach { println(it) }

        // Check element presence in a collection
        if ("john@email.com" in emails) {
            println("The email john@email.com is present in the list!")
        }

        if ("phillip@email.com" !in emails) {
            println("The email phillip@email.com is not present in the list!")
        }

    }
}