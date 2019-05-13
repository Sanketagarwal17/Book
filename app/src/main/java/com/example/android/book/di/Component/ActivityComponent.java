package com.example.android.book.di.Component;

import com.example.android.book.Authentication.Login.LoginActivity;
import com.example.android.book.di.Module.ActivityModule;
import com.example.android.book.di.Module.AdapterModule;

import dagger.Component;


@Component(dependencies = ApplicationComponent.class, modules = {ActivityModule.class, AdapterModule.class})
public interface ActivityComponent {

    void Inject (LoginActivity loginActivity);

}
