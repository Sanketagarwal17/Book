package com.example.android.book.Authentication.Login;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.widget.Toast;

import com.example.android.book.Admin.AdminActivity;
import com.example.android.book.Authentication.SignUp.SignUpActivity;
import com.example.android.book.Base.BasePresenter;
import com.example.android.book.BuildConfig;
import com.example.android.book.Home.MainActivity;
import com.example.android.book.Member.MemberActivity;
import com.example.android.book.Student.StudentActivity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginPresenter<V extends LoginContract.View>
        implements LoginContract.Presenter<V> {


    LoginContract.View view;
    FirebaseAuth firebaseAuth;
    FirebaseUser firebaseUser;

    @Override
    public void doLogin(String email, String password) {
        firebaseAuth = FirebaseAuth.getInstance();
        firebaseUser=firebaseAuth.getCurrentUser();

        firebaseAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            if (BuildConfig.FLAVOR.equals("admin")) {

                               view.showloginResult();
                            }
                            else if (BuildConfig.FLAVOR.equals("member")) {
                            }

                            else {
                            }

                        } else {}
                }
                });

    }
}






