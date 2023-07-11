package com.example.myfitrel.home.presentation.home

import android.widget.Space
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.myfitrel.home.presentation.home.composables.CardRoutine
import com.example.myfitrel.home.presentation.home.composables.CardRoutineWithDay
import com.example.myfitrel.navigation.Routes
import com.example.myfitrel.ui.theme.backgroundDetail
import com.example.myfitrel.ui.theme.textColor

@Composable
fun HomeScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundDetail)
            .padding(start = 24.dp)
    ) {
        Spacer(modifier = Modifier.height(64.dp))
        Text(
            text = "HELLO SARAH",
            fontSize = 32.sp,
            color = Color.White,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(6.dp))
        Text(
            text = "Good Morning.",
            fontSize = 15.sp,
            color = Color.White,
            fontWeight = FontWeight.Normal
        )
        Spacer(modifier = Modifier.height(32.dp))
        Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth()) {
            Text(
                text = "Today Workout Plan",
                fontSize = 17.sp,
                color = Color.White,
                fontWeight = FontWeight.SemiBold
            )

            Text(
                text = "Mon 26 Apr",
                fontSize = 13.sp,
                color = textColor,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(end = 32.dp)
            )
        }
        Spacer(modifier = Modifier.height(16.dp))
        CardRoutine(onCardClicked = { navController.navigate(Routes.Detail.createRoute(5)) })
        Spacer(modifier = Modifier.height(32.dp))
        Text(
            text = "Weekly Workout Plan",
            fontSize = 17.sp,
            color = Color.White,
            fontWeight = FontWeight.SemiBold
        )
        Spacer(modifier = Modifier.height(16.dp))
        LazyRow() {
            items(count = 5) {
                CardRoutineWithDay(onCardClicked = {
                    navController.navigate(
                        Routes.Detail.createRoute(
                            3
                        )
                    )
                })
            }

        }
        Spacer(modifier = Modifier.height(32.dp))
        Text(
            text = "Other Workouts",
            fontSize = 17.sp,
            color = Color.White,
            fontWeight = FontWeight.SemiBold
        )
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    //HomeScreen()
}