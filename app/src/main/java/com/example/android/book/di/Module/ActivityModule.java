package com.example.android.book.di.Module;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import com.example.android.book.Authentication.Login.LoginContract;
import com.example.android.book.Authentication.Login.LoginPresenter;
import com.example.android.book.di.Qualifier.ActivityContext;

import dagger.Provides;

public class ActivityModule {

    private AppCompatActivity mActivity;

    public ActivityModule(AppCompatActivity activity) {
        this.mActivity = activity;
    }

    @Provides
    @ActivityContext
    Context provideContext() {
        return mActivity;
    }

    @Provides
    AppCompatActivity provideActivity() {
        return mActivity;
    }



    @Provides
    LoginContract.Presenter<LoginContract.View> providesLoginPresenter(LoginPresenter<LoginContract.View> presenter) {
        return presenter;
    }

}
