package com.example.try1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class india extends AppCompatActivity {
    Button button ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_india);
        button=findViewById(R.id.indBtn);

    }


    public void indbtnNext(View view) {
        Intent intent= new Intent(this, afghanistan.class);
        startActivity(intent);
    }

    public void animateIndia(View view) {
        ImageView imageView=findViewById(R.id.imageView2);
        imageView.animate().rotation(720).setDuration(2000);
    }
}