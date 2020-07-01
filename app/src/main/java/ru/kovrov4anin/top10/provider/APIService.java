package ru.kovrov4anin.top10.provider;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import ru.kovrov4anin.top10.model.Responce;

public interface APIService {

    @GET("v1?num=10")
    Call<Responce> GetSearchResult(@Query("key") String key, @Query("cx") String cx, @Query("q") String q);


}
