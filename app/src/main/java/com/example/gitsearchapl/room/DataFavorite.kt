package com.example.gitsearchapl.room

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class DataFavorite (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val html_url: String,
    val name: String,
    val descriptor: String,
    val language: String,
    val favorites: Int
        )