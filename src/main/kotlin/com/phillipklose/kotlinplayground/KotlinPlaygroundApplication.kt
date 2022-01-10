package com.phillipklose.kotlinplayground

import com.phillipklose.kotlinplayground.sandpit.Basics
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinPlaygroundApplication

fun main(args: Array<String>) {
    runApplication<KotlinPlaygroundApplication>(*args)

    // Play in here
    Basics().executeAll()

}
