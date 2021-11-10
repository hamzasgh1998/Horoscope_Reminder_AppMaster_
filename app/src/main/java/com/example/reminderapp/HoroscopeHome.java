package com.example.reminderapp;

import android.content.Intent;
import android.os.Bundle;

import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;


public class HoroscopeHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button taureau,capricorne,cancer,vierge,belier,scorpion,sagittaire,lion,balance,gemeaux,verseau,poissons;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horoscope_home);






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
        taureau=findViewById(R.id.taureau);
        capricorne=findViewById(R.id.capricorne);
        cancer=findViewById(R.id.cancer);
        vierge=findViewById(R.id.vierge);
        belier=findViewById(R.id.belier);
        scorpion=findViewById(R.id.scorpion);
        sagittaire=findViewById(R.id.sagittaire);
        lion=findViewById(R.id.lion);
        balance=findViewById(R.id.balance);
        gemeaux=findViewById(R.id.gemeaux);
        verseau=findViewById(R.id.verseau);
        poissons=findViewById(R.id.poissons);




        taureau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(HoroscopeHome.this,TaureauHome.class));

            }
        });

        capricorne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(HoroscopeHome.this,CapricorneHome.class));

            }
        });
        cancer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(HoroscopeHome.this,CancerHome.class));

            }
        });
        vierge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(HoroscopeHome.this,ViergeHome.class));

            }
        });
        belier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(HoroscopeHome.this,BelierHome.class));

            }
        });
        scorpion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(HoroscopeHome.this,ScorpionHome.class));

            }
        });
        sagittaire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(HoroscopeHome.this,SagittaireHome.class));

            }
        });
        lion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(HoroscopeHome.this,LionHome.class));

            }
        });
        balance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(HoroscopeHome.this,BalanceHome.class));

            }
        });
        gemeaux.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(HoroscopeHome.this,GemeauxHome.class));

            }
        });
        verseau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(HoroscopeHome.this,VerseauHome.class));

            }
        });
        poissons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(HoroscopeHome.this,PoissonHome.class));

            }
        });


    }
}