package com.pgp.app.appcomponents.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "golf_course")
data class GolfCourse(
    @PrimaryKey(autoGenerate = true)
    val courseId: Long = 0,
    val courseName: String,
    val clubId: Long,  // Foreign key referencing golf_clubs
    val blueCr: Double?,
    val blueSr: Int?,
    val whiteCr: Double?,
    val whiteSr: Int?,
    val redCr: Double?,
    val redSr: Int?
)