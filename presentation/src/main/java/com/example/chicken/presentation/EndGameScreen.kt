package com.example.chicken.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun EndGameScreen(onClick: () -> Unit) {
    Box() {
        Button(onClick = { onClick() }) {
            Text("EndGame")
        }
    }
}