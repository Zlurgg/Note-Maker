package uk.co.zlurgg.noteapp.feature_notes.presentation.notes

import uk.co.zlurgg.noteapp.feature_notes.domain.model.Note
import uk.co.zlurgg.noteapp.feature_notes.domain.util.NoteOrder
import uk.co.zlurgg.noteapp.feature_notes.domain.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
