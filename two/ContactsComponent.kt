package app.web.drjackycv.presentation.two

/**
 * https://pl.kotl.in/5b2mdEfDz
 */

class ContactsComponent {
    val sortByLastUsed = object : Comparator<Contact> {
        override fun compare(c1: Contact, c2: Contact): Int = when {
            c1.last_used.unix > c2.last_used.unix -> 1
            c1.last_used.unix == c2.last_used.unix -> 0
            else -> -1
        }
    }
    var contacts: List<Contact> = listOf(
        Contact("1", "d1"),
        Contact("1", "d1"),
        Contact("2", "d2"),
        Contact("2", "d1"),
        Contact("1", "d2"),
        Contact("3", "d1"),
        Contact("3", "d2"),
        Contact("3", "d3"),
        Contact("4", "d4")
    )

    fun getRecentContacts(): List<Contact> {
        return contacts.distinctBy { it.data }.sortedWith(sortByLastUsed).take(3)
    }

}