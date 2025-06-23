package com.example.chicken.road.navigation

import androidx.navigation.NavController


object AppDestinations {
    const val HOME_ROUTE = "HOME_ROUTE"
    const val GAME_ROUTE = "GAME_ROUTE"
    const val GAME_OVER_ROUTE = "GAME_OVER_ROUTE"
}

interface FeatureNavigator {
    fun navigateToGame()
    fun navigateToGameOver()
    fun navigateToHome()
}

class FeatureNavigatorImpl (
    private val navController: NavController
) : FeatureNavigator {

    override fun navigateToGame() {
        navController.navigate(AppDestinations.GAME_ROUTE)
    }

    override fun navigateToGameOver() {
        navController.navigate(AppDestinations.GAME_OVER_ROUTE)
    }

    override fun navigateToHome() {
        navController.navigate(AppDestinations.HOME_ROUTE)
    }

}