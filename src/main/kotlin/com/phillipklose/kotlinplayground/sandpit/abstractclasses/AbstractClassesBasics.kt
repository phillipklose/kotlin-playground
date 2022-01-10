package com.phillipklose.kotlinplayground.sandpit.abstractclasses

class AbstractClassesBasics {

    fun execute() {
        val clazz = object : MyAbstractClass() {
            override fun doSomething() {
                println("Doing something for you :)")
            }

            override fun sleep() {
                println("Goodnight <handwave>")
            }
        }

        clazz.doSomething()
        clazz.sleep()
    }
}