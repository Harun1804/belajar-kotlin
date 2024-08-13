package org.example

import org.example.Exercise.CollectionExercise
import org.example.Exercise.ConditionalFlowExercise
import org.example.Exercise.FunctionExcercise
import org.example.Exercise.LoopExercise

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
//        println(FunctionExcercise().circleArea(14))
//        println(FunctionExcercise().singleExpresionCircleArea(27))
//        println(FunctionExcercise().intervalInSeconds(seconds = 30, hours = 6, minutes = 30))
//        FunctionExcercise().lambdaFirst()
        FunctionExcercise().repeatN(5) { println("Hello") }
    }
}