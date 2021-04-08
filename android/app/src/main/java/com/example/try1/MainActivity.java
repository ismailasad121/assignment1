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
        button=findViewById(R.id.MainActBtn);
    }


    public void animation(View view) {
        ImageView imageView=findViewById(R.id.bismillahImg);
        imageView.animate().alpha(0).setDuration(3000);

    }

    public void towardMainMenu(View view) {
        Intent intent= new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}