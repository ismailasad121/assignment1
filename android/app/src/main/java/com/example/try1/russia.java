package com.example.try1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class russia extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_russia);
        button=findViewById(R.id.button4);
    }


    public void animateRussia(View view) {
        ImageView imageView=findViewById(R.id.imageView7);
        imageView.animate().rotation(720).setDuration(4000);

    }

    public void btnRussiaNext(View view) {
        Intent intent=new Intent(this,india.class);
        startActivity(intent);
    }
}