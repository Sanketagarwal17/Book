package com.example.android.book.Authentication.Login;

import com.example.android.book.Base.MvpContract;

public class LoginContract {

    public interface View extends MvpContract.View{
        /*void showloginResult();

        void loadingSuccesful();

        void errorOnLoading(String error);

        void startLoading();
*/
    }

    public interface Presenter<V extends View> //extends MvpContract.Presenter<V>//
    {

  public void doLogin(String email,String password);
    }
}
