package uk.co.zlurgg.noteapp.feature_notes.domain.use_case

import uk.co.zlurgg.noteapp.feature_notes.domain.model.Note
import uk.co.zlurgg.noteapp.feature_notes.domain.repository.NoteRepository

class GetNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}