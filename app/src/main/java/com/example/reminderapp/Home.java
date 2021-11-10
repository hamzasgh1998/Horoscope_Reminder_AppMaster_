package com.example.reminderapp;


import android.content.Intent;
import android.os.Bundle;

import android.view.MenuItem;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;


public class Home extends AppCompatActivity {
TextView tname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);







        BottomNavigationView bottomNavigationView = (BottomNavigationView)findViewById(R.id.navigation);
        bottomNavigationView.setSelectedItemId(R.id.action_profile);
        bottomNavigationView.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.action_profile:
                        startActivity(new Intent(getApplicationContext(),ActivityProfile.class));
                        finish();
                        overridePendingTransition(0,0);
                        return;
                    case R.id.action_reminder:
                        startActivity(new Intent(getApplicationContext(),MainPage.class));
                        finish();
                        overridePendingTransition(0,0);
                        return;
                    case R.id.action_horoscope:
                        startActivity(new Intent(getApplicationContext(),HoroscopeHome.class));
                        finish();
                        overridePendingTransition(0,0);
                        return;
                }
            }
        });


        tname=findViewById(R.id.name);
        String name=getIntent().getStringExtra("name");
        tname.setText(name);
    }
}