package com.example.crudroom.room

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface NoteDao {
    @Insert
    suspend fun addNote(note: Note)

    @Update
    suspend fun updateNote(note: Note)

    @Delete
    suspend fun deleteNote(note: Note)

    @Query("SELECT * FROM note")
    suspend fun getNote(): List<Note>

    @Query("SELECT * FROM note WHERE id=:note_id")
    suspend fun getNote(note_id: Int): List<Note>




}