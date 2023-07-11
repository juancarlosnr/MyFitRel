package com.example.myfitrel.home.presentation.home.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myfitrel.R
import com.example.myfitrel.ui.theme.textColor

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CardRoutineWithDay(onCardClicked: (Int) -> Unit) {
    Card(modifier = Modifier
        .fillMaxWidth()
        .height(160.dp)
        .padding(end = 24.dp),
        shape = RoundedCornerShape(16.dp),
        onClick = {
            onCardClicked(0)
        }) {
        Box(modifier = Modifier.fillMaxSize()) {

            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.BottomStart) {
                Image(
                    painter = painterResource(id = R.drawable.ic_routine),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
                Column(
                    verticalArrangement = Arrangement.Bottom,
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier.padding(start = 16.dp)
                ) {
                    Text(
                        text = "Dia 01 - Warm Up",
                        color = Color.White,
                        fontSize = 17.sp,
                        fontWeight = FontWeight.SemiBold
                    )

                    Text(
                        text = "07:00 - 08:00 AM",
                        color = textColor,
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Normal,
                        modifier = Modifier.padding(bottom = 16.dp, top = 8.dp)
                    )
                }
            }
            Box(
                Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp, start = 8.dp),
                contentAlignment = Alignment.TopStart
            ) {
                ButtonDay()
            }

        }
    }
}

@Preview
@Composable
fun CardRoutineWithDayPreview() {
    CardRoutineWithDay({})
}