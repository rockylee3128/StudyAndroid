package com.example.rocky.studyandroid;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


/**
 * Created by rocky on 18/1/8.
 */

public class ActivityAdd extends MainActivity {
    String num1;
    String num2;
    int number1;
    int number2;
    int result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        findViewById(R.id.activity_add_result).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = ((EditText) findViewById(R.id.activity_add_number_1)).getText().toString();
                num2 =  ((EditText) findViewById(R.id.activity_add_number_2)).getText().toString();
                number1 = Integer.parseInt(num1);
                number2 = Integer.parseInt(num2);
                result = number1 + number2;
                ((TextView)findViewById(R.id.activity_add_resultShow)).setText(String.valueOf(result));
            }
        });
    }
}
