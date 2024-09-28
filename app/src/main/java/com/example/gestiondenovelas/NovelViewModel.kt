package com.example.gestiondenovelas

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData

class NovelViewModel(application: Application) : AndroidViewModel(application) {
    private val repository: NovelRepository = NovelRepository(application)
    private val allNovels: LiveData<List<Novel>> = repository.getAllNovels()

    fun getAllNovels(): LiveData<List<Novel>> = allNovels

    fun insert(novel: Novel) {
        repository.insert(novel)
    }

    fun delete(novel: Novel) {
        repository.delete(novel)
    }
}
