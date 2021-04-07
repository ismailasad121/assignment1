package com.example.try1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class malaysia extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_malaysia);
        button=findViewById(R.id.malaysiaBtn);
    }
    public void backTOMenu(View view) {
        Intent intent= new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

    public void animateMalaysia(View view) {
        ImageView imageView=findViewById(R.id.malaysiaImg);
        imageView.animate().rotation(720).setDuration(4000);
    }

    public void malaysiaBtnNext(View view) {
        Intent intent= new Intent(this,MainActivity2.class);
        startActivity(intent);
    }
}