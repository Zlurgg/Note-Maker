package uk.co.zlurgg.noteapp.di

import android.app.Application
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import uk.co.zlurgg.noteapp.feature_notes.data.data_source.NoteDatabase
import uk.co.zlurgg.noteapp.feature_notes.data.repository.NoteRepositoryImpl
import uk.co.zlurgg.noteapp.feature_notes.domain.repository.NoteRepository
import uk.co.zlurgg.noteapp.feature_notes.domain.use_case.AddNote
import uk.co.zlurgg.noteapp.feature_notes.domain.use_case.DeleteNote
import uk.co.zlurgg.noteapp.feature_notes.domain.use_case.GetNote
import uk.co.zlurgg.noteapp.feature_notes.domain.use_case.GetNotes
import uk.co.zlurgg.noteapp.feature_notes.domain.use_case.NoteUseCases
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun providesNotesDatabase(app: Application): NoteDatabase {
        return Room.databaseBuilder(
            app,
            NoteDatabase::class.java,
            NoteDatabase.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideNoteRepository(db: NoteDatabase): NoteRepository {
        return NoteRepositoryImpl(db.noteDao)
    }

    @Provides
    @Singleton
    fun provideNoteUseCases(repository: NoteRepository): NoteUseCases {
        return NoteUseCases(
            getNotes = GetNotes(repository),
            deleteNote = DeleteNote(repository),
            addNote = AddNote(repository),
            getNote = GetNote(repository)
        )
    }
}