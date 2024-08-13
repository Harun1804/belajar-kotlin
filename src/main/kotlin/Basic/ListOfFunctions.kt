package org.example.Basic

class ListOfFunctions {
    fun basic() {
        println("Basic")
    }

    fun hasReturn(): String {
        return "Has return"
    }

    fun hasParameters(name: String) {
        println("Hello, $name")
    }

    fun hasDefaultParameter(name: String, prefix: String = "Info") {
        println("[$prefix] Hello, $name")
    }

    fun hasMultipleParameters(vararg names: String) {
        for (name in names) {
            println("Hello, $name")
        }
    }

    fun hasLambda(name: String, action: (String) -> Unit) {
        action(name)
    }
}