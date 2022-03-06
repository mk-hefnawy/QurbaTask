package com.example.qurbatask_compose.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.ExperimentalUnitApi
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import com.example.qurbatask_compose.data.Post


@Composable
fun HomeScreen(posts: List<Post>) {

    LazyColumn() {
        item { SearchContainer() }
        items(posts) { post ->
            PostItem(
                postOwnerName = post.postOwnerName,
                postOwnerImageResourceId = post.postOwnerImageResourceId,
                postTime = post.postTime,
                postText = post.postText,
                postImageResourceId = post.postImageResourceId,
                hasComments = post.hasComments,
                comments = post.comments
            )
        }
    }

}

@OptIn(ExperimentalUnitApi::class)
@Composable
fun SettingsScreen() {
    Box(
        modifier = Modifier
            .background(color = Color.Magenta)
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
            Text(text = "Settings", fontSize = TextUnit(25f, TextUnitType.Sp))
    }
}

@OptIn(ExperimentalUnitApi::class)
@Composable
fun FriendsScreen() {
    Box(
        modifier = Modifier
            .background(color = Color.Red)
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Friends", fontSize = TextUnit(25f, TextUnitType.Sp))
    }
}

@OptIn(ExperimentalUnitApi::class)
@Composable
fun MeScreen() {
    Box(
        modifier = Modifier
            .background(color = Color.Blue)
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Me", fontSize = TextUnit(25f, TextUnitType.Sp))
    }
}


@OptIn(ExperimentalUnitApi::class)
@Composable
fun PostsScreen() {
    Box(
        modifier = Modifier
            .background(color = Color.Green)
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Posts", fontSize = TextUnit(25f, TextUnitType.Sp))
    }
}

@OptIn(ExperimentalUnitApi::class)
@Composable
fun RestaurantsScreen() {
    Box(
        modifier = Modifier
            .background(color = Color.Yellow)
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Restaurants", fontSize = TextUnit(25f, TextUnitType.Sp))
    }
}

@Composable
@Preview
fun ScreensPreview(){
    SettingsScreen()
}