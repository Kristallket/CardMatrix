package com.example.cardmatrix;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageView box;
    ImageView plita1;
    ImageView plita2;

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        box = findViewById(R.id.imageView4);
        plita1 = findViewById(R.id.plita);
        plita2 = findViewById(R.id.plita2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                box.layout(plita2.getLeft(),plita2.getTop(),plita2.getRight(),plita2.getBottom());
            }
        });
    }
}