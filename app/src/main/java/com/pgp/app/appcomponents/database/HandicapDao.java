package com.pgp.app.appcomponents.database;

import androidx.room.Dao;
import androidx.room.Insert;

@Dao
public interface HandicapDao {
    @Insert
    void insert(Handicap handicap);

    // Add other queries as needed
}