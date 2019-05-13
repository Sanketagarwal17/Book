package com.example.android.book.di.Component;

import com.example.android.book.Base.AppController;
import com.example.android.book.di.Module.ApplicationModule;
import com.example.android.book.di.Qualifier.ApplicationScope;

import dagger.Component;

@ApplicationScope
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {

    void inject(AppController appController);
}


