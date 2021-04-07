package com.example.try1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class turkey extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turkey);
        button=findViewById(R.id.turkeyBtn);
    }
    public void backTOMenu(View view) {
        Intent intent= new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
    public void animateTurkey(View view) {
        ImageView imageView=findViewById(R.id.turkeyImg);
        imageView.animate().rotation(720).setDuration(4000);
    }

    public void turkeyBtnNext(View view) {
        Intent intent= new Intent(this,malaysia.class);
        startActivity(intent);
    }
}