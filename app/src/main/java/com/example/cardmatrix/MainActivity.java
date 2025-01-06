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

    Button right;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        right = findViewById(R.id.right);
        you = findViewById(R.id.you);
        plita1 = findViewById(R.id.plita);
        plita2 = findViewById(R.id.plita2);


        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                you.layout(plita2.getLeft(),plita2.getTop(),plita2.getRight(),plita2.getBottom());
            }
        });
    }
}