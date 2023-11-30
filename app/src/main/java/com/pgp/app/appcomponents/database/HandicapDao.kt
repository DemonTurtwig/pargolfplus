package com.pgp.app.appcomponents.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface HandicapDao {
    @Insert
    fun insert(handicap: Handicap?) // Add other queries as needed
    @Query("SELECT * FROM Handicap")
    fun getAll(): List<Handicap>
}