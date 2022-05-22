package com.example.learning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class q10 extends AppCompatActivity {
    Button btn5, btn6, btn7, btn8, btn9;
    TextView txt;
    TextView txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q10);
        btn5 = (Button) findViewById(R.id.btn30);
        btn6 = (Button) findViewById(R.id.btn31);
        btn7 = (Button) findViewById(R.id.btn32);
        btn8 = (Button) findViewById(R.id.btn33);
        btn9 = (Button) findViewById(R.id.button5);
        txt = (TextView) findViewById(R.id.txt2);
        txt1 = (TextView) findViewById(R.id.textView6);

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText("");
                btn6.setBackgroundColor(Color.BLACK);
                btn7.setBackgroundColor(Color.BLACK);
                btn8.setBackgroundColor(Color.BLACK);

                btn5.setBackgroundColor(Color.RED);
                txt.setTextColor(Color.RED);
                txt.setText("Wrong");

            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn5.setBackgroundColor(Color.BLACK);
                btn7.setBackgroundColor(Color.BLACK);
                btn8.setBackgroundColor(Color.BLACK);
                txt.setText("");
                btn6.setBackgroundColor(Color.RED);
                txt.setTextColor(Color.RED);
                txt.setText("Wrong");


            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn6.setBackgroundColor(Color.BLACK);
                btn5.setBackgroundColor(Color.BLACK);
                btn8.setBackgroundColor(Color.BLACK);
                txt.setText("");
                btn7.setBackgroundColor(Color.RED);
                txt.setTextColor(Color.RED);
                txt.setText("Wrong");


            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn6.setBackgroundColor(Color.BLACK);
                btn7.setBackgroundColor(Color.BLACK);
                btn5.setBackgroundColor(Color.BLACK);
                txt.setText("");
                btn8.setBackgroundColor(Color.GREEN);
                txt.setTextColor(Color.GREEN);
                txt.setText("Correct");
                txt1.setTextColor(Color.GREEN);
                txt1.setText("Congratulations on finishing your Exam!");
                btn9.getVisibility();
                btn9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(q10.this, MainActivity.class);
                        startActivity(intent);

                    }
                });

            }
        });
    }
}