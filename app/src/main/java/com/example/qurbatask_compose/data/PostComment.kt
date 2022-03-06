package com.example.qurbatask_compose.data

data class PostComment(
    val commentOwnerImageResourceId: Int,
    val commentOwnerName: String,
    val commentBody: String,
    val commentTime: String
)