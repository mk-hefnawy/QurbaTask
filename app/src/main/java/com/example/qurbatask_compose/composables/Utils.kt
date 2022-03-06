package com.example.qurbatask_compose

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.ExperimentalUnitApi
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.navigation.compose.rememberNavController
import com.example.qurbatask_compose.composables.BottomBar
import com.example.qurbatask_compose.composables.PostBody
import com.example.qurbatask_compose.composables.PostFooter
import com.example.qurbatask_compose.composables.PostHeader

@OptIn(ExperimentalUnitApi::class)
@Composable
fun RowScope.TopBarContent() {
    ConstraintLayout(modifier = Modifier.fillMaxWidth()) {
        val (title, icons) = createRefs()
        Text(
            text = "LOGO",
            fontSize = TextUnit(20f, TextUnitType.Sp),
            modifier = Modifier.constrainAs(title) {
                start.linkTo(parent.start)
                top.linkTo(parent.top)
                bottom.linkTo(parent.bottom)
                end.linkTo(icons.start)
            })

        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.constrainAs(icons) {

            }) {
            Icon(
                painter = painterResource(id = R.drawable.outline_search_black_24),
                contentDescription = "Search",
                modifier = Modifier.padding(start = 10.dp, end = 15.dp, top = 10.dp, bottom = 10.dp)
            )
            Icon(
                painter = painterResource(id = R.drawable.baseline_notifications_black_24),
                contentDescription = "Notification",
                modifier = Modifier.padding(start = 15.dp, end = 15.dp, top = 10.dp, bottom = 10.dp)
            )
            Icon(
                painter = painterResource(id = R.drawable.baseline_shopping_cart_black_24),
                contentDescription = "Cart",
                modifier = Modifier.padding(start = 15.dp, end = 10.dp, top = 10.dp, bottom = 10.dp)
            )
        }
    }
}


@Composable
fun RowScope.CircularImage(imageResourceId: Int) {
    Image(
        painter = painterResource(id = imageResourceId),
        contentDescription = "User Image",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .weight(1f)
            .padding(10.dp)
            .size(60.dp)
            .clip(CircleShape)
    )
}
