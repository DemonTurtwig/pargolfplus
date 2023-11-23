package com.pgp.app.appcomponents.database;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.pgp.app.appcomponents.utility.AppPreferencesHelper;

import java.util.List;

@Dao
public interface GolfCourseDao {
    @Insert
    void insert(GolfCourse golfCourse);
    @Insert
    void insertAll(List<GolfCourse> golfCourse);
    // Add other queries as needed
    @Query("SELECT * FROM golf_course")
    LiveData<List<GolfCourse>> getAllGolfCoursesLiveData();

}
