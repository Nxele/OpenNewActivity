package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        int number1 = intent.getIntExtra(MainActivity.EXTRA_NUM1,0);
        int number2 = intent.getIntExtra(MainActivity.EXTRA_NUM2,0);

        TextView display = (TextView) findViewById(R.id.txtDisplay);

        int sum = number1+number2;
        display.setText("SUM OF "+number1+" + "+number2+" = "+sum);

    }
}