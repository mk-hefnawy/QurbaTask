package com.example.qurbatask_compose.composables

import android.util.Log.d
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.ExperimentalUnitApi
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout


@Composable
fun PostReactions() {
    ConstraintLayout(
        modifier = Modifier.fillMaxWidth()
    ) {
        val (likes, comments, shares) = createRefs()
        Box(modifier = Modifier.constrainAs(likes) {
            start.linkTo(parent.start)
            //end.linkTo(comments.start)
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom)
        }) {
            Reaction("32K", com.example.qurbatask_compose.R.drawable.outline_thumb_up_black_24)
        }


        Box(modifier = Modifier.constrainAs(comments) {
            start.linkTo(likes.end)
            end.linkTo(shares.start)
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom)
        }) {
            Reaction("508", com.example.qurbatask_compose.R.drawable.baseline_textsms_black_24)
        }

        Box(modifier = Modifier.constrainAs(shares) {
            //start.linkTo(comments.end)
            end.linkTo(parent.end)
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom)
        }) {
            Reaction("13.4K", com.example.qurbatask_compose.R.drawable.baseline_reply_black_24)
        }

    }
}

@OptIn(ExperimentalUnitApi::class)
@Composable
fun Reaction(
    noOfReactions: String,
    reactionImageResourceId: Int
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier.padding(10.dp)
    ) {
        Text(
            text = noOfReactions,
            fontSize = TextUnit(20f, TextUnitType.Sp)
        )

        Spacer(modifier = Modifier.width(5.dp))
        Icon(
            painter = painterResource(id = reactionImageResourceId),
            contentDescription = "Reaction",
            modifier = Modifier
                .width(25.dp)
                .height(25.dp)
        )
    }
}
