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
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.ripple
import androidx.compose.runtime.remember
import androidx.compose.ui.BiasAlignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen(
    onPlayClick:()-> Unit
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
        Box(
            modifier = Modifier
            .fillMaxSize(),
            contentAlignment = BiasAlignment(0f, 0.227f)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
            ) {
                BottomShadowButton("Play") { onPlayClick() }
                BottomShadowButton("Rules") { }
                BottomShadowButton("Facts") { }
            }
        }
    }
}

@Composable
fun BottomShadowButton(text: String, onClick: () -> Unit) {
    val interactionSource = remember { MutableInteractionSource() }
    val shape = RoundedCornerShape(33.dp)
    val borderColor = Color(0xFFD17B86)
    val mainButtonColor = Color(0xFFF56F6E)
    val borderThickness = 2.dp
    Spacer(modifier = Modifier.height(8.dp))
    Box(
        modifier = Modifier
            .fillMaxWidth(0.5f)
            .height(67.dp)
            .background(
                color = borderColor, // Цвет ободка
                shape = shape
            ).shadow(
                elevation = 4.dp,
                shape = shape,
                clip = false,
                ambientColor = Color.Transparent,
                spotColor = Color.Black,
            )
            .clip(shape) // Обрезаем внешний фон
            .clickable(
                interactionSource = interactionSource,
                indication = ripple(bounded = true),
                onClick = onClick
            )
            // Внутренний Box для основной части кнопки
            .padding(borderThickness)
            .background(
                color = mainButtonColor,
                shape = shape
            ),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text,
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = 26.sp,
        )
    }
    Spacer(modifier = Modifier.height(8.dp))
}