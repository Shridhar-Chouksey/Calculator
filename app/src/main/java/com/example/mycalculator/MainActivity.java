package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {



    EditText num1EditText,num2EditText,resultEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1EditText=findViewById(R.id.num1);
        num2EditText=findViewById(R.id.num2);
        resultEditText=findViewById(R.id.result);

    }

    public void add(View v){

        int num1=Integer.parseInt(num1EditText.getText().toString());
        int num2=Integer.parseInt(num2EditText.getText().toString());
        resultEditText.setText(""+(num1+num2));
    }

    public void subtract(View v) {
        int num1 = Integer.parseInt(num1EditText.getText().toString());
        int num2 = Integer.parseInt(num2EditText.getText().toString());
        resultEditText.setText("" + (num1 - num2));
    }
        public void multiply(View v)
        {
            int num1 = Integer.parseInt(num1EditText.getText().toString());
            int num2 = Integer.parseInt(num2EditText.getText().toString());
            resultEditText.setText("" + (num1 * num2));
        }
            public void divide(View v)
        {
            int num1 = Integer.parseInt(num1EditText.getText().toString());
            int num2 = Integer.parseInt(num2EditText.getText().toString());
            float result=(float)num1/(float)num2;
            resultEditText.setText("" + (result));
        }

    }
