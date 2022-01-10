package com.phillipklose.kotlinplayground.sandpit.shapes

class Rectangle(val height: Double, val length: Double) : Shape() {
    val perimeter = (height + length) * 2
    override fun toString(): String {
        return "Rectangle(height=$height, length=$length, perimeter=$perimeter)"
    }
}
