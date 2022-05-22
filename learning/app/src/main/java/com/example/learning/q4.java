package com.example.learning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class q4 extends AppCompatActivity {
    Button btn5,btn6,btn7,btn8;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q4);
        btn5=(Button)findViewById(R.id.btn30);
        btn6=(Button)findViewById(R.id.btn31);
        btn7=(Button)findViewById(R.id.btn32);
        btn8=(Button)findViewById(R.id.btn33);
        txt=(TextView) findViewById(R.id.txt2);

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


                btn7.setBackgroundColor(Color.GREEN);
                txt.setTextColor(Color.GREEN);
                txt.setText("Correct");
                Intent intent= new Intent(q4.this,q5.class);
                startActivity(intent);

            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn6.setBackgroundColor(Color.BLACK);
                btn7.setBackgroundColor(Color.BLACK);
                btn5.setBackgroundColor(Color.BLACK);
                txt.setText("");
                btn8.setBackgroundColor(Color.RED);
                txt.setTextColor(Color.RED);
                txt.setText("Wrong");
            }
        });

    }
}