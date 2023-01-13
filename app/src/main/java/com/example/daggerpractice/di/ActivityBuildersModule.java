package com.example.daggerpractice.di;

import com.example.daggerpractice.di.auth.AuthViewModelsModule;
import com.example.daggerpractice.ui.auth.AuthActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {

    //need one for every Activity
    @ContributesAndroidInjector(
            modules = {AuthViewModelsModule.class}
    )
    abstract AuthActivity contributeAuthActivity();

}
