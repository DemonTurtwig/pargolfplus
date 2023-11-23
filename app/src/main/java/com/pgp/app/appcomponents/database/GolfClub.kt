package com.pgp.app.appcomponents.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "golf_clubs")
    data class GolfClub(
        @PrimaryKey(autoGenerate = true)
        val id: Long = 0,
        val name: String,
        val location: String
    )