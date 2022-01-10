package com.phillipklose.kotlinplayground.sandpit.extensionfunctions

import kotlin.math.pow

class ExtensionFunctionsBasics {

    fun execute() {
        // Extension Methods
        "This String does not contain the word Ph...".isPhillipThere().let { println("Phillip found? ans. $it") }
        "This String does contain the word Phillip".isPhillipThere().let { println("Phillip found? ans. $it") }
        "This String does contain the word phillip".isPhillipThere().let { println("Phillip found? ans. $it") }

        // Infix Extension Methods
        println("5^2=${(5 toPowerOf 2)}")
        println("12^2=${(12 toPowerOf 2)}")

        // Operator Extension Methods
        println(listOf(1, 2, 3) * 4)
    }

    private fun String.isPhillipThere(): Boolean {
        return this.lowercase().contains("phillip")
    }

    private infix fun Number.toPowerOf(exponent: Number): Double {
        return this.toDouble().pow(exponent.toDouble())
    }

    private operator fun List<Int>.times(by: Int): List<Int> {
        return this.map { it * by }
    }
}