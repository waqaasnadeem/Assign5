package com.example.wiki.assign5;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;


@Database(entities = {User.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    private static AppDatabase INSTANCE;

    public abstract UserDAO userDAO();

    public static AppDatabase getINSTANCE(Context context)
    {
        if(INSTANCE == null)
        {
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(),AppDatabase.class, "user-database").build();
        }
        return INSTANCE;
    }
    public static void destroyINSTANCE()
    {
        INSTANCE = null;
    }
}
