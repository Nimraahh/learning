package com.example.learning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class display extends AppCompatActivity {
    ImageView im;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        ImageView im=(ImageView)findViewById(R.id.img);
        text=(TextView)findViewById(R.id.textView4);
        Bundle bundle=getIntent().getExtras();
        if(bundle!=null)
        {
            String str=bundle.getString("strName");
            int img=bundle.getInt("img");
            im.setImageResource(img);
            text.setText(str);
        }
    }
}