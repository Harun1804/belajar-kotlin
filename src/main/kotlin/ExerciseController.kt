package org.example

import org.example.Exercise.CollectionExercise
import org.example.Exercise.ConditionalFlowExercise

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
}