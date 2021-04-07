package com.example.try1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class afghanistan extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afghanistan);
        button=findViewById(R.id.afgBtn);
    }

    public void backTOMenu(View view) {
        Intent intent= new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
    public void animateafghanistan(View view) {
        ImageView imageView=findViewById(R.id.imageView3);
        imageView.animate().rotation(720).setDuration(4000);
    }

    public void afgBtnNext(View view) {
        Intent intent=new Intent(this,iran.class);
        startActivity(intent);
    }
}