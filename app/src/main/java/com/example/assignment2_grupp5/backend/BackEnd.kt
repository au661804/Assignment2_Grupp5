package backend

import android.graphics.Color
import android.media.Image
import android.util.Log
import androidx.compose.ui.graphics.painter.Painter
import com.example.assignment2_grupp5.R
import com.example.assignment2_grupp5.ui.theme.Purple200
import java.util.Date


enum class Bar {
    SidsteFredagsBar,
    KapsejladsFredagsbar

}

data class Begivenheder(val name: String, val date: Int, val imageId: Int, val information: String, var lokation: String,val bar: Bar)
data class BegivenhedItem(val name: String, val imageId: Int)
data class Color(val black: Int, val red: Int, val orange: Int)


class Repository {
    private val begivenheder = listOf(
        Begivenheder(
            "Pooh",23,R.drawable.tdf_orig,
            "Året sidste bar!","Katrines Kælder",Bar.SidsteFredagsBar
        )
    )

    fun getBegivenhederList(): List<BegivenhedItem> {
        Log.v(this::class.simpleName, "Get ContactList")
        return begivenheder.map { BegivenhedItem(it.name, it.imageId) }
    }

    fun getContact(name: String?): Begivenheder? {
        Log.v(this::class.simpleName, "Get Contact $name")
        return begivenheder.find { it.name == name }
    }
}