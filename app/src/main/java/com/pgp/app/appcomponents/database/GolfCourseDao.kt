package com.pgp.app.appcomponents.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface GolfCourseDao {
    @Insert
    fun insert(golfCourse: GolfCourse)

    @Insert
    fun insertAll(golfCourse: List<GolfCourse>)

    // Add other queries as needed
    @get:Query("SELECT * FROM golf_course")
    val allGolfCoursesLiveData: LiveData<List<GolfCourse>>

    @Query("SELECT * FROM golf_course WHERE clubId = :clubId")
    fun getGolfCoursesByClubId(clubId: Long): LiveData<List<GolfCourse>>

    @Query("SELECT courseId FROM golf_course WHERE courseName = :courseName LIMIT 1")
    fun getCourseIdByName(courseName: String): Long?

    @Query("SELECT redCr as crValue, redSr as srValue FROM golf_course WHERE courseName = :courseName LIMIT 1")
    suspend fun getRedRatings(courseName: String): Rating?

    @Query("SELECT blueCr as crValue, blueSr as srValue FROM golf_course WHERE courseName = :courseName LIMIT 1")
    suspend fun getBlueRatings(courseName: String): Rating?

    @Query("SELECT whiteCr as crValue, whiteSr as srValue FROM golf_course WHERE courseName = :courseName LIMIT 1")
    suspend fun getWhiteRatings(courseName: String): Rating?
}