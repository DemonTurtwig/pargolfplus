package com.pgp.app.appcomponents.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import java.util.Date

@Entity(tableName = "Handicap")
class Handicap {
    @PrimaryKey(autoGenerate = true)
    var HcpID = 0
    var username: String = "" // string
    var clubID: Int = 0 // FK from GolfClub
    var courseID: Int = 0 // FK from GolfCourse
    var ScoreDifferential: Double = 0.0 // Double Value
    var StrokeTotal: Int = 0

    @TypeConverters(DateConverter::class)
    var DateToday: Date? = null // date
}