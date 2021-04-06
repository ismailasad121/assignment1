package com.example.try1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class afghanistan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afghanistan);
    }


    public void animateafghanistan(View view) {
        ImageView imageView=findViewById(R.id.imageView3);
        imageView.animate().rotation(720).setDuration(2000);
    }

}