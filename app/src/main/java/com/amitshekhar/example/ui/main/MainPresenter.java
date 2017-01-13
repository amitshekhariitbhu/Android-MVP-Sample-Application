package com.amitshekhar.example.ui.main;

import com.amitshekhar.example.data.listeners.DataListener;
import com.amitshekhar.example.data.DataManager;
import com.amitshekhar.example.ui.base.BasePresenter;

import javax.inject.Inject;

/**
 * Created by amitshekhar on 13/01/17.
 */

public class MainPresenter<V extends MainMvpView> extends BasePresenter<V> implements MainMvpPresenter<V> {

    private final DataManager mDataManager;

    @Inject
    public MainPresenter(DataManager dataManager) {
        this.mDataManager = dataManager;
    }

    @Override
    public void getData() {

        getMvpView().showLoading();

        mDataManager.getData(new DataListener() {
            @Override
            public void onResponse(String data) {
                getMvpView().hideLoading();
                getMvpView().showData(data);
            }

            @Override
            public void onError(String error) {
                getMvpView().hideLoading();
                getMvpView().showData(error);
            }
        });
    }
}
