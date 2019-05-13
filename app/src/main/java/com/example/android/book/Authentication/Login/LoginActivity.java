package com.example.android.book.Authentication.Login;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.android.book.Authentication.ForgetPassword.ForgetPassword;
import com.example.android.book.Authentication.SignUp.SignUpActivity;
import com.example.android.book.Base.BaseActivity;
import com.example.android.book.Home.MainActivity;
import com.example.android.book.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

import static android.provider.Telephony.Carriers.PASSWORD;

public class LoginActivity extends BaseActivity implements LoginContract.View {

    @BindView(R.id.login_email)
    EditText email;

    @BindView(R.id.login_password)
    EditText password;

    @BindView(R.id.sign_up)
    EditText signup;

    @BindView(R.id.sign_up2)
    EditText signup2;

    @BindView(R.id.login)
    Button login;

    @BindView(R.id.forget_password)
    EditText forgetpassword;

    FirebaseAuth firebaseAuth;
    FirebaseUser firebaseUser;

    @Inject
    LoginContract.Presenter<LoginContract.View> mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
       // getActivityComponent().inject(this);
        ButterKnife.bind(this);
        //mPresenter.onAttach(this);


    login.setOnClickListener(v -> {

        String user = email.getText().toString().trim();
        String pass = password.getText().toString().trim();


                if (user.equalsIgnoreCase(""))
                {
                    email.setError("can't be blank");
                }
                else if (PASSWORD.equalsIgnoreCase(""))
                {
                    password.setError("can't be blank");
                }

                else {
                    showLoading();
                    mPresenter.doLogin(user,pass);
                    hideLoading();

                }



    });
















    }

















       /* firebaseAuth = FirebaseAuth.getInstance();
        firebaseUser=firebaseAuth.getCurrentUser();
       if(firebaseUser!=null)
       {
            finish();
            startActivity(new Intent(LoginActivity.this,MainActivity.class));
        }
    }

    public void login(View view) {
        String user = username.getText().toString().trim();
        String pass = password.getText().toString().trim();

        if (user.equalsIgnoreCase(""))
        {
            username.setError("can't be blank");
        }
        else if (PASSWORD.equalsIgnoreCase(""))
        {
            password.setError("can't be blank");
        }

        else {
            final ProgressDialog progressDialog = new ProgressDialog(this);
            progressDialog.setMessage("Loading");
            progressDialog.show();

            firebaseAuth.signInWithEmailAndPassword(user, pass)
                    .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            progressDialog.dismiss();
                            if (task.isSuccessful()) {
                                finish();
                                Toast.makeText(LoginActivity.this, "Logged In", Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(LoginActivity.this, MainActivity.class));
                            } else
                                Toast.makeText(LoginActivity.this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    });
        }
    }


*/
    public void signup(View view) {
        finish();
        startActivity(new Intent(LoginActivity.this, SignUpActivity.class));
    }

    public void forgetPassword(View v)
    {
        startActivity(new Intent(LoginActivity.this,ForgetPassword.class));
    }

}
