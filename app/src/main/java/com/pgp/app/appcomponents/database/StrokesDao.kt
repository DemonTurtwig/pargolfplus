package com.pgp.app.appcomponents.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update

@Dao
interface StrokesDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveStrokes(holeStrokes: HoleStrokes)

    @Query("SELECT * FROM hole_strokes WHERE savedHole = :hole")
    suspend fun getStrokes(hole: String): List<HoleStrokes>

    @Query("DELETE FROM hole_strokes")
    suspend fun deleteAllStrokes()

    @Update
    suspend fun updateStrokes(strokes: HoleStrokes)
}