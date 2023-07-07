package com.example.myfitrel.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myfitrel.home.presentation.detail.DetailScreen
import com.example.myfitrel.home.presentation.home.HomeScreen

@Composable
fun NavigationHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
) {
    NavHost(
        navController = navController,
        startDestination = Routes.Detail.route,
        modifier = modifier
    ) {
        composable(Routes.Home.route) {
            HomeScreen()
        }
        composable(Routes.Detail.route) {
            DetailScreen()
        }
    }
}