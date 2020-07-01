package ru.kovrov4anin.top10.receivers.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {Instance.class}, version = 1)
public abstract class MyDatabase extends RoomDatabase {
    public abstract InstanceDao instanceDao();
}
