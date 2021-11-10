package com.example.reminderapp;


import android.content.Intent;
import android.os.Bundle;

import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.Random;

public class GemeauxHome extends AppCompatActivity {

    ImageView imageView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gemeaux_home);


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


        imageView=findViewById(R.id.diceImage);
        button=findViewById(R.id.diceButton);

        button.setOnClickListener(view->rollDice());
        rollDice();
    }
    public void rollDice(){
        Random rand=new Random();
        int number=rand.nextInt(6)+1;
        switch (number){
            case 1:
                imageView.setImageResource(R.drawable.gemeaux1);
                break;
            case 2:
                imageView.setImageResource(R.drawable.gemeaux2);
                break;
            case 3:
                imageView.setImageResource(R.drawable.gemeaux3);
                break;
            case 4:
                imageView.setImageResource(R.drawable.gemeaux4);
                break;
            case 5:
                imageView.setImageResource(R.drawable.gemeaux5);
                break;
            default:
                imageView.setImageResource(R.drawable.default4);
                break;
        }

    }
}