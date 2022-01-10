package com.phillipklose.kotlinplayground.sandpit.withexpressions

class WithExpressionsBasics {

    fun execute() {
        val turtle = Turtle()

        // Call multiple methods on an object instance
        with(turtle) {
            forward()
            turn(30.0)
            forward()
            turn(180.0)
            for (i in 1..3) rest(3.0)
        }
    }

    class Turtle {
        fun forward() = println("Turtle go forward")
        fun turn(degrees: Double) = println("Turtle turn by $degrees degrees")
        fun rest(time: Double) = println("Turtle rest $time hours")
    }
}