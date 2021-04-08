package com.example.try1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button=findViewById(R.id.button);

    }


    public void mianpageactivitiy(View view) {
        Intent intent= new Intent(this, pakistan.class);
        startActivity(intent);
    }

    public void detailAfg(View view) {
        Intent intent= new Intent(this, afghanistan.class);
        startActivity(intent);
    }


    public void detailChina(View view) {
        Intent intent= new Intent(this, china.class);
        startActivity(intent);
    }


    public void detailAmerica(View view) {
        Intent intent= new Intent(this, america.class);
        startActivity(intent);
    }

    public void detailIndia(View view) {
        Intent intent= new Intent(this, india.class);
        startActivity(intent);
    }

    public void detailIran(View view) {
        Intent intent= new Intent(this, iran.class);
        startActivity(intent);
    }

    public void detailMalaysia(View view) {
        Intent intent= new Intent(this, malaysia.class);
        startActivity(intent);
    }

    public void detailTurkey(View view) {
        Intent intent= new Intent(this, turkey.class);
        startActivity(intent);
    }

    public void detailSaudi(View view) {
        Intent intent= new Intent(this, saudiArabia.class);
        startActivity(intent);
    }

    public void detailRussia(View view) {
        Intent intent= new Intent(this, russia.class);
        startActivity(intent);
    }

    public void detailPakistan(View view) {
        Intent intent= new Intent(this, pakistan.class);
        startActivity(intent);
    }

    public void letsFirst(View view) {
        Intent intent= new Intent(this, pakistan.class);
        startActivity(intent);
    }
}