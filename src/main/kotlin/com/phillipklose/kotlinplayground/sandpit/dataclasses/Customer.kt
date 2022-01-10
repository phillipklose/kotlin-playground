package com.phillipklose.kotlinplayground.sandpit.dataclasses

internal data class Customer(private val name: String, private val email: String) {
    fun greeting(whoSayHallo: String = "") {
        println("Hi $whoSayHallo! Nice to meet you :) BR $name")
    }
}

/*
provides a Customer class with the following functionality:
- getters (and setters in case of vars) for all properties
- equals()
- hashCode()
- toString()
- copy()
- component1(), component2(), ..., for all properties (see Data classes)
 */
