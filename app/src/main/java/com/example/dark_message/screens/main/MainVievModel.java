package com.example.dark_message.screens.main;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.dark_message.App;
import com.example.dark_message.model.Note;

import java.util.List;

public class MainVievModel extends ViewModel {
    private LiveData<List<Note>> noteLiveData = App.getInstance().getNoteDao().getAllLiveData();

    public LiveData<List<Note>> getNoteLiveData(){
        return noteLiveData;
    }
}
