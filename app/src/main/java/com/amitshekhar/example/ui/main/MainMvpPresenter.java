package com.amitshekhar.example.ui.main;

import com.amitshekhar.example.ui.base.MvpPresenter;

/**
 * Created by amitshekhar on 13/01/17.
 */

public interface MainMvpPresenter<V extends MainMvpView> extends MvpPresenter<V> {

    void getData();

}
