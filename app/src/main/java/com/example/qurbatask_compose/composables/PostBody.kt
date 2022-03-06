package com.example.qurbatask_compose.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun PostBody(postText: String, postImageResourceId: Int) {
    val modifier = Modifier.padding(
        start = 20.dp,
        end = 20.dp, top = 5.dp, bottom = 5.dp
    )
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        PostText(postText)
        PostImage(postImageResourceId)

        Spacer(
            modifier = Modifier
                .height(1.dp)
                .background(Color.LightGray)
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp)
        )


        PostReactions()
        Spacer(
            modifier = Modifier
                .height(1.dp)
                .background(Color.LightGray)
                .padding(start = 10.dp, end = 10.dp)
                .fillMaxWidth()
        )

    }
}
