package com.example.chicken.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.chicken.presentation.model.GameModel
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun GameScreen(model: GameModel = hiltViewModel(), onGameOver:() -> Unit) {
    Box (modifier = Modifier
        .fillMaxSize()
    ) {
        Button(onClick = { onGameOver() } ) {
            Text("GameOver")
        }
    }
}