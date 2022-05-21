package com.azismihsan.testskripsi;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        //actionbar and title
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Profile");
    }
}