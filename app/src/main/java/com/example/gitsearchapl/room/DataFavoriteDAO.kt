package com.example.gitsearchapl.room

import androidx.room.*

@Dao
interface DataFavoriteDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertGitHubData(githubdata: DataFavorite)

    @Update
    fun updateGitHubData(githubdata: DataFavorite)

    @Delete
    fun deleteGitHubData(githubdata: DataFavorite)

}