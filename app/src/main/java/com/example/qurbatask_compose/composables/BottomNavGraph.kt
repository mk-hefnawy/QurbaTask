package com.example.qurbatask_compose

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.qurbatask_compose.composables.*
import com.example.qurbatask_compose.data.Post

@Composable
fun BottomNavGraph(posts: List<Post>, navController: NavHostController) {
    NavHost(navController = navController, startDestination = BottomNavigationItem.Home.route) {
        composable(route = BottomNavigationItem.Home.route) {
            HomeScreen(posts = posts)
        }

        composable(route = BottomNavigationItem.Restaurants.route) {
            RestaurantsScreen()
        }
        composable(route = BottomNavigationItem.Posts.route) {
            PostsScreen()
        }
        composable (route = BottomNavigationItem.Friends.route){
            FriendsScreen()
        }

        composable (route = BottomNavigationItem.Me.route){
            MeScreen()
        }
    }
}