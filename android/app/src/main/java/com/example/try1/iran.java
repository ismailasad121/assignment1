package com.example.try1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class iran extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iran);
        button=findViewById(R.id.button2);
    }


    public void animateIran(View view) {
        ImageView imageView=findViewById(R.id.imageView2);
        imageView.animate().rotation(720).setDuration(2000);
    }

    public void btnIranNext(View view) {
        Intent intent=new Intent(this,china.class);
        startActivity(intent);
    }
}