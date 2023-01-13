package com.example.daggerpractice;

import com.example.daggerpractice.di.DaggerAppComponent;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;

//extends Application if not Android
public class BaseApplication extends DaggerApplication {

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        //creating a app-lifetime component
        //return null;
        return DaggerAppComponent.builder().application(this).build();
    }
}
