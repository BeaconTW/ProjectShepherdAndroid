package com.shepherd.firestore.models

import java.sql.Timestamp

data class Event(val author: String?,
                 val title: String?,
                 val description: String?,
                 val start: Timestamp?,
                 val end: Timestamp?,
                 val organizer: String?,
                 val location: String?)