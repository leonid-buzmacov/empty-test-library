package com.emptytestproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.emptytestproject.emptytestlibrary.EmptyClass;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new EmptyClass().uselessMethod();
    }
}

// changes made in the develop branch