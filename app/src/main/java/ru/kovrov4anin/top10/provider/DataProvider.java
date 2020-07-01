package ru.kovrov4anin.top10.provider;

import android.app.AlertDialog;
import android.content.Context;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import ru.kovrov4anin.top10.R;
import ru.kovrov4anin.top10.model.Item;
import ru.kovrov4anin.top10.model.Responce;
import ru.kovrov4anin.top10.receivers.DataReceiver;

public class DataProvider {
    private static final String base_url = "https://www.googleapis.com/customsearch/";
    private Context context;
    private List<DataReceiver> receivers;
    private Retrofit retrofit;
    private APIService api_service;

    public DataProvider(Context context) {
        this.context = context;
        receivers = new ArrayList<>();
        retrofit = new Retrofit.Builder()
                .baseUrl(base_url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        api_service = retrofit.create(APIService.class);
    }


    public void AddReceiver(DataReceiver receiver) {
        receivers.add(receiver);
    }


    public void Request(String request) {
       api_service.GetSearchResult(
                context.getResources().getString(R.string.api_key),
                context.getResources().getString(R.string.search_engine),
                request).enqueue(new Callback<Responce>() {
           @Override
           public void onResponse(Call<Responce> call, Response<Responce> response) {
               ExtractData(response.body());
           }

           @Override
           public void onFailure(Call<Responce> call, Throwable t) {
               FailureMessage(t.getMessage());
           }
       });
    }


    private void ExtractData(Responce responce) {
        try {
            Iterator<Item> item_iterator = responce.getItems().iterator();
            while (item_iterator.hasNext()) {
                Item item = item_iterator.next();
                for (DataReceiver receiver: receivers) {
                    receiver.PutItem(item.getTitle(), item.getLink(), item.getSnippet());
                }
            }
        } catch (Exception e) {}
    }


    private void FailureMessage(String message) {
        AlertDialog.Builder ad = new AlertDialog.Builder(context);
        ad.setIcon(android.R.drawable.ic_dialog_alert);
        ad.setMessage(message);
        ad.setCancelable(true);
        ad.show();
    }


}
