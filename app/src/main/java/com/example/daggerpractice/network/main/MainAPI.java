package com.example.daggerpractice.network.main;

import com.example.daggerpractice.models.Post;

import java.util.List;

import io.reactivex.rxjava3.core.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MainAPI {

    @GET("posts")
    Flowable<List<Post>> getUsersPosts(
            @Query("userID") int id
    );
}
