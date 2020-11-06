package com.example.test.mylaunchmodetest.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.test.mylaunchmodetest.R;

public class SecondActivity extends BaseActivity {

    public static final String TAG = "LaunchModeTest";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void openThirdActivity(View view) {

        Intent i = new Intent(this, ThirdActivity.class);
//        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);

    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.i(TAG, getLocalClassName() + " " + "onNewIntent: ");
    }
}