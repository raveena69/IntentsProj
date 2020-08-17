package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText etNum1;
    EditText etNum2;
    TextView txtresult;

    String number1;
    String number2;

    int n1,n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        etNum1 = findViewById(R.id.etnum1);
        etNum2 = findViewById(R.id.etnum2);
        txtresult = findViewById(R.id.txtresult);

        Intent intent = getIntent();

        number1 = intent.getStringExtra("n1");
        number2 = intent.getStringExtra("n2");

        etNum1.setText(number1);
        etNum2.setText(number2);

        n1 = Integer.parseInt(number1);
        n2 = Integer.parseInt(number2);


    }

    public  void  add(View view){
        txtresult.setText(number1+ " + " + number2 + " = " + (n1+n2));
    }

    public  void  substract(View view){
        txtresult.setText(number1+ " - " + number2 + " = " + (n1-n2));
    }

    public  void  multiply(View view){
        txtresult.setText(number1+ " * " + number2 + " = " + (n1*n2));
    }

    public  void  devition(View view){
        txtresult.setText(number1+ " / " + number2 + " = " + (n1/n2));
    }
}