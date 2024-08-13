package org.example

import org.example.Exercise.CollectionExercise
import org.example.Exercise.ConditionalFlowExercise
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
}