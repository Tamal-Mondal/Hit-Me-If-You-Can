package com.example.user_administrator.hitmeifyoucan;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by User-Administrator on 4/1/2018.
 */

public class database extends SQLiteOpenHelper
{
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "GameDB";
    public static final String TABLE_NAME = "Hit";
    public static final String COLUMN_1 = "user_id";
    public static final String COLUMN_2 = "score";

    public database(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE "+TABLE_NAME+" ( "+COLUMN_1+" TEXT PRIMARY KEY,"+COLUMN_2+" TEXT)";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        String sql = "DROP TABLE IF EXISTS "+TABLE_NAME;
        db.execSQL(sql);
        onCreate(db);
    }

    public boolean saveScore(String ui, String p)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_1,ui);
        values.put(COLUMN_2,p);
        if(db.insert(TABLE_NAME,null,values)>0){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean updateScore(String ui, String p)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_2,p);
        if(db.update(TABLE_NAME,values,COLUMN_1+"='"+ui+"'",null)>0){
            return true;
        }
        else{
            return false;
        }
    }

    public String checkScore(String ui)
    {
        SQLiteDatabase db = this.getReadableDatabase();
        String sql = "SELECT "+COLUMN_2+" from " + TABLE_NAME + " where " + COLUMN_1 + "='" + ui + "'";
        Cursor cur = db.rawQuery(sql, null);
        if (cur.moveToFirst()) {
            String points =  cur.getString(cur.getColumnIndex(COLUMN_2));
            return points;
        } else {
            return "no";
        }
    }

}
