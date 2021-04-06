package com.example.try1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class america extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_america);
        button=findViewById(R.id.button3);
    }

    public void animateAmerica(View view) {
        ImageView imageView=findViewById(R.id.imageView6);
        imageView.animate().rotation(720).setDuration(4000);
    }

    public void btnAmericaNext(View view) {
        Intent intent=new Intent(this,russia.class);
        startActivity(intent);
    }
}