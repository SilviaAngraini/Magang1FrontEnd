package com.example.asus.kalkulatorsilvia1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText angkasatu,angkadua,angkatiga;
    Button btntambah,btnkurang,btnkali,btnbagi;
    TextView hasil,hasil1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        angkasatu = findViewById(R.id.angkasatu);
        angkadua = findViewById(R.id.angkadua);
        angkatiga = findViewById(R.id.angkatiga);
        btntambah =findViewById(R.id.btntambah);
        btnkurang =findViewById(R.id.btnkurang);
        btnkali =findViewById(R.id.btnkali);
        btnbagi =findViewById(R.id.btnbagi);
        hasil = findViewById(R.id.hasil);
        hasil1=findViewById(R.id.hasil1);

        btntambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((angkasatu.getText().length()>0) && (angkadua.getText().length()>0)&& (angkatiga.getText().length()>0)){
                    double angka1 = Double.parseDouble(angkasatu.getText().toString());
                    double angka2 = Double.parseDouble(angkadua.getText().toString());
                    double angka3 = Double.parseDouble(angkatiga.getText().toString());
                    double result =angka1 + angka2 + angka3;
                    hasil1.setText(Double.toString(result));
                }
                else {
                    Toast toast =Toast.makeText(MainActivity.this,"Mohon masukkan angka",Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
        btnkurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((angkasatu.getText().length()>0) && (angkadua.getText().length()>0)&& (angkatiga.getText().length()>0)){
                    double angka1 = Double.parseDouble(angkasatu.getText().toString());
                    double angka2 = Double.parseDouble(angkadua.getText().toString());
                    double angka3 = Double.parseDouble(angkatiga.getText().toString());
                    double result =angka1 - angka2 - angka3;
                    hasil1.setText(Double.toString(result));
                }
                else {
                    Toast toast =Toast.makeText(MainActivity.this,"Mohon masukkan angka",Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
        btnkali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((angkasatu.getText().length()>0) && (angkadua.getText().length()>0)&& (angkatiga.getText().length()>0)){
                    double angka1 = Double.parseDouble(angkasatu.getText().toString());
                    double angka2 = Double.parseDouble(angkadua.getText().toString());
                    double angka3 = Double.parseDouble(angkatiga.getText().toString());
                    double result =angka1 * angka2 * angka3;
                    hasil1.setText(Double.toString(result));
                }
                else {
                    Toast toast =Toast.makeText(MainActivity.this,"Mohon masukkan angka",Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
        btnbagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((angkasatu.getText().length()>0) && (angkadua.getText().length()>0)&& (angkatiga.getText().length()>0)){
                    double angka1 = Double.parseDouble(angkasatu.getText().toString());
                    double angka2 = Double.parseDouble(angkadua.getText().toString());
                    double angka3 = Double.parseDouble(angkatiga.getText().toString());
                    double result =angka1 / angka2 / angka3;
                    hasil1.setText(Double.toString(result));
                }
                else {
                    Toast toast =Toast.makeText(MainActivity.this,"Mohon masukkan angka",Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
    }
}
