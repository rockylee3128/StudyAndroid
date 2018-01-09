package com.example.rocky.studyandroid;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        findViewById(R.id.activity_main_text).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(MainActivity.this, Activity1.class));
//                new AlertDialog.Builder(MainActivity.this).setTitle("Dialog").show();
//
//
//            }
//        });
        findViewById(R.id.add).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ActivityAdd.class));
            }
        });

        Log.e("rockytext", "MainActivity onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("rockytext", "MainActivity onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("rockytext", "MainActivity onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("rockytext", "MainActivity onResume");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.e("rockytext", "MainActivity onPause");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.e("rockytext", "MainActivity onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("rockytext", "MainActivity onDestroy");
    }
}
