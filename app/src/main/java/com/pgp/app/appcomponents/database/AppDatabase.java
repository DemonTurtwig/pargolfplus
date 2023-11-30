package com.pgp.app.appcomponents.database;
import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;



@Database(entities = {GolfClub.class, GolfCourse.class, GolfHole.class, Handicap.class, HoleStrokes.class}, version = 2)

public abstract class AppDatabase extends RoomDatabase {

    private static final String DATABASE_NAME = "golf_data";

    public abstract GolfClubDao golfClubDao();

    public abstract GolfCourseDao golfCourseDao();

    public abstract GolfHoleDao golfHoleDao();

    public abstract StrokesDao strokesDao();

    public abstract HandicapDao handicapDao();

    private static AppDatabase instance;

    public static synchronized AppDatabase getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(
                    context.getApplicationContext(),
                    AppDatabase.class,
                    "golf_data" // Specify a database name
            ).fallbackToDestructiveMigration().build();
        }

        return instance;
    }
}


