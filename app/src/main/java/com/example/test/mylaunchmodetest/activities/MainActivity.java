package com.example.test.mylaunchmodetest.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.test.mylaunchmodetest.R;

public class MainActivity extends BaseActivity {


    public static final String TAG = "TestMain";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void openSingleInstanceActivity(View view) {
        startActivity(new Intent(MainActivity.this, SingleInstanceActivity.class));
    }

    public void openSecondActivity(View view) {
        Intent i = new Intent(MainActivity.this, SecondActivity.class);
//        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);
    }

    public void openThirdActivity(View view) {

        Intent i = new Intent(this, ThirdActivity.class);
//        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);

    }

    public void btn4Click(View view) {

    }


}