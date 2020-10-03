package com.example.dark_message.data;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.dark_message.model.Note;

@Database(entities = {Note.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    public abstract NoteDao noteDao();
}

