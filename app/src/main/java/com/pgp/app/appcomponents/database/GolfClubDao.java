package com.pgp.app.appcomponents.database;
import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface GolfClubDao {
        @Insert
        void insert(GolfClub golfClub);
    @Insert
    void insertAll(List<GolfClub> golfClubs);

    @Query("SELECT * FROM golf_clubs")
    LiveData<List<GolfClub>> getAllGolfClubsLiveData();


}


