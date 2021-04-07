package com.example.try1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.pakbtn);
    }

    public void pakbtnNext(View view) {
        Intent intent= new Intent(this, india.class);
        startActivity(intent);
    }
    public void backTOMenu(View view) {
        Intent intent= new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

    public void animation(View view) {
        ImageView imageView=findViewById(R.id.imageView);
        //imageView.animate().alpha(0).setDuration(2000);
        //imageView.animate().translationYBy(200).setDuration(2000);
        //imageView.animate().translationXBy(200).setDuration(2000);
        imageView.animate().rotation(720).setDuration(4000);
    }
}