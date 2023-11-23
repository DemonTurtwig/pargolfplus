package com.pgp.app.appcomponents.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "golf_holes")

data class GolfHole(
    @PrimaryKey(autoGenerate = true)

    val holeId: Long = 0,
    val courseId: Long,  // Foreign key referencing golf_courses
    val indexNumber: Int,
    val holeNumber: Int,
    val par: Int
)