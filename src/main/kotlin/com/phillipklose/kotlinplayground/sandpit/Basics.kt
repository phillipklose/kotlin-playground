package com.phillipklose.kotlinplayground.sandpit

import com.phillipklose.kotlinplayground.sandpit.shapes.Rectangle
import com.phillipklose.kotlinplayground.sandpit.shapes.Shape

class Basics {

    fun execute() {
        sum(5, 10)
        printSum(5, 10)
        variables()
        shapes()
        comments()
        stringTemplates()
        forLoop()
        whileLoop()
        whenExpressionExamples()
        doesCollectionContainObject()
        filterCollectionWithLambdas()
        canReturnNullExamples()
        getLengthOfStringExample()
    }

    fun sum(a: Int, b: Int): Int = a + b
    fun printSum(a: Int, b: Int) = println("sum of $a and $b is ${a + b}")
    fun variables() {
        // Read-only local variables are defined using the keyword val. They can be assigned a value only once
        val a: Int = 1
        val b = 2

        // Variables that can be reassigned use the var keyword.
        var x = 5
        println("variable x after initialization is $x")
        x += 10
        println("variable x after reassigned is $x")
    }

    fun shapes() {
        val rectangle = Rectangle(10.0, 3.0)
        println("is rectangle of class shape? ans. ${rectangle is Shape}")
        println(rectangle)
    }

    fun comments() {
        // This is an end-of-line comment

        /* This is a block comment
           on multiple lines. */
    }

    fun stringTemplates() {
        var a = 1
        val text = "a is $a" // a is 1

        a = 2
        val changedText = "${text.replace("is", "was")}, but now is $a" // a was 1, but now is 2

        println(text)
        println(changedText)
    }

    fun forLoop() {
        val toys = listOf("sand shovel", "sand bucket", "sand rakes")

        println("Print all toys in for loop")
        for (toy in toys) {
            println(toy)
        }

        println("Print all toys in for loop with indicies")
        for (index in toys.indices) {
            println("at index $index is ${toys[index]}")
        }
    }

    fun whileLoop() {
        val numbers = listOf(1, 2, 3, 4, 5)
        var index = 0

        println("Print all numbers in while loop")
        while (index < numbers.size) {
            println("at index $index is ${numbers[index]}")
            index++
        }
    }

    fun whenExpressionExamples() {
        println(whenExpression(1))
        println(whenExpression("Hello"))
        println(whenExpression(1L))
        println(whenExpression(true))
        println(whenExpression("some random string"))
    }

    fun whenExpression(obj: Any): String = when (obj) {
        1 -> "That is a number One"
        "Hello" -> "That is a Greeting"
        is Long -> "That is a Long"
        !is String -> "That is not a String"
        else -> "Unknown at the end..."
    }

    fun doesCollectionContainObject() {
        val list = listOf("apple", "orange", "banana")
        when {
            "orange" in list -> println("orange is in the list!")
            "apple" in list -> println("apple is in the list!")
            "melon" in list -> println("melon is in the list!")
        }
    }

    fun filterCollectionWithLambdas() {
        val fruits = listOf("apple", "banana", "avocado", "kiwi", "orange")
        fruits
            .filter { it.startsWith("a") }
            .sortedBy { it }
            .map { it.uppercase() }
            .forEach { println(it) }
    }

    fun canReturnNullExamples() {
        println(canReturnNullIfGraterThan5(3))
        println(canReturnNullIfGraterThan5(-10))
        println(canReturnNullIfGraterThan5(5))
        println(canReturnNullIfGraterThan5(6))
    }

    // A reference must be explicitly marked as nullable when null value is possible.
    // Nullable type names have ? at the end.
    fun canReturnNullIfGraterThan5(a: Int): Int? = if (a <= 5) a else null

    fun getLengthOfStringExample() {
        println(getLengthOfGivenString("jeden"))
        println(getLengthOfGivenString(1))
        println(getLengthOfGivenStringOnlyIfGraterThan5("jeden"))
        println(getLengthOfGivenStringOnlyIfGraterThan5("jedenascie"))
    }

    fun getLengthOfGivenString(obj: Any): Int? {
        // `obj` is automatically cast to `String`
        // `obj` in else is of type `Any`
        return if (obj is String) obj.length else null
    }

    fun getLengthOfGivenStringOnlyIfGraterThan5(obj: Any): Int? {
        return if (obj is String && obj.length > 5) obj.length else null
    }
}