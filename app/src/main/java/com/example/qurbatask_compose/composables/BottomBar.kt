package com.example.qurbatask_compose.composables

import androidx.compose.material.BottomNavigation
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.qurbatask_compose.R


@Composable
fun BottomBar(navController: NavHostController) {
    val screens = listOf(
        BottomNavigationItem.Home,
        BottomNavigationItem.Restaurants,
        BottomNavigationItem.Posts,
        BottomNavigationItem.Friends,
        BottomNavigationItem.Me
    )

    // will observe the back stack for screens
    val backStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = backStackEntry?.destination

    BottomNavigation(
        backgroundColor = Color.White,
        contentColor = colorResource(id = R.color.purple)
    ) {
        screens.forEach { screen ->
            AddItemToBottomNavigation(
                screen = screen,
                currentDestination = currentDestination,
                navController = navController
            )
        }
    }
}
