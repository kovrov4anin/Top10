package ru.kovrov4anin.top10.receivers.db;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Instance {

    @PrimaryKey
    public long id;

    public String title;

    public String link;

    public String description;

}
