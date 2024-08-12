package org.example.Exercise

import kotlin.random.Random

class ConditionalFlowExercise {
    fun suit () {
        val firstResult = Random.nextInt(6)
        val secondResult = Random.nextInt(6)

        if (firstResult == secondResult) println("You win") else println("You lose. Result is $firstResult and $secondResult")
    }

    fun inputController () {
        val button = "A"
        val result = when (button) {
            "A" -> "Yes"
            "B" -> "No"
            "X" -> "Menu"
            "Y" -> "Nothing"
            else -> "There is no such button"
        }

        println(result)
    }
}