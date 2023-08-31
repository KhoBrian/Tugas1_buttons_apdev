package com.example.tugas1buttonsapdev;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button button;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button10;
    TextView TextView;
    String savedNumber = ""; // Menyimpan angka yang sudah diklik sebelumnya

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button3);
        TextView = findViewById(R.id.TextView);

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                savedNumber += "1";
                TextView.setText(savedNumber);
            }
        });

        button2 = findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                savedNumber += "2";
                TextView.setText(savedNumber);
            }
        });

        button3 = findViewById(R.id.button3);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                savedNumber += "3";
                TextView.setText(savedNumber);
            }
        });

        button4 = findViewById(R.id.button4);

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                savedNumber += "4";
                TextView.setText(savedNumber);
            }
        });

        button5 = findViewById(R.id.button5);

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                savedNumber += "5";
                TextView.setText(savedNumber);
            }
        });


        button6 = findViewById(R.id.button6);

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                savedNumber += "6";
                TextView.setText(savedNumber);
            }
        });

        button7 = findViewById(R.id.button7);

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                savedNumber += "7";
                TextView.setText(savedNumber);
            }
        });

        button8 = findViewById(R.id.button8);

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                savedNumber += "8";
                TextView.setText(savedNumber);
            }
        });

        button9 = findViewById(R.id.button9);

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                savedNumber += "9";
                TextView.setText(savedNumber);
            }
        });


        button10 = findViewById(R.id.button10);

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                savedNumber += "0";
                TextView.setText(savedNumber);
            }
        });
    }
}