package com.phillipklose.kotlinplayground.sandpit.ifexpressions

class IfExpressionsBasics {

    fun execute() {
        val a = 10
        val b = 99
        val max = if (a > b) a else b

        println("MaxOf($a, $b) = $max")
    }
}