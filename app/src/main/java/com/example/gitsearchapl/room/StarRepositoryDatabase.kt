package com.example.gitsearchapl.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [StarRepository::class], version = 1, exportSchema = false)
abstract class StarRepositoryDatabase : RoomDatabase() {

    abstract fun userDao(): StarRepositoryDao

    companion object {
        @Volatile
        private var INSTANCE: StarRepositoryDatabase? = null

        fun getDatabase(context: Context): StarRepositoryDatabase{
            val tempInstance = INSTANCE
            if(tempInstance != null){
                return tempInstance
            }
            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    StarRepositoryDatabase::class.java,
                    "starRepository_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }

}