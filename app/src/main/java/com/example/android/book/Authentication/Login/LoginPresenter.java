package com.example.android.book.Authentication.Login;

import com.example.android.book.Base.BasePresenter;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginPresenter<V extends LoginContract.View>
        implements LoginContract.Presenter<V> {



    FirebaseAuth firebaseAuth;
    FirebaseUser firebaseUser;

    @Override
    public void doLogin(String email, String password) {

    }
}
