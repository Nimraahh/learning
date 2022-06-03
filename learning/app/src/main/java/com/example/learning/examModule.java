package com.example.learning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class examModule<string> extends AppCompatActivity {
ListView list;
String[] questions={"Question 01","Question 02","Question 03","Question 04","Question 05","Question 06","Question 07","Question 08","Question 09","Question 10"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam_module);
        list=findViewById(R.id.list);
        ArrayAdapter<string> adapter=new ArrayAdapter<string>(examModule.this, android.R.layout.simple_dropdown_item_1line , (string[]) questions);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0) {
                    Intent intent = new Intent(examModule.this, exam.class);
                    startActivity(intent);

                }
                else if(position==1) {
                    Intent intent = new Intent(examModule.this, q2.class);
                    startActivity(intent);

                }
                else if(position==2) {
                    Intent intent = new Intent(examModule.this, q3.class);
                    startActivity(intent);

                }
                else if(position==3) {
                    Intent intent = new Intent(examModule.this, q4.class);
                    startActivity(intent);

                }
                else if(position==4) {
                    Intent intent = new Intent(examModule.this, q5.class);
                    startActivity(intent);

                }
                else if(position==5) {
                    Intent intent = new Intent(examModule.this, q6.class);
                    startActivity(intent);

                }
                else if(position==6) {
                    Intent intent = new Intent(examModule.this, qu7.class);
                    startActivity(intent);

                }
                else if(position==7) {
                    Intent intent = new Intent(examModule.this, que8.class);
                    startActivity(intent);

                }
                else if(position==8) {
                    Intent intent = new Intent(examModule.this, q9.class);
                    startActivity(intent);

                }
                else if(position==9) {
                    Intent intent = new Intent(examModule.this, q10.class);
                    startActivity(intent);

                }
            }
        });
    }
}