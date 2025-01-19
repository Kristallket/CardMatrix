package com.example.cardmatrix;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageView you;

    ImageView plita1;
    ImageView plita2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        you = findViewById(R.id.you);

        plita1 = findViewById(R.id.plita1);
        plita2 = findViewById(R.id.plita2);

        plita1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                you.layout(plita1.getLeft(),plita1.getTop(),plita1.getRight(),plita1.getBottom());
            }
        });
        plita2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                you.layout(plita2.getLeft(),plita2.getTop(),plita2.getRight(),plita2.getBottom());
            }
        });
    }
}