package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        setTitle("Activity2");

        Intent intent = getIntent();
        final int number1 =intent.getIntExtra("number1",0);
        final int number2 =intent.getIntExtra("number2",0);

        TextView textViewNumbers = findViewById(R.id_view_numbers);
        textViewNumbers.setText("Numbers :" + number1 +"," +number2);

        Button buttonAdd = findViewById(R.id_button_add);
        Button buttonSubtract = findViewById((R.id_button_subtract);
         buttonAdd.setOnClickListener(new OnClickListener() {

             @Override

             public void onClick(View v) {
int result = number1 + number2 ;
Intent resultIntent = new Intent();
resultIntent.putExtra("result",result);

setResult(RESULT_OK,resultIntent);
finish();
             }
         });
    }

        buttonSubtract.setOnClickListener(new OnClickListener() {
        }


            @Override

        public void onClick(View v) {
            int result = number1 - number2 ;
            Intent resultIntent = new Intent();
            resultIntent.putExtra("result",result);

            setResult(RESULT_OK,resultIntent);
            finish();

        }


    }

