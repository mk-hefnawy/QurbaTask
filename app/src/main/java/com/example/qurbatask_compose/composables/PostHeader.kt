package com.example.qurbatask_compose.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.ExperimentalUnitApi
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import com.example.qurbatask_compose.CircularImage



@Composable
fun PostHeader(imageResourceId: Int, postOwner: String, postTime: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .padding(start = 10.dp, end = 10.dp, top = 5.dp, bottom = 5.dp)
            .wrapContentSize()
    ) {
        CircularImage(imageResourceId)
        PostTitle(
            postOwner = postOwner,
            postTime = postTime
        )
    }
}

@OptIn(ExperimentalUnitApi::class)
@Composable
fun RowScope.PostTitle(postOwner: String, postTime: String) {
    Column(modifier = Modifier.weight(4f)) {
        Text(
            text = postOwner,
            fontSize = TextUnit(15f, TextUnitType.Sp),
            fontWeight = FontWeight.Bold
        )

        Text(text = postTime, color = Color.Gray)
    }
}



@Composable
fun PostText(postText: String) {
    Text(
        text = postText,
        color = Color.Gray,
        fontWeight = FontWeight.Bold
    )
}

@Composable
fun PostImage(postImageResourceId: Int) {
    Image(
        painter = painterResource(id = postImageResourceId),
        contentDescription = "Post Image",
        modifier = Modifier
            .height(200.dp)
            .fillMaxWidth(),
        contentScale = ContentScale.Crop,
        alignment = Alignment.Center
    )
}
