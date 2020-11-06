package com.example.test.mylaunchmodetest.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.test.mylaunchmodetest.R;

public class SingleInstanceActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_instance);
    }

    public void openThirdActivity(View view) {

        startActivity(new Intent(SingleInstanceActivity.this, ThirdActivity.class));

    }
}