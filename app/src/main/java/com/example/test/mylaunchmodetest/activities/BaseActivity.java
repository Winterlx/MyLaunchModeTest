package com.example.test.mylaunchmodetest.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.test.mylaunchmodetest.R;

public class BaseActivity extends AppCompatActivity {

    public static final String TAG = "LaunchModeTest";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        Log.i(TAG, getLocalClassName() + " " + "onCreate: ");
        Log.i(TAG, getLocalClassName() + " task id : " + getTaskId());
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, getLocalClassName() + " " + "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, getLocalClassName() + " " + "onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, getLocalClassName() + " " + "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, getLocalClassName() + " " + "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, getLocalClassName() + " " + "onDestroy: ");
    }
}