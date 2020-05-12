package app.web.drjackycv.presentation.two

fun main() {
    val result = ContactsComponent().getRecentContacts()

    for (i in result) {
        println(i.id + " " + i.data + " " + i.last_used.let { it.timestampToDate(it.unix) })
    }

}