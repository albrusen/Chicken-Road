package com.example.chicken.road.navigation

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.chicken.presentation.EndGameScreen
import com.example.chicken.presentation.GameScreen
import com.example.chicken.presentation.HomeScreen


@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
) {
    val mapFeatureNavigator = remember(navController) {
        FeatureNavigatorImpl(navController)
    }

    NavHost(
        navController = navController,
        startDestination = AppDestinations.HOME_ROUTE,
        modifier = modifier
    ) {
        composable(route = AppDestinations.HOME_ROUTE) {
            Log.d("AppNavHost", "AppNavHost: HOME_ROUTE")
            HomeScreen(onPlayClick = { mapFeatureNavigator.navigateToGame() } )
        }
        composable(route = AppDestinations.GAME_ROUTE) {
            Log.d("AppNavHost", "AppNavHost: GAME_ROUTE")
            GameScreen(onGameOver = { mapFeatureNavigator.navigateToGameOver() } )
        }
        composable(route = AppDestinations.GAME_OVER_ROUTE) {
            Log.d("AppNavHost", "AppNavHost: GAME_OVER_ROUTE")
            EndGameScreen(onClick = { mapFeatureNavigator.navigateToHome() })
        }
    }

}