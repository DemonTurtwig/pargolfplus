package com.pgp.app.appcomponents.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface GolfHoleDao {
    @Insert
    fun insert(golfHole: GolfHole?)

    @Insert
    fun insertAll(golfHoles: List<GolfHole?>?)

    // Add other queries as needed
    @get:Query("SELECT * FROM golf_holes")
    val allGolfHolesLiveData: LiveData<List<GolfHole?>?>?

    @get:Query("SELECT courseId, holeNumber, par FROM golf_holes")
    val golfHoleInfo: LiveData<List<GolfHoleInfo?>?>?

    @Query("SELECT holeNumber, courseId, par, indexNumber FROM golf_holes WHERE courseId = :course")
    fun getGolfHoles2(course: String?): LiveData<List<GolfHoleInfo2?>?>?

    @Query("SELECT par FROM golf_holes WHERE courseId = :courseId")
    suspend fun getParValues(courseId: String): List<Int>?
}