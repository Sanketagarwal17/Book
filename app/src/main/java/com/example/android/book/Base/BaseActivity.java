package com.example.android.book.Base;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.android.book.di.Component.ActivityComponent;
import com.example.android.book.di.Module.ActivityModule;
import com.example.android.book.di.Module.AdapterModule;

import butterknife.Unbinder;

public abstract class BaseActivity extends AppCompatActivity
        implements MvpContract.View {


    ActivityComponent mActivityComponent;
    ProgressDialog progressDialog;
    private Unbinder mUnBinder;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /*mActivityComponent = DaggerActivityComponent.builder()
                .activityModule(new ActivityModule(this)).adapterModule(new AdapterModule(this))
                .applicationComponent(((AppController) getApplication()).getComponent())
                .build();*/
    }

    public void onAttach(Context c) {
        progressDialog = new ProgressDialog(c);
    }

    public ActivityComponent getActivityComponent() {
        return mActivityComponent;
    }


    public void setUnBinder(Unbinder unBinder) {
        mUnBinder = unBinder;
    }

    @Override
    protected void onDestroy() {
        if (mUnBinder != null) {
            mUnBinder.unbind();
        }
        super.onDestroy();
    }

    @Override
    public void showLoading() {
    }

    @Override
    public void hideLoading() {
    }

    @Override
    public void onError(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
      //  Timber.e(message);
    }



    @Override
    public void hideKeyboard() {

    }

}

