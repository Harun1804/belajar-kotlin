package org.example.Basic

class ListOfFlow {
    fun ifCondition() {
        var d: Int
        val check = true

        if (check) {
            d = 10
        } else {
            d = 20
        }

        println(d)

        // Ternary
        if (check) d = 10 else d = 20
        println(d)
    }

    fun whenCondition() {
        val greeting = "hello"

        when(greeting) {
            "hello" -> println("Hi")
            "goodbye" -> println("Bye")
            else -> println("What?")
        }

        val lightTrafficState = "red"
        val result = when(lightTrafficState) {
            "red" -> "Stop"
            "yellow" -> "Slow down"
            "green" -> "Go"
            else -> "What?"
        }

        println(result)

        val trafficLightState = "Green" // This can be "Green", "Yellow", or "Red"

        val trafficAction = when {
            trafficLightState == "Green" -> "Go"
            trafficLightState == "Yellow" -> "Slow down"
            trafficLightState == "Red" -> "Stop"
            else -> "Malfunction"
        }

        println(trafficAction)
    }
}