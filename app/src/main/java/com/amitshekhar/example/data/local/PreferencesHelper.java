package com.amitshekhar.example.data.local;

import android.content.Context;
import android.content.SharedPreferences;

import com.amitshekhar.example.injection.annotation.ApplicationContext;

import javax.inject.Inject;
import javax.inject.Singleton;


/**
 * Created by amitshekhar on 13/01/17.
 */
@Singleton
public class PreferencesHelper {

    private static final String PREF_FILE_NAME = "pref_file";
    private static final String DATA = "DATA";
    private final SharedPreferences mPref;

    @Inject
    public PreferencesHelper(@ApplicationContext Context context) {
        mPref = context.getSharedPreferences(PREF_FILE_NAME, Context.MODE_PRIVATE);
    }

    public void clear() {
        mPref.edit().clear().apply();
    }

    public void putData(String data) {
        mPref.edit().putString(DATA, data).apply();
    }

    public String getData() {
        return mPref.getString(DATA, null);
    }

}
