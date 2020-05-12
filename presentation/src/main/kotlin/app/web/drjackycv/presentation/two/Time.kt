package app.web.drjackycv.presentation.two

class Time {
    val date_iso8601: String = ""
    val unix: Long = getTime()

    private fun getTime(): Long = System.currentTimeMillis()

}