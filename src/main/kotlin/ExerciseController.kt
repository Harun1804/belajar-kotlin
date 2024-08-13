package org.example

import org.example.Exercise.*

class ExerciseController {
    fun ofCollection() {
        CollectionExercise().ofList()
        CollectionExercise().ofSet()
        CollectionExercise().ofMap()
    }

    fun ofConditionalFlow() {
        ConditionalFlowExercise().suit()
        ConditionalFlowExercise().inputController()
    }

    fun ofLoop() {
        LoopExercise().firstExercise()
        LoopExercise().secondExercise()
        LoopExercise().thirdExercise()
    }

    fun ofFunction() {
        println(FunctionExcercise().circleArea(14))
        println(FunctionExcercise().singleExpresionCircleArea(27))
        println(FunctionExcercise().intervalInSeconds(seconds = 30, hours = 6, minutes = 30))
        FunctionExcercise().lambdaFirst()
        FunctionExcercise().repeatN(5) { println("Hello") }
    }

    fun ofClass() {
        val emp = Employee("mary", 20)
        println(emp)

        emp.salary += 20
        println(emp)

        val person = Person(
            Name("John", "Smith"),
            Address("123 Fake Street", City("Springfield", "US")),
            ownsAPet = false
        )

        println(person)

        val empGen = RandomEmployeeGenerator(10, 30)
        println(empGen.generateRandomEmployee())
        println(empGen.generateRandomEmployee())
        println(empGen.generateRandomEmployee())
        empGen.minSalary = 50
        empGen.maxSalary = 100
        println(empGen.generateRandomEmployee())

        // Null safety
        println((1..5).sumOf { id -> salaryById(id) })
    }

    fun employeeById(id: Int) = when(id) {
        1 -> Employee("Mary", 20)
        2 -> null
        3 -> Employee("John", 21)
        4 -> Employee("Ann", 23)
        else -> null
    }

    fun salaryById(id: Int) = employeeById(id)?.salary ?: 0
}