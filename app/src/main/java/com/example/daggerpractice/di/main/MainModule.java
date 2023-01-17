package com.example.daggerpractice.di.main;

import com.example.daggerpractice.network.main.MainAPI;
import com.example.daggerpractice.ui.main.posts.PostsRecyclerAdapter;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

@Module
public class MainModule {

    @MainScope
    @Provides
    static PostsRecyclerAdapter provideAdapter() {
        return new PostsRecyclerAdapter();
    }

    @MainScope
    @Provides
    static MainAPI provideMainAPI(Retrofit retrofit) {
        return retrofit.create(MainAPI.class);
    }
}
