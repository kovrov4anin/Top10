package ru.kovrov4anin.top10.receivers;

public interface DataReceiver {

    void PutItem(String title, String link, String description);

}
