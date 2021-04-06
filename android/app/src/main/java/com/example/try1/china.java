package com.example.try1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class china extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_china);
        button=findViewById(R.id.chinaBtn);
    }

    public void animateChina(View view) {
        ImageView imageView=findViewById(R.id.imageView5);
        imageView.animate().rotation(720).setDuration(4000);
    }

    public void btnNextCHina(View view) {
        Intent intent=new Intent(this,america.class);
        startActivity(intent);
    }
}