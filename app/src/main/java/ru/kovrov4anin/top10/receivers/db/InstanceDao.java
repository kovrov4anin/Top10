package ru.kovrov4anin.top10.receivers.db;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;


@Dao
public interface InstanceDao {

        @Query("SELECT * FROM instance")
        List<Instance> getAll();

        @Query("SELECT * FROM instance WHERE id = :id")
        Instance getById(long id);

        @Insert
        void insert(Instance instance);

        @Update
        void update(Instance instance);

        @Delete
        void delete(Instance instance);

}
