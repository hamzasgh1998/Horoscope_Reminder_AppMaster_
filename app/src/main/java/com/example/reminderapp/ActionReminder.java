package com.example.reminderapp;




import android.content.Intent;
import android.os.Bundle;

import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;


public class ActionReminder extends AppCompatActivity {
EditText name,date;
Button add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_reminder);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigation);
        bottomNavigationView.setSelectedItemId(R.id.action_profile);
        bottomNavigationView.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_profile:
                        startActivity(new Intent(getApplicationContext(), ActivityProfile.class));
                        finish();
                        overridePendingTransition(0, 0);
                        return;
                    case R.id.action_reminder:
                        startActivity(new Intent(getApplicationContext(), MainPage.class));
                        finish();
                        overridePendingTransition(0, 0);
                        return;
                    case R.id.action_horoscope:
                        startActivity(new Intent(getApplicationContext(), HoroscopeHome.class));
                        finish();
                        overridePendingTransition(0, 0);
                        return;
                }
            }
        });

        name = findViewById(R.id.name);
        date = findViewById(R.id.date);
        add = findViewById(R.id.add);

    }//zedtou enaaaaa

       /*  add.setOnClickListener(new View.OnClickListener(){


           @Override
            public void onClick(View v){
                //Creation d'entité
                RendezVousEntity rdv=new RendezVousEntity();
                rdv.setNameRdv(name.getText().toString());
                rdv.setDateRdv(date.getText().toString());
                if (valideInput(rdv)) {
                    //Operation insertion
                    UserDatabase userDatabase=UserDatabase.getUserDatabase(getApplicationContext());
                    final RdvDao rdvDao=userDatabase.rdvDao();
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            rdvDao.addRdv(rdv);
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    Toast.makeText(getApplicationContext(),"rdv enregistré",Toast.LENGTH_SHORT).show();

                                }
                            });
                        }
                    }).start();
                }
                else{
                    Toast.makeText(getApplicationContext(),"veuillez renseigner les champs!!",Toast.LENGTH_SHORT).show();
                }
            }
        });




    }

    private boolean valideInput(RendezVousEntity rdv)
    {
        if(rdv.getNameRdv().isEmpty())
        {return false;}
        return true;
    }
*/
}