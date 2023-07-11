package com.example.myfitrel.home.presentation.detail

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.myfitrel.R
import com.example.myfitrel.home.domain.models.Routine
import com.example.myfitrel.home.presentation.detail.composables.ButtonCreateAccount
import com.example.myfitrel.home.presentation.detail.composables.ExerciseCard
import com.example.myfitrel.ui.theme.backgroundButton
import com.example.myfitrel.ui.theme.backgroundDetail
import com.example.myfitrel.ui.theme.textColor

@Composable
fun DetailScreen(navController: NavHostController, routineId:Int) {
    Box(
        Modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.detail_background),
            contentDescription = null,
            contentScale = ContentScale.FillWidth,
            modifier = Modifier
                .fillMaxWidth()
                .height(338.dp)
        )
        Box(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
                .height(556.dp)
                .background(
                    backgroundDetail,
                    shape = RoundedCornerShape(
                        topStart = 32.dp,
                        topEnd = 32.dp
                    )
                )
        ) {
            Column(
                Modifier
                    .fillMaxSize()
                    .padding(start = 24.dp)
            ) {
                Text(
                    modifier = Modifier.padding(top = 32.dp),
                    text = "Day 01 -Warm Up",
                    color = Color.White,
                    fontWeight = FontWeight.Medium,
                    fontSize = 20.sp
                )
                Text(
                    modifier = Modifier.padding(top = 8.dp),
                    text = "04 Workouts for Beginner",
                    color = textColor,
                    fontWeight = FontWeight.Normal,
                    fontSize = 13.sp
                )
                Spacer(modifier = Modifier.height(16.dp))
                Row(
                    Modifier
                        .width(200.dp)
                        .height(30.dp)
                ) {
                    Row(
                        Modifier
                            .fillMaxHeight()
                            .width(90.dp)
                            .background(
                                backgroundButton, shape = RoundedCornerShape(50.dp)
                            ), verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.ic_play),
                            contentDescription = null,
                            contentScale = ContentScale.Fit,
                            modifier = Modifier
                                .width(22.dp)
                                .height(22.dp)
                                .padding(start = 8.dp)
                        )
                        Text(
                            modifier = Modifier.padding(start = 4.dp),
                            text = "60 min",
                            color = Color.White,
                            fontWeight = FontWeight.Normal,
                            fontSize = 13.sp
                        )
                    }
                    Spacer(modifier = Modifier.width(16.dp))
                    Row(
                        Modifier
                            .fillMaxHeight()
                            .width(90.dp)
                            .background(
                                backgroundButton, shape = RoundedCornerShape(50.dp)
                            ), verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.ic_flame),
                            contentDescription = null,
                            contentScale = ContentScale.Fit,
                            modifier = Modifier
                                .width(22.dp)
                                .height(22.dp)
                                .padding(start = 8.dp)
                        )
                        Text(
                            modifier = Modifier.padding(start = 4.dp),
                            text = "350 Kcal",
                            color = Color.White,
                            fontWeight = FontWeight.Normal,
                            fontSize = 13.sp
                        )
                    }
                }
                Spacer(modifier = Modifier.height(24.dp))
                Text(
                    text = "Want your body to be healthy. Join our program with directions according to body’s goals. Increasing physical strength is the goal of strenght training. Maintain body fitness by doing physical exercise at least 2-3 times a week.",
                    Modifier.padding(end = 48.dp),
                    maxLines = 6,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color.White
                )
                Spacer(modifier = Modifier.height(24.dp))
                LazyColumn(
                    Modifier
                        .fillMaxWidth()
                        .padding(end = 24.dp)
                ) {
                    items(count = 7) {
                        ExerciseCard(
                            description = "esto es una prueba"
                        )
                        Spacer(Modifier.height(12.dp))
                    }
                }
            }
        }

    }
    ButtonCreateAccount()
}

@Preview
@Composable
fun DetailScreenPreview() {
    //DetailScreen()
}