package com.pgp.app.appcomponents.database;

import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity(tableName = "Handicap")

public class Handicap {

        @PrimaryKey(autoGenerate = true)
        public int HcpID;
        public int userID;
        public int clubID;
        public int courseID;
        public double ScoreDifferential;
}
