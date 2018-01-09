package com.example.rocky.studyandroid;

import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        Log.e("rockytext", "Activity1 onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("rockytext", "Activity1 onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("rockytext", "Activity1 onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("rockytext", "Activity1 onResume");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.e("rockytext", "Activity1 onPause");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.e("rockytext", "Activity1 onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("rockytext", "Activity1 onDestroy");
    }
}
