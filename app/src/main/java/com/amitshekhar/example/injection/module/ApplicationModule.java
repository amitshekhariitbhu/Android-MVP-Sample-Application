package com.amitshekhar.example.injection.module;

import android.app.Application;
import android.content.Context;

import com.amitshekhar.example.injection.annotation.ApplicationContext;

import dagger.Module;
import dagger.Provides;

/**
 * Created by amitshekhar on 13/01/17.
 */
@Module
public class ApplicationModule {

    protected final Application mApplication;

    public ApplicationModule(Application application) {
        mApplication = application;
    }

    @Provides
    Application provideApplication() {
        return mApplication;
    }

    @Provides
    @ApplicationContext
    Context provideContext() {
        return mApplication;
    }

}