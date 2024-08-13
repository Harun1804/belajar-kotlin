package org.example.Basic

class ListOfLoops {
    fun forLoop() {
        for (number in 1..<10) {
            println(number)
        }
    }

    fun listLoop() {
        val list = listOf("Kotlin", "Python", "JavaScript", "PHP", "TypeScript", "C#")
        for (language in list) {
            println("I Like Programming language: $language")
        }
    }

    fun whileLoop() {
        var number = 1
        while (number < 10) {
            println(number)
            number++
        }
    }

    fun doWhileLoop() {
        var number = 1
        do {
            println(number)
            number++
        } while (number < 10)
    }
}