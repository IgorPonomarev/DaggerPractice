package com.example.daggerpractice.di;

import android.app.Application;

import com.example.daggerpractice.BaseApplication;
import com.example.daggerpractice.SessionManager;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

//if not android dagger then no extends and no first module
@Singleton
@Component(
        modules = {
                AndroidSupportInjectionModule.class,
                ActivityBuildersModule.class,
                AppModule.class,
                ViewModelFactoryModule.class
        }
)
public interface AppComponent extends AndroidInjector<BaseApplication> {

    SessionManager sessionManager();

    //Always needed when using dagger
    @Component.Builder
    interface Builder {

        //To bind Application instance to AppComponent
        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }

    //Need to create inject method if not Android
}
