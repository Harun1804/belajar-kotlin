package org.example.Exercise

import kotlin.math.PI

class FunctionExcercise {
    fun circleArea(radius: Int): Double {
        return PI * radius * radius
    }

    fun singleExpresionCircleArea(radius: Int) = PI * radius * radius

    fun intervalInSeconds(hours: Int = 0, minutes: Int = 0, seconds: Int = 0) =
        ((hours * 60) + minutes) * 60 + seconds

    fun lambdaFirst() {
        val actions = listOf("title", "year", "author")
        val prefix = "https://example.com/book-info"
        val id = 5
        val urls = actions.map { action -> "$prefix/$id/$action" }
     println(urls)
    }

    fun repeatN(n: Int, action: () -> Unit) {
        for (i in 1.. n) {
            action()
        }
    }
}