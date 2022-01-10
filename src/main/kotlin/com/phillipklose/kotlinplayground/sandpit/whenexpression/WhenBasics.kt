package com.phillipklose.kotlinplayground.sandpit.whenexpression

class WhenBasics {

    fun execute() {
        Color.values()
            .map { whatIsTheColorLike(it) }
            .forEach { println(it) }
    }

    private fun whatIsTheColorLike(color: Color): String = when (color) {
        Color.BLUE -> "its blue like water"
        Color.RED -> "its red like tomato"
        Color.BLACK -> "its black like darkness"
        Color.YELLOW -> "its yellow like the sun"
    }
}