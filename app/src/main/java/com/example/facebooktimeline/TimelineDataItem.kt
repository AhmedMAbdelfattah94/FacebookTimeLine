package com.example.facebooktimeline

data class TimelineDataItem(
    val author: String,
    val authorImage: Int?,
    val uploadDate: String,
    val postDescription: String,
    val postImage: Int?,
    val like: String,
    val comment: String,
    val share: String,
)


