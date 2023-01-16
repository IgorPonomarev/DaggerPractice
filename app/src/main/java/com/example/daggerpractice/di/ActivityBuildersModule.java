package com.example.daggerpractice.di;

import android.app.Activity;

import com.example.daggerpractice.di.auth.AuthModule;
import com.example.daggerpractice.di.auth.AuthViewModelsModule;
import com.example.daggerpractice.di.main.MainFragmentBuildersModule;
import com.example.daggerpractice.di.main.MainViewModelsModule;
import com.example.daggerpractice.ui.auth.AuthActivity;
import com.example.daggerpractice.ui.main.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {

    //need one for every Activity
    //automatically creates a subcomponent
    @ContributesAndroidInjector(
            modules = {AuthViewModelsModule.class, AuthModule.class}
    )
    abstract AuthActivity contributeAuthActivity();


    @ContributesAndroidInjector(
            modules = {MainFragmentBuildersModule.class, MainViewModelsModule.class}
    )
    abstract MainActivity contributeMainActivity();

}
