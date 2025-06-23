package com.example.chicken.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.Image
import androidx.compose.material3.Button

@Composable
fun HomeScreen(

) {
    Box(modifier = Modifier
        .fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.main), // Замени на свой ресурс
            contentDescription = null, // Описание не нужно для фонового изображения
            modifier = Modifier.fillMaxSize(), // Изображение тоже на весь Box
            contentScale = ContentScale.Crop // Масштабируем так, чтобы заполнить весь Box, обрезая лишнее
        )

        // 2. Содержимое поверх фонового изображения (например, другие компоненты)
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Button(
                onClick = {}
            ) {

            }
            Button(
                onClick = {}
            ) {

            }
            Button(
                onClick = {}
            ) {

            }
        }
    }
}