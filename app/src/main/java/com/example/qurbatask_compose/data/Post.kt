package com.example.qurbatask_compose.data


data class Post(
    val id: Int,
    val postOwnerName: String,
    val postOwnerImageResourceId: Int,
    val postTime: String,
    val postText: String,
    val postImageResourceId: Int,
    val hasComments: Boolean,
    val comments: List<PostComment>?
)
