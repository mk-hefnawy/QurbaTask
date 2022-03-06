package com.example.qurbatask_compose.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.ExperimentalUnitApi
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import com.example.qurbatask_compose.CircularImage
import com.example.qurbatask_compose.data.PostComment
import com.example.qurbatask_compose.R


@OptIn(ExperimentalUnitApi::class)
@Composable
fun Comment(
    imageResourceId: Int,
    commentOwner: String,
    commentText: String,
    commentTime: String
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(start = 10.dp, end = 10.dp, top = 5.dp, bottom = 5.dp)
    ) {
        CircularImage(imageResourceId)
        Column(modifier = Modifier.weight(4f)) {
            Card(shape = RoundedCornerShape(30)) {
                Column(modifier = Modifier.background(colorResource(R.color.very_light_grey))) {
                    Text(
                        text = commentOwner,
                        fontSize = TextUnit(12f, TextUnitType.Sp),
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(
                            start = 10.dp,
                            end = 15.dp,
                            top = 5.dp,
                            bottom = 2.dp
                        )
                    )
                    Text(
                        text = commentText,
                        color = Color.Gray,
                        modifier = Modifier.padding(
                            start = 10.dp,
                            end = 15.dp,
                            top = 2.dp,
                            bottom = 5.dp
                        )
                    )
                }

            }

            Row(
                horizontalArrangement = Arrangement.SpaceAround, modifier = Modifier
                    .padding(end = 10.dp, bottom = 10.dp)
            ) {
                val greyColor = Color.Gray
                Text(
                    text = commentTime,
                    color = greyColor,
                    modifier = Modifier.padding(start = 2.dp, end = 7.dp)
                )
                Text(
                    text = "Like",
                    color = greyColor,
                    modifier = Modifier.padding(start = 7.dp, end = 7.dp)
                )
                Text(
                    text = "Reply",
                    color = greyColor,
                    modifier = Modifier.padding(start = 7.dp, end = 7.dp)
                )
            }

        }
    }
}

@Composable
fun PostFooter(hasComments: Boolean, comments: List<PostComment>?) {
    if (hasComments) {
        Column(modifier = Modifier.fillMaxSize()) {
            comments!!.forEach { comment ->
                Comment(
                    comment.commentOwnerImageResourceId,
                    commentOwner = comment.commentOwnerName,
                    commentText = comment.commentBody,
                    commentTime = comment.commentTime
                )
                Spacer(
                    modifier = Modifier
                        .height(1.dp)
                        .fillMaxWidth()
                        .background(Color.LightGray)
                )
            }
        }

    }

}
