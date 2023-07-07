package com.example.myfitrel.navigation

sealed class Routes(val route: String) {
    object Home : Routes("home")
    object Detail : Routes("detail")
}