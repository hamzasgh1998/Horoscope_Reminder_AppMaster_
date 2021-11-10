package com.example.reminderapp;

import android.content.Intent;
import android.os.Handler;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {

    private static final long SPLASH_TIMEOUT = 1500;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        imageView=findViewById(R.id.welcomeImage);
        imageView.setImageResource(R.drawable.zodiac_icon);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent  = new Intent(SplashScreen.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_TIMEOUT);

    }
}
