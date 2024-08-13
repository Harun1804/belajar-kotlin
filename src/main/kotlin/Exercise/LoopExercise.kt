package org.example.Exercise

class LoopExercise {
    fun firstExercise() {
        var pizzaSlices = 0;

        while (pizzaSlices < 8) {
            println("There's only $pizzaSlices slice/s of pizza :(")
            pizzaSlices++
        }

        do {
            println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
            pizzaSlices++
        } while (pizzaSlices == 8)
    }

    fun secondExercise() {
        for (number in 1..100) {
            when {
                number % 15 == 0 -> println("fizzbuzz")
                number % 3 == 0 -> println("fizz")
                number % 5 == 0 -> println("buzz")
                else -> println(number)
            }
        }
    }

    fun thirdExercise() {
        val words = listOf("dinosaur", "limousine", "magazine", "language")
        for (word in words) {
            if (word.startsWith("l")) {
                println(word)
            }
        }
    }
}