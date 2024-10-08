package org.example

import org.example.Basic.ListOfCollections
import org.example.Basic.ListOfFlow
import org.example.Basic.ListOfFunctions
import org.example.Basic.ListOfLoops

class BasicController {
    fun listOfVariables() {
        // Read only declaration variable
        val name = "Kotlin"
        println("Read only variable: $name")

        // Mutable variable
        var age = 20
        age = 21

        println("Mutable variable: $age")
    }

    fun listOfDataTypes() {
        // Read only declaration variable
        val name: String
        name = "Kotlin"

        val age: Int = 21
        val height: Double = 1.70
        val weight: Float = 60.5f
        val long: Long = 1000_000_000_000_000
        val isProgrammer: Boolean = true
        val char: Char = 'A'

        println("Name: $name")
        println("Age: $age")
        println("Height: $height")
        println("Weight: $weight")
        println("Long: $long")
        println("Is programmer: $isProgrammer")
        println("Char: $char")
    }

    fun listOfCollection() {
        ListOfCollections().collectionList()
        ListOfCollections().collectionSet()
        ListOfCollections().collectionMap()
    }

    fun listOfConditionalFlow() {
        ListOfFlow().ifCondition()
        ListOfFlow().whenCondition()
    }

    fun listOfLoops() {
        ListOfLoops().forLoop()
        ListOfLoops().listLoop()
        ListOfLoops().whileLoop()
        ListOfLoops().doWhileLoop()
    }

    fun listOfFunction() {
        // Basic function
        ListOfFunctions().basic()

        // Function with return
        val hasReturn = ListOfFunctions().hasReturn()
        println(hasReturn)

        // Function with parameters
        ListOfFunctions().hasParameters("Kotlin")

        // Function with default parameters
        ListOfFunctions().hasDefaultParameter("Kotlin")
        ListOfFunctions().hasDefaultParameter("Kotlin", "Warning")

        // Function with multiple parameters
        ListOfFunctions().hasMultipleParameters("Kotlin", "Java", "Python")

        // Function with lambda
        ListOfFunctions().hasLambda("Kotlin") { name ->
            println("Hello, $name")
        }
    }
}