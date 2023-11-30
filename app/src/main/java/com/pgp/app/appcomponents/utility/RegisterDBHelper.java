package com.pgp.app.appcomponents.utility;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class RegisterDBHelper extends SQLiteOpenHelper {

    // Database information
    private static final String DATABASE_NAME = "userinformation.db";
    private static final int DATABASE_VERSION = 1;
    // SQL statement to create the user table
    public static final String TABLE_NAME = "user_data";

    public static final String USER_ID = "user_id";
    public static final String COLUMN_USERNAME = "username";
    public static final String COLUMN_FIRST_NAME = "first_name";
    public static final String COLUMN_LAST_NAME = "last_name";
    public static final String COLUMN_PASSWORD = "password";
    private static final String SQL_CREATE_USER_TABLE =

            "CREATE TABLE " + TABLE_NAME + " (" +
                    USER_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                    COLUMN_USERNAME + " TEXT," +
                    COLUMN_FIRST_NAME + " TEXT," +
                    COLUMN_LAST_NAME + " TEXT," +
                    COLUMN_PASSWORD + " TEXT)";
    // SQL statement to delete the user table
    private static final String SQL_DELETE_USER_TABLE =
            "DROP TABLE IF EXISTS " + TABLE_NAME;

    public RegisterDBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // Create the user table
        db.execSQL(SQL_CREATE_USER_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Upgrade the database (if needed)
        db.execSQL(SQL_DELETE_USER_TABLE);
        onCreate(db);
    }


    public String getFullNameByUsername(String username) {
        SQLiteDatabase db = this.getReadableDatabase();
        String[] projection = {COLUMN_FIRST_NAME, COLUMN_LAST_NAME};
        String selection = COLUMN_USERNAME + " = ?";
        String[] selectionArgs = {username};

        Cursor cursor = db.query(
                TABLE_NAME,
                projection,
                selection,
                selectionArgs,
                null,
                null,
                null
        );

        String fullName = null;

        if (cursor != null && cursor.moveToFirst()) {
            String firstName = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_FIRST_NAME));
            String lastName = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_LAST_NAME));
            fullName = firstName + " " + lastName;
            cursor.close();
        }

        db.close();
        return fullName;
    }
    public void updatePassword(String username, String newPassword) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_PASSWORD, newPassword);

        String selection = COLUMN_USERNAME + " = ?";
        String[] selectionArgs = {username};

        int count = db.update(
                TABLE_NAME,
                values,
                selection,
                selectionArgs);

        if (count == 0) {
            Log.e("RegisterDBHelper", "Password update failed for username: " + username);
        }

        db.close();
    }
}
