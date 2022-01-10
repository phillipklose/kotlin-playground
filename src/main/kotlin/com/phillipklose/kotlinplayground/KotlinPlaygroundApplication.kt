package com.phillipklose.kotlinplayground

import com.phillipklose.kotlinplayground.sandpit.Basics
import com.phillipklose.kotlinplayground.sandpit.abstractclasses.AbstractClassesBasics
import com.phillipklose.kotlinplayground.sandpit.collections.ListBasics
import com.phillipklose.kotlinplayground.sandpit.collections.MapBasics
import com.phillipklose.kotlinplayground.sandpit.dataclasses.DataClassesBasics
import com.phillipklose.kotlinplayground.sandpit.extensionfunctions.ExtensionFunctionsBasics
import com.phillipklose.kotlinplayground.sandpit.ifexpressions.IfExpressionsBasics
import com.phillipklose.kotlinplayground.sandpit.ifnull.IfNullBasics
import com.phillipklose.kotlinplayground.sandpit.ranges.RangeBasics
import com.phillipklose.kotlinplayground.sandpit.whenexpression.WhenBasics
import com.phillipklose.kotlinplayground.sandpit.withexpressions.WithExpressionsBasics
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinPlaygroundApplication

fun main(args: Array<String>) {
    runApplication<KotlinPlaygroundApplication>(*args)

    // Play in here
    Basics().execute()
    DataClassesBasics().execute()
    ListBasics().execute()
    MapBasics().execute()
    WhenBasics().execute()
    RangeBasics().execute()
    ExtensionFunctionsBasics().execute()
    AbstractClassesBasics().execute()
    IfNullBasics().execute()
    IfExpressionsBasics().execute()
    WithExpressionsBasics().execute()
}
