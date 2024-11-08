package com.pgp.app.appcomponents.database;

import static kotlinx.coroutines.CoroutineScopeKt.CoroutineScope;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Build;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import kotlinx.coroutines.Dispatchers;

public class DatabaseInitializer {

    public static void initializeData(final AppDatabase database, final Context context) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            CompletableFuture.runAsync(() -> {
                // Call the method to insert the data
                insertData(database, context);
            });
        }
    }

    static void insertData(AppDatabase database, Context context) {
        // Access the DAO methods and insert your data
        GolfClubDao golfClubDao = database.golfClubDao();
        insertGolfClubData(database, GolfClubData.INSTANCE.getClubs());
        GolfCourseDao golfCourseDao = database.golfCourseDao();
        insertGolfCourseData(database, GolfCourseData.INSTANCE.getCourses());
        GolfHoleDao golfHoleDao = database.golfHoleDao();
        insertGolfHoleData(database, GolfHoleData01.INSTANCE.getHoles01());
        insertGolfHoleData(database, GolfHoleData02.INSTANCE.getHoles02());
        insertGolfHoleData(database, GolfHoleData03.INSTANCE.getHoles03());
        insertGolfHoleData(database, GolfHoleData04.INSTANCE.getHoles04());
        insertGolfHoleData(database, GolfHoleData05.INSTANCE.getHoles05());
        insertGolfHoleData(database, GolfHoleData06.INSTANCE.getHoles06());
        insertGolfHoleData(database, GolfHoleData07.INSTANCE.getHoles07());
        insertGolfHoleData(database, GolfHoleData08.INSTANCE.getHoles08());
        insertGolfHoleData(database, GolfHoleData09.INSTANCE.getHoles09());
        insertGolfHoleData(database, GolfHoleData10.INSTANCE.getHoles10());
        insertGolfHoleData(database, GolfHoleData11.INSTANCE.getHoles11());
        insertGolfHoleData(database, GolfHoleData12.INSTANCE.getHoles12());
        insertGolfHoleData(database, GolfHoleData13.INSTANCE.getHoles13());
    }

    private static void insertGolfClubData(AppDatabase database, List<GolfClub> golfClubs) {
        GolfClubDao golfClubDao = database.golfClubDao();
        database.runInTransaction(() -> {
            golfClubDao.insertAll(golfClubs);
            return null;
        });
    }

    private static void insertGolfCourseData(AppDatabase database, List<GolfCourse> golfCourses) {
        GolfCourseDao golfCourseDao = database.golfCourseDao();
        database.runInTransaction(() -> {
            golfCourseDao.insertAll(golfCourses);
            return null;
        });
    }

    private static void insertGolfHoleData(AppDatabase database, List<GolfHole> golfHoles) {
        GolfHoleDao golfHoleDao = database.golfHoleDao();
        database.runInTransaction(() -> {
            golfHoleDao.insertAll(golfHoles);
            return null;
        });
    }


}
