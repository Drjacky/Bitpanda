package app.web.drjackycv.presentation.two

import java.util.*

fun Time.timestampToDate(timestamp: Long): Date =
    java.util.Date(timestamp * 1000)