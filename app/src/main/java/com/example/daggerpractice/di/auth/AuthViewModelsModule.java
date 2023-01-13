package com.example.daggerpractice.di.auth;

import androidx.lifecycle.ViewModel;

import com.example.daggerpractice.di.ViewModelKey;
import com.example.daggerpractice.ui.auth.AuthViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

/**
 * Needed for every custom ViewModel class
 */
@Module
public abstract class AuthViewModelsModule {

    @Binds
    @IntoMap
    @ViewModelKey(AuthViewModel.class)
    public abstract ViewModel bindAuthViewModel(AuthViewModel viewModel);
}
