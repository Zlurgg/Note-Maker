package uk.co.zlurgg.noteapp.feature_notes.domain.repository

import kotlinx.coroutines.flow.Flow
import uk.co.zlurgg.noteapp.feature_notes.domain.model.Note

interface NoteRepository {

    fun getNotes(): Flow<List<Note>>

    suspend fun getNoteById(id: Int): Note?

    suspend fun insertNote(note: Note)

    suspend fun deleteNote(note: Note)
}