package com.example.test.mylaunchmodetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

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
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);
    }

    public void btn3Click(View view) {
    }

    public void btn4Click(View view) {
    }


}