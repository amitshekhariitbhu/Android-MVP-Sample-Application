package com.amitshekhar.example.ui.main;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.amitshekhar.example.R;
import com.amitshekhar.example.ui.base.BaseActivity;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity implements MainMvpView {

    @Inject
    MainPresenter<MainMvpView> mMainPresenter;

    @BindView(R.id.textViewData)
    TextView textViewData;

    public static Intent getStartIntent(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityComponent().inject(this);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mMainPresenter.attachView(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mMainPresenter.detachView();
    }

    @Override
    public void showData(String data) {
        textViewData.setText(data);
    }

    @Override
    public void showError(String error) {
        textViewData.setText(error);
    }

    @OnClick(R.id.btnLoadData)
    void btnLoadData() {
        mMainPresenter.getData();
    }
}
