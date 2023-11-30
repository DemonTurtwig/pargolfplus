package com.pgp.app.appcomponents.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "hole_strokes")
data class HoleStrokes(
    @PrimaryKey(autoGenerate = true)
    val holeId: Int? = null,
    var strokes: String?,
    val savedHole: String?
)