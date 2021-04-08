package com.example.try1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class videoPakistan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_pakistan);
        VideoView videoView=findViewById(R.id.pakistanVideo);
        videoView.setVideoPath("android.resource://" + getPackageName() + "/"+ R.raw.pakistan );
        MediaController mediaController=new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();

    }

    public void BackToPaki(View view) {
        Intent intent= new Intent(this, pakistan.class);
        startActivity(intent);
    }
}