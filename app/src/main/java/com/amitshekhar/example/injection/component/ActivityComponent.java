package com.amitshekhar.example.injection.component;

import com.amitshekhar.example.injection.annotation.PerActivity;
import com.amitshekhar.example.injection.module.ActivityModule;
import com.amitshekhar.example.ui.main.MainActivity;

import dagger.Component;

/**
 * Created by amitshekhar on 13/01/17.
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);

}
