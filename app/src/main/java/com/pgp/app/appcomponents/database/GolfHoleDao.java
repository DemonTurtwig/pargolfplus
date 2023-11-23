package com.pgp.app.appcomponents.database;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface GolfHoleDao {
    @Insert
    void insert(GolfHole golfHole);

    @Insert
    void insertAll(List<GolfHole> golfHoles);
    // Add other queries as needed
    @Query("SELECT * FROM golf_holes")
    LiveData<List<GolfHole>> getAllGolfHolesLiveData();
}
