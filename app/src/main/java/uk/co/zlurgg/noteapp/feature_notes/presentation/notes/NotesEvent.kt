package uk.co.zlurgg.noteapp.feature_notes.presentation.notes

import uk.co.zlurgg.noteapp.feature_notes.domain.model.Note
import uk.co.zlurgg.noteapp.feature_notes.domain.util.NoteOrder

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder): NotesEvent()
    data class DeleteNote(val note: Note): NotesEvent()
    data object RestoreNote: NotesEvent()
    data object ToggleOrderSection: NotesEvent()
}
