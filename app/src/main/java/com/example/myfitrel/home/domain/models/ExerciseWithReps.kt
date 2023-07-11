package com.example.myfitrel.home.domain.models

data class ExerciseWithReps(
    val id:Int,
    val Exercise:Exercise,
    val time:Int,
    val reps:Int,
    val series:Int
)
