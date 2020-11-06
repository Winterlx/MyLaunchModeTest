package com.example.test.mylaunchmodetest.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.test.mylaunchmodetest.R;
import com.example.test.mylaunchmodetest.activities.SecondActivity;

public class ThirdActivity extends BaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }

    public void openSecondActivity(View view) {

        Intent i = new Intent(this, SecondActivity.class);
//        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);

    }
}