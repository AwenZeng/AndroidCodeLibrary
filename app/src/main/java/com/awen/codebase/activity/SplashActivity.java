package com.awen.codebase.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.view.Window;

import com.awen.codebase.R;
import com.awen.codebase.common.base.BaseActivity;

/**
 * Created by AwenZeng on 2017/4/20.
 */

public class SplashActivity extends BaseActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setActivityContentView(R.layout.act_splash);
        hideActTitileBar();
        new Handler(new Handler.Callback() {
            @Override
            public boolean handleMessage(Message msg) {
                startActivity(new Intent(SplashActivity.this,MainActivity.class));
                finish();
                return false;
            }
        }).postDelayed(null,1500);
    }
}
