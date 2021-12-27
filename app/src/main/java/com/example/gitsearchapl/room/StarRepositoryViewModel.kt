package com.example.gitsearchapl.room

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class StarRepositoryViewModel(application: Application): AndroidViewModel(application) {

    val readAllData: LiveData<List<StarRepository>>
    private val repository: StarRepositoryRepository

    init {
        val userDao = StarRepositoryDatabase.getDatabase(application).userDao()
        repository = StarRepositoryRepository(userDao)
        readAllData = repository.readAllData
    }

    fun addRepository(starRepository: StarRepository){
        viewModelScope.launch(Dispatchers.IO) {
            repository.addRepository(starRepository)
        }
    }

}