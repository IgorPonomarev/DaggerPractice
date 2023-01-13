package com.example.daggerpractice;

import android.os.Bundle;

import dagger.android.support.DaggerAppCompatActivity;

//extends DaggerAppCompatActivity to has premade injector
public class AuthActivity extends DaggerAppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);
    }
}