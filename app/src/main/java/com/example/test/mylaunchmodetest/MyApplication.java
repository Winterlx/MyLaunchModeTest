package com.example.test.mylaunchmodetest;

import android.app.Application;

import com.example.test.mylaunchmodetest.utils.ActivityTaskHelper;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        if(BuildConfig.DEBUG) {
            ActivityTaskHelper.init(this);
        }
    }
}
