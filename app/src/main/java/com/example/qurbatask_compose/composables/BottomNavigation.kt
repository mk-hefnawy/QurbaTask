package com.example.qurbatask_compose.composables

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import com.example.qurbatask_compose.R

sealed class BottomNavigationItem(val route: String, val title: String, val iconResourceId: Int){
    object Home : BottomNavigationItem("home", "Home", R.drawable.baseline_home_black_24)
    object Restaurants : BottomNavigationItem("restaurants", "Restaurants",
        R.drawable.baseline_restaurant_black_24
    )
    object Friends : BottomNavigationItem("friends", "Friends", R.drawable.baseline_people_black_24)
    object Posts : BottomNavigationItem("posts", "Your Posts", R.drawable.outline_article_black_24)
    object Me : BottomNavigationItem("me", "Me", R.drawable.baseline_person_black_24)
}

@Composable
fun RowScope.AddItemToBottomNavigation(
    screen: BottomNavigationItem,
    currentDestination: NavDestination?,
    navController: NavHostController,

    ) {
    currentDestination?.hierarchy?.any {
        it.route == screen.route
    }?.let {
        BottomNavigationItem(
            icon = {
                Icon(
                    painter = painterResource(id = screen.iconResourceId),
                    contentDescription = "Bottom Icon"
                )
            },

            selected = it, onClick = {
                navController.navigate(screen.route) {
                    popUpTo(navController.graph.findStartDestination().id)
                    // disables multiple instances of the same destination
                    // when clicked more than one time
                    launchSingleTop = true
                }

            }, alwaysShowLabel = false
        )
    }
}
