package com.phillipklose.kotlinplayground.sandpit.collections

class MapBasics {

    fun execute() {
        val map = mapOf("John" to 21, "Bob" to 63, "Dean" to 30)

        // access a map entry
        println(map["John"])

        // iterate over all entries of a map
        for ((name, age) in map) {
            println("$name -> $age")
        }
    }
}