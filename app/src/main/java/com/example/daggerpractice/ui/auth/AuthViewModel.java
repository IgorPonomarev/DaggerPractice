package com.example.daggerpractice.ui.auth;

import android.util.Log;

import androidx.lifecycle.ViewModel;

import com.example.daggerpractice.network.auth.AuthAPI;

import javax.inject.Inject;

public class AuthViewModel extends ViewModel {

    private static final String TAG = "AuthViewModel";

    private final  AuthAPI authAPI;

    @Inject
    public AuthViewModel(AuthAPI authAPI) {
        this.authAPI = authAPI;

        if (authAPI == null){
            Log.d(TAG, "AuthViewModel: auth api is null");
        } else {
            Log.d(TAG, "AuthViewModel: auth api is not null");
        }
    }
}
