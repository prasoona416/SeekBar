package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2;
    Button b1;
    TextView tv1,tv2,tv3,tv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText) findViewById(R.id.editText1);
        et2 = (EditText) findViewById(R.id.editText2);
        tv4 = (TextView) findViewById(R.id.editTextTextPersonName3);
        b1=(Button) findViewById(R.id.button);
        tv1= (TextView) findViewById(R.id.textView1);
        tv2= (TextView) findViewById(R.id.textView2);
        tv3= (TextView) findViewById(R.id.textView3);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i = Integer.parseInt(et1.getText().toString());
                int j = Integer.parseInt(et2.getText().toString());
                int k = i+j;
                tv4.setText(k+"");

            }
        });


    }
}