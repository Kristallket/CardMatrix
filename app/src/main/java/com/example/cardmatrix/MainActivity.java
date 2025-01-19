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
    ImageView plita3;
    ImageView plita4;
    ImageView plita5;
    ImageView plita6;
    ImageView plita7;
    ImageView plita8;
    ImageView plita9;
    ImageView plita10;
    ImageView plita11;
    ImageView plita12;


    Button top;
    Button right;
    Button bottom;
    Button left;


    int[][] matrix = new int[12][2];
    int i = 1;
    int panel;
    int x = 0;
    int y = 0;

    public void matrix(int cordx, int cordy, int butt){
        ImageView Image;
        Image = findViewById(R.id.plita);
        for (int y = 0; y < 2; y += 1){
            for (int x = 0; x < 12; x += 1){
                matrix[x][y] = i;
                i += 1;
            }
        }
        try {
            switch (butt) {
                case 1:
                    panel = matrix[cordx][cordy - 1];
                    y -= 1;
                    break;
                case 2:
                    panel = matrix[cordx + 1][cordy];
                    x += 1;
                    break;
                case 3:
                    panel = matrix[cordx][cordy + 1];
                    y += 1;
                    break;
                case 4:
                    panel = matrix[cordx - 1][cordy];
                    x -= 1;
                    break;
                default:
            }
        }catch (IndexOutOfBoundsException matrix){
            panel = 1;
            x = 0;
            y = 0;
        }
        switch (panel){
            case 1:
                Image = findViewById(R.id.plita);
                break;
            case 2:
                Image = findViewById(R.id.plita2);
                break;
            case 3:
                Image = findViewById(R.id.plita3);
                break;
            case 4:
                Image = findViewById(R.id.plita4);
                break;
            case 5:
                Image = findViewById(R.id.plita5);
                break;
            case 6:
                Image = findViewById(R.id.plita6);
                break;
            case 7:
                Image = findViewById(R.id.plita7);
                break;
            case 8:
                Image = findViewById(R.id.plita8);
                break;
            case 9:
                Image = findViewById(R.id.plita9);
                break;
            case 10:
                Image = findViewById(R.id.plita10);
                break;
            case 11:
                Image = findViewById(R.id.plita11);
                break;
            case 12:
                Image = findViewById(R.id.plita12);
                break;
            default:
                Image = findViewById(R.id.plita);
                x = 0;
                y = 0;
        }
        you.layout(Image.getLeft(),Image.getTop(),Image.getRight(),Image.getBottom());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        top = findViewById(R.id.up);
        right = findViewById(R.id.right);
        bottom = findViewById(R.id.dwn);
        left = findViewById(R.id.left);

        you = findViewById(R.id.you);

        plita1 = findViewById(R.id.plita);
        plita2 = findViewById(R.id.plita2);
        plita3 = findViewById(R.id.plita3);
        plita4 = findViewById(R.id.plita4);
        plita5 = findViewById(R.id.plita5);
        plita6 = findViewById(R.id.plita6);
        plita7 = findViewById(R.id.plita7);
        plita8 = findViewById(R.id.plita8);
        plita9 = findViewById(R.id.plita9);
        plita10 = findViewById(R.id.plita10);
        plita11 = findViewById(R.id.plita11);
        plita12 = findViewById(R.id.plita12);


        top.setOnClickListener(v -> matrix(x,y,1));
        right.setOnClickListener(v -> matrix(x,y,2));
        bottom.setOnClickListener(v -> matrix(x,y,3));
        left.setOnClickListener(v -> matrix(x,y,4));
    }
}