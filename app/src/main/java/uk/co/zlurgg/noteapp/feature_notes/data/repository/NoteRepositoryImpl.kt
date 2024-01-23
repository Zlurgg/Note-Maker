package uk.co.zlurgg.noteapp.feature_notes.data.repository

import kotlinx.coroutines.flow.Flow
import uk.co.zlurgg.noteapp.feature_notes.data.data_source.NoteDao
import uk.co.zlurgg.noteapp.feature_notes.domain.model.Note
import uk.co.zlurgg.noteapp.feature_notes.domain.repository.NoteRepository

class NoteRepositoryImpl(
    private val dao: NoteDao
): NoteRepository {
    override fun getNotes(): Flow<List<Note>> {
        return dao.getNotes()
    }

    override suspend fun getNoteById(id: Int): Note? {
        return dao.getNoteById(id)
    }

    override suspend fun insertNote(note: Note) {
        return dao.insertNote(note)
    }

    override suspend fun deleteNote(note: Note) {
        return dao.deleteNote(note)
    }
}