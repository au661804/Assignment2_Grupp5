package backend

import android.graphics.Color
import android.util.Log
import com.example.assignment2_grupp5.R
import com.example.assignment2_grupp5.ui.theme.Purple200


enum class Persons {
    Pooh,
    Piglet,
    Rabbit,
    Tigger,
    Eeyore

}

data class Contacts(val name: String, val imageId: Int, val information: ContactInformation, val persons: Persons)
data class ContactItem(val name: String, val imageId: Int)
data class ContactInformation(val name: String, val age: Int, val favColor: String, val imageId: Int)
data class Color(val black: Int, val red: Int, val orange: Int)


class Repository {
    private val contacts = listOf(
        Contacts(
            "Pooh",R.drawable.contacts,
            ContactInformation("Pooh", 10, "Red" ,R.drawable.contacts),Persons.Pooh
        )
    )

    fun getContactList(): List<ContactItem> {
        Log.v(this::class.simpleName, "Get ContactList")
        return contacts.map { ContactItem(it.name, it.imageId) }
    }

    fun getContact(name: String?): Contacts? {
        Log.v(this::class.simpleName, "Get Contact $name")
        return contacts.find { it.name == name }
    }
}