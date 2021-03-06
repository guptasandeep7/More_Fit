package com.example.morefit.model

data class Data(
    val category: String,
    val difficulty: String,
    val gender: String,
    val muscle: String,
    val text_tutorials: List<TextTutorial>,
    val title: String,
    val video_tutorials: List<String>
)