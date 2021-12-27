package com.example.roomapp.data

import androidx.lifecycle.LiveData

class StarRepositoryRepository(private val starRepositoryDao: StarRepositoryDao) {

    val readAllData: LiveData<List<StarRepository>> = starRepositoryDao.readAllData()

    suspend fun addRepository(starRepository: StarRepository){
        starRepositoryDao.addRepository(starRepository)
    }

}