package com.pgp.app.appcomponents.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface GolfClubDao {
    @Insert
    fun insert(golfClub: GolfClub)

    @Insert
    fun insertAll(golfClubs: List<GolfClub>)

    @get:Query("SELECT * FROM golf_clubs")
    val allGolfClubsLiveData: LiveData<List<GolfClub>>

    @Query("SELECT * FROM golf_clubs WHERE name = :clubName LIMIT 1")
    fun getGolfClubByName(clubName: String): GolfClub?
}





