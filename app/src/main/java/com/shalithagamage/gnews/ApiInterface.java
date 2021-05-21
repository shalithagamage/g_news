package com.shalithagamage.gnews;

import com.shalithagamage.gnews.model.Headlines;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("top-headlines")
    Call<Headlines> getHeadlines(
            @Query("token") String token
    );

}
