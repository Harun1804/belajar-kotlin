package org.example.Exercise

class CollectionExercise {
    fun ofList() {
        // You have a list of “green” numbers and a list of “red” numbers. Complete the code to print how many numbers there are in total.
        val greenNumbers = listOf(1, 4, 23)
        val redNumbers = listOf(17, 2)

        val totalNumbers = greenNumbers.count() + redNumbers.count()
        println("Total numbers: $totalNumbers")
    }

    fun ofSet() {
        // You have a set of protocols supported by your server. A user requests to use a particular protocol. Complete the program to check whether the requested protocol is supported or not (isSupported must be a Boolean value).
        val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
        val requested = "smtp"
        val isSupported = SUPPORTED.contains(requested.uppercase()) // Write your code here
        println("Support for $requested: $isSupported")
    }

    fun ofMap() {
        val number2word = mapOf(1 to "one", 2 to "two", 3 to "three") // Write your code here
        val n = 2
        println("$n is spelt as '${number2word[n]}'")
    }
}