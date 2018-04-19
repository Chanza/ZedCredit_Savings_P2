package com.example.hp.zedcredit_savings;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.TextView;

public class DB_Controller extends SQLiteOpenHelper {
    public DB_Controller(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, "TEST.db", factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE STUDENTS(ID INTEGER PRIMARY KEY AUTOINCREMENT, FIRSTNAME TEXT UNIQUE, LASTNAME TEXT);");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS STUDENTS;");
        onCreate(sqLiteDatabase );
    }

    //Inseting into table
    public void insert_student(String fname, String sname){
        ContentValues contentValues = new ContentValues();
        contentValues.put("FIRSTNAME",fname);
        contentValues.put("LASTNAME",sname);
        this.getWritableDatabase().insertOrThrow("STUDENTS","",contentValues);
    }

    //Deleting into table
    public void delete_student(String fname){
        this.getWritableDatabase().delete("STUDENTS","FIRSTNAME='"+fname+"'",null);
    }

    //Updating into table
    public void update_student(String old_fname, String new_fname){
        this.getWritableDatabase().execSQL("UPDATE STUDENTS SET FIRSTNAME='"+new_fname+"'WHERE FIRSTNAME='"+old_fname+"'");
    }

    //Viewinging into table
    public void view_student(TextView textView){
        Cursor cursor = this.getReadableDatabase().rawQuery("SELECT * FROM STUDENTS",null);
        textView.setText("");
        while(cursor.moveToNext()){
            textView.append(cursor.getString(1)+"          "+cursor.getString(2)+"\n");

        }

    }

}
