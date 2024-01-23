package uk.co.zlurgg.noteapp.feature_notes.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import uk.co.zlurgg.noteapp.ui.theme.BabyBlue
import uk.co.zlurgg.noteapp.ui.theme.LightGreen
import uk.co.zlurgg.noteapp.ui.theme.RedOrange
import uk.co.zlurgg.noteapp.ui.theme.RedPink
import uk.co.zlurgg.noteapp.ui.theme.Violet

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {
    companion object {
        val noteColors = listOf(RedOrange, RedPink, BabyBlue, Violet, LightGreen)
    }
}

class InvalidNoteException(message: String): Exception(message)
