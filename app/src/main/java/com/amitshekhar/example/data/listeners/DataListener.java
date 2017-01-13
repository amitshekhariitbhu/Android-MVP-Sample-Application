package com.amitshekhar.example.data.listeners;

/**
 * Created by amitshekhar on 13/01/17.
 */

public interface DataListener {

    void onResponse(String data);

    void onError(String error);

}
