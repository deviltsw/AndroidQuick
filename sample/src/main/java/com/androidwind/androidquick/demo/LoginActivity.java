package com.androidwind.androidquick.demo;

import android.os.Bundle;

import com.androidwind.androidquick.demo.base.BaseActivity;
import com.androidwind.androidquick.demo.databinding.ActivityLoginBinding;

public class LoginActivity extends BaseActivity {

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.activity_login;
    }

    @Override
    protected void initViewsAndEvents(Bundle savedInstanceState) {
        super.initViewsAndEvents(savedInstanceState);
        ActivityLoginBinding binding = (ActivityLoginBinding) getBinding();
    }

}