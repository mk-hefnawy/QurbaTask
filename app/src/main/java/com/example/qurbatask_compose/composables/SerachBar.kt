package com.example.qurbatask_compose.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.R
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import com.example.qurbatask_compose.CircularImage


@Composable
fun SearchContainer() {
    Row(
        verticalAlignment = Alignment.CenterVertically, modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
    ) {
        CircularImage(imageResourceId = com.example.qurbatask_compose.R.drawable.person)
        ShareExperienceTextField()
    }

}

@Composable
fun RowScope.ShareExperienceTextField() {
    var text by remember { mutableStateOf(TextFieldValue()) }
    Box(
        modifier = Modifier
            .padding(10.dp)
            .weight(4f)
    ) {
        Card(shape = RoundedCornerShape(50)) {
            BasicTextField(
                value = text,
                onValueChange = { textFieldValue -> text = textFieldValue },
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White)
                    .padding(15.dp),
                decorationBox = { innerTextField ->
                    Box {
                        if (text.text.isEmpty()) {
                            Text(text = "Share your food preferences", color = Color.Gray)
                        }
                        innerTextField()
                    }
                }
            )
        }
    }
}
