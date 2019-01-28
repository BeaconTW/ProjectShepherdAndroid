package com.shepherd.checkin.model

import com.google.firebase.Timestamp

data class EventViewModel(
    val title: String = "untitled",
    val description: String = "",
    val location: String="",
    val author: String = "",
    val start: Timestamp? = null,
    val end: Timestamp? = null,
    val organizer: String = ""
)