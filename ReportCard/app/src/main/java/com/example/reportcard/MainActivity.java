package com.example.reportcard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView class1 =(TextView)findViewById(R.id.class1);
        class1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent class1_intent =new Intent(MainActivity.this,class1.class);
                startActivity(class1_intent);
            }
        });
        TextView class2 =(TextView)findViewById(R.id.class2);
        class2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent class2_intent= new Intent(MainActivity.this,class2.class);
                startActivity(class2_intent);
            }
        });
        TextView class3 =(TextView)findViewById(R.id.class3);
        class3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent class3_intent= new Intent(MainActivity.this,class3.class);
                startActivity(class3_intent);
            }
        });
        TextView class4= (TextView)findViewById(R.id.class4);
        class4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent class4_intent = new Intent(MainActivity.this,class4.class);
                startActivity(class4_intent);
            }
        });
        TextView class5= (TextView)findViewById(R.id.class5);
        class5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent class5_intent = new Intent(MainActivity.this,class5.class);
                startActivity(class5_intent);
            }
        });
    }
}