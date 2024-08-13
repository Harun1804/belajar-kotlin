package org.example.Exercise

import kotlin.random.Random

class RandomEmployeeGenerator(var minSalary: Int = 0, var maxSalary: Int = 1000) {
    val names = listOf("John", "Mary", "Ann", "Paul", "Jack", "Elizabeth")

    fun generateRandomEmployee(): Employee {
        return Employee(names.random(),
            Random.nextInt(from = minSalary, until = maxSalary))
    }
}