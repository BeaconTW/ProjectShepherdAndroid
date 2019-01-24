package com.shepherd.firestire.models

import java.sql.Timestamp

data class Event(val author: String?,
                 val title: String?,
                 val description: String?,
                 val start: Timestamp?,
                 val end: Timestamp?,
                 val organizer: String?,
                 val location: String?)