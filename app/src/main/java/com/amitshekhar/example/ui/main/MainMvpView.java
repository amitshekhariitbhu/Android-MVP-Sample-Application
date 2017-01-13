package com.amitshekhar.example.ui.main;

import com.amitshekhar.example.ui.base.MvpView;

/**
 * Created by amitshekhar on 13/01/17.
 */

public interface MainMvpView extends MvpView {

    void showData(String data);

    void showError(String error);
}
