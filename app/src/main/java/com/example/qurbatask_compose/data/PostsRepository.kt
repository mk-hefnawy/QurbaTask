package com.example.qurbatask_compose.data

import com.example.qurbatask_compose.R

class PostsRepository {

    fun getPosts(): List<Post> {
        return listOf(
            Post(
                1,
                "Mohamed Khaled",
                R.drawable.person,
                "3 days ago",
                "Here is my lunch!",
                R.drawable.food1,
                true,
                listOf(
                    PostComment(R.drawable.bill, "Salah Ahmed", "Perfect", "Just Now")
                )
            ),
            Post(
                1,
                "Ahmed Sayed",
                R.drawable.bill,
                "3 days ago",
                "Here is my lunch!",
                R.drawable.food1,
                true,
                listOf(
                    PostComment(R.drawable.bill, "Salah Ahmed", "I wish I were with you :D", "7m")
                )
            ),
            Post(
                3,
                "Saher Hamed",
                R.drawable.person2,
                "3 days ago",
                "Here is my lunch!",
                R.drawable.food,
                true,
                listOf(
                    PostComment(R.drawable.bill, "Salah Ahmed", "Amazing", "1h")
                )
            ),
            Post(
                4,
                "Ali Kamal",
                R.drawable.person,
                "12 hours ago",
                "I have cooked my food by myself :)",
                R.drawable.food1,
                true,
                listOf(
                    PostComment(R.drawable.bill, "Wael Saad", "Nice!","3h"),
                    PostComment(R.drawable.person, "Hesham Farid", "Well Done","5m")
                )
            )
        )
    }
}