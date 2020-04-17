package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_NUM1 = "EXTRA_NUM1";
    public static final String EXTRA_NUM2 = "EXTRA_NUM2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addButton = (Button) findViewById(R.id.addButton);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText num1 = (EditText) findViewById(R.id.txtNum1);
                EditText num2 = (EditText) findViewById(R.id.txtNum2);

                TextView display = (TextView) findViewById(R.id.diplay);

                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());

                int sum = number1+number2;

                Intent secondActivity = new Intent(MainActivity.this,MainActivity2.class);
                secondActivity.putExtra(EXTRA_NUM1, number1);
                secondActivity.putExtra(EXTRA_NUM2,number2);
                startActivity(secondActivity);
            }
        });
    }
}