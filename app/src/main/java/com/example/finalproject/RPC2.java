package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class RPC2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rpc2);
        Intent intent = getIntent();
        TextView userName = findViewById(R.id.textView);
        String user = intent.getStringExtra("Username");
        if (!user.equals("")) {
            userName.setText("Hello! " + user);
        } else {
            userName.setText("Player");
        }
        ImageView rockPaperScissors = findViewById(R.id.imageRock);
        rockPaperScissors.setBackgroundResource(R.drawable.animation);
        AnimationDrawable rockPaper = (AnimationDrawable) rockPaperScissors.getDrawable();
        rockPaper.start();
    }
}
