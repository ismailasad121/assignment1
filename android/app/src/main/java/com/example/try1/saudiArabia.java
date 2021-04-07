package com.example.try1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class saudiArabia extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saudi_arabia);
        button = findViewById(R.id.saudiBtn);
    }
    public void backTOMenu(View view) {
        Intent intent= new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
    public void saudiBtnNext(View view) {
        Intent intent= new Intent(this,turkey.class);
        startActivity(intent);
    }

    public void animateSaudi(View view) {
        ImageView imageView=findViewById(R.id.saudiImg);
        imageView.animate().rotation(720).setDuration(4000);
    }
}