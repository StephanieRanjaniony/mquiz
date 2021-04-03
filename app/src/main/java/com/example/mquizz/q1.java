package com.example.mquizz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ToggleButton;

public class q1 extends AppCompatActivity {
    private Button btn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q1);
        btn = (Button) findViewById(R.id.btnvalider);


        btn.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                Intent helloworld1 = new Intent(getApplicationContext(), q2.class);
                startActivity(helloworld1);


            }
        });
    }}