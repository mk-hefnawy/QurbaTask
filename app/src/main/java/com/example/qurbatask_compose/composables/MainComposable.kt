package com.example.qurbatask_compose.composables

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.qurbatask_compose.BottomNavGraph
import com.example.qurbatask_compose.data.Post
import com.example.qurbatask_compose.data.PostComment


@Composable
fun MainScreen(posts: List<Post>) {
    val navController = rememberNavController()
    Scaffold(bottomBar = { BottomBar(navController = navController) }) {
        Box(modifier = Modifier.padding(it)){
            BottomNavGraph(posts = posts, navController = navController)
        }

    }
}

@Composable
fun PostItem(
    postOwnerName: String,
    postOwnerImageResourceId: Int,
    postTime: String,
    postText: String,
    postImageResourceId: Int,
    hasComments: Boolean,
    comments: List<PostComment>?
) {

    PostHeader(postOwnerImageResourceId, postOwnerName, postTime)
    PostBody(postText, postImageResourceId)
    PostFooter(hasComments, comments)

}
