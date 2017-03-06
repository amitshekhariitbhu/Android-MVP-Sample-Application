/*
 *    Copyright (C) 2017 MINDORKS NEXTGEN PRIVATE LIMITED
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

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
