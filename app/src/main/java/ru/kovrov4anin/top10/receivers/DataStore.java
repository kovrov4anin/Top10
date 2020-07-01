package ru.kovrov4anin.top10.receivers;

import android.app.AlertDialog;
import android.arch.persistence.room.Room;
import android.content.Context;
import android.os.AsyncTask;


import ru.kovrov4anin.top10.receivers.db.Instance;
import ru.kovrov4anin.top10.receivers.db.InstanceDao;
import ru.kovrov4anin.top10.receivers.db.MyDatabase;

public class DataStore implements DataReceiver {
    private Context context;
    MyDatabase data_base;
    InstanceDao instance_dao;


    public DataStore(Context context) {
        this.context = context;
        data_base = Room.databaseBuilder(context, MyDatabase.class, "database").build();
        instance_dao = data_base.instanceDao();
    }


    @Override
    public void PutItem(String title, String link, String description) {
        try {
            Instance instance = new Instance();
            instance.id = System.currentTimeMillis();
            instance.link = link;
            instance.title = title;
            instance.description = description;
            InsertTask task = new InsertTask();
            task.execute(instance);
        } catch (Exception e) {}
    }



    private class InsertTask extends AsyncTask<Instance, Void, Void> {
        @Override
        protected Void doInBackground(Instance... instances) {
            try{
                instance_dao.insert(instances[0]);
            }catch (Exception e){}
            return null;
        }
    }


}
