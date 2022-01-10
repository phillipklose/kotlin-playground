package com.phillipklose.kotlinplayground.sandpit.ranges

class RangeBasics {

    fun execute() {
        // Try for loops with ranges
        for (i in 1..10) {
            print("$i..")
        }

        println()

        for (i in 1 until 10) {
            print("$i..")
        }

        println()

        for (x in 2..10 step 2) {
            print("$x..")
        }

        println()

        for (x in 10 downTo 1 step 3) {
            print("$x..")
        }

        println()

        (1..10).forEach { print("$it..") }

        println()

        // Check if number is in range
        val min = 1
        val max = 10

        val number = 7
        if (number in min..max) {
            println("number $number is in range [$min, $max]")
        }

        // Check if list index or size is in proper range
        val list = listOf("a", "b", "c")

        if (-1 !in 0..list.lastIndex) {
            println("-1 is out of range")
        }
        if (list.size !in list.indices) {
            println("list size is out of valid list indices range, too")
        }
    }
}