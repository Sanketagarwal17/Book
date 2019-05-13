package com.example.android.book.Base;

public class MvpContract {


    public interface View {
        void showLoading();

        void hideLoading();

        void onError(String message);

        void hideKeyboard();
    }

    public interface Presenter<V extends View>
    {


    }

}
