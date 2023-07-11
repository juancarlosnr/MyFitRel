package com.example.myfitrel.home.domain.models

data class Routine(
    val id:Int,
    val exercisesWithReps: List<ExerciseWithReps>,
    val intensity:String,
    val time:String,
    val calories:String
)