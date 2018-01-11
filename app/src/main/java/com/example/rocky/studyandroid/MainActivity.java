package com.example.rocky.studyandroid;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.example.rocky.studyandroid.model.UIListData;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private UIListData uiListData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUI(mockData());



        Log.e("rockytext", "MainActivity onCreate");
    }


    private void setupUI(List<UIListData> data) {
        ListView listView = ((ListView) findViewById(R.id.main_list_view));
        listView.setAdapter(new UIListAdapter(this, data));
    }

    private List<UIListData> mockData() {
        List<UIListData> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            UIListData uiListData = new UIListData();
            uiListData.listName = "房地产" + i;
            uiListData.listTime = "14:28:03";
            uiListData.ExpectPrice = 99.1 + (double) i;
            uiListData.avePrice = 64.12 + (double) i;
            uiListData.finalPrice = 99.4 + (double) i;
            uiListData.number = 1000 + i;
            uiListData.listStatus = "已报";
            uiListData.listInout = "买入";
            uiListData.orderStatus = "撤单";
            list.add(uiListData);
        }
        return list;
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
