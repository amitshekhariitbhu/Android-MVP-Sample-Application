package com.amitshekhar.example.injection.component;

import android.app.Application;
import android.content.Context;

import com.amitshekhar.example.MyApplication;
import com.amitshekhar.example.data.DataManager;
import com.amitshekhar.example.injection.annotation.ApplicationContext;
import com.amitshekhar.example.injection.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by amitshekhar on 13/01/17.
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(MyApplication myApplication);

    @ApplicationContext
    Context context();

    Application application();
    DataManager dataManager();

}
