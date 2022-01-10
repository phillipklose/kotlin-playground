package com.phillipklose.kotlinplayground.sandpit.dataclasses

class DataClassesBasics {

    fun execute() {
        val customer = Customer("Phillip", "mail@gmail.com")
        customer.greeting("Tom")
        customer.greeting()
    }
}