package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity<resultCode> extends AppCompatActivity {
private TextView mTextViewResult;
private EditText mEditTextNumber1;
private EditText mEditTextNumber2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextViewResult = findViewById(R.id_text_view_result);
        mEditTextNumber1 = findViewById(R.id_edit_text_number1);
        mEditTextNumber2 = findViewById(R.id_edit_text_number2);

        Button buttonOpenActivity2 = findViewById(R.id_open_activity2);
        buttonOpenActivity2.setOnClickListener(new View.OnClickListener() {

            @Override

            public void OnClick(View v ) {
                if (mEditTextNumber1.getText().toString().equals(""))
                    || mEditTextNumber2.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "Please insert symbols", Toast.LENGTH_LONG)
                } else {
            int number1 = Integer.parseInt(mEditTextNumber1.getText().toString());
                    int number2 = Integer.parseInt(mEditTextNumber2.getText().toString());


                   Intent intent = new Intent(MainActivity.this,Activity2.class);
                    intent.putExtra("number1",number1);
                   intent.putExtra("number2",number2);
                    startActivityForResult(intent,1);
                }
            }
        });

    }

@Override
    protected void onActivityResult(int requestCode,int resultCode,Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode ==1 );
        if(resultCode== RESULT_OK);
        int result = data.getIntExtra("result",0);
        mTextViewResult.setText("" + result);
    }

    if(resultCode== RESULT_CANCELED);{
       mTextViewResult.setText("Nothing selected");

    }


}

