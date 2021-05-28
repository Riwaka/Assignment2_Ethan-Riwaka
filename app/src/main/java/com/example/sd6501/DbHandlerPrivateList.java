package com.example.sd6501;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.HashMap;

public class DbHandlerPrivateList extends SQLiteOpenHelper {

    private static final int DB_VERSION = 201;
    private static final String DB_NAME = "mangadb";
    private static final String TABLE_Users = "mangalist";
    private static final String KEY_ID = "id";
    private static final String KEY_TITLE = "title";
    Context context;

    public DbHandlerPrivateList(@Nullable Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_TABLE = "CREATE TABLE " + TABLE_Users + "("
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + KEY_TITLE + " TEXT "
                + ")";
        db.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_Users);
        onCreate(db);
    }

    public void InsertUserDetails(String title)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(KEY_TITLE, title);
        long newRowId = db.insert(TABLE_Users, null, contentValues);
        db.close();
    }

    public ArrayList<HashMap<String,String>> GetManga()
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ArrayList<HashMap<String, String>> userList = new ArrayList<>();
        String query = "SELECT title, id FROM " + TABLE_Users;
        Cursor cursor = db.rawQuery(query, null);

        while(cursor.moveToNext()) {
            HashMap<String, String> user = new HashMap<>();
            user.put("title", cursor.getString(cursor.getColumnIndex(KEY_TITLE)));
            user.put("id", cursor.getString(cursor.getColumnIndex(KEY_ID)));
            userList.add(user);
        }
        return userList;
    }

    public int UpdateUserDetails(String title, int id){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(KEY_TITLE, title);
        int count = db.update(TABLE_Users,
                contentValues,
                KEY_ID + " = ?",
                new String[]{String.valueOf(id)});
        return count;
    }

    public void DeleteUser(int userId){
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_Users,
                KEY_ID + " = ?",
               new String[]{String.valueOf(userId)});
        db.close();
    }
}
