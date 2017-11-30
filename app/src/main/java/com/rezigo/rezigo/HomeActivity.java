package com.rezigo.rezigo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import com.google.firebase.auth.*;
import com.rezigo.Firebase.Database;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener{

    ImageButton buttonHome;
    private FirebaseAuth mAuth;
    Database database;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        mAuth = FirebaseAuth.getInstance();


        buttonHome = (ImageButton) findViewById(R.id.button_home);
        buttonHome.setBackgroundColor(0xfdfdfd);


    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button_chercher :
                startActivityChercher();
                break;
            case R.id.button_proposer :
                startActivityProposer();
                break;
            case R.id.button_info :
                startActivityInformation();
                break;
            case R.id.button_maps:
                startActivityMaps();
                break;
            case R.id.button_leave:
                startActivityLeave();
                break;

            case R.id.button_profil :
                startActivityProfil();
                break;
        }
    }

    private void startActivityProposer() {
        Intent intent = new Intent(HomeActivity.this, ActivityProposer.class);
        startActivity(intent);
    }

    private void startActivityChercher() {
        Intent intent = new  Intent(HomeActivity.this, ActivityChercher.class);
        startActivity(intent);
    }
    private void startActivityMaps() {
        Intent intent = new Intent(HomeActivity.this, ActivityMaps.class);
        startActivity(intent);
    }

    private void startActivityLeave() {
        Intent intent = new Intent(HomeActivity.this, ActivityLeave.class);
        startActivity(intent);
    }
    private void startActivityInformation() {
        Intent intent = new  Intent(HomeActivity.this, ActivityInformation.class);
        startActivity(intent);
    }
    private void startActivityProfil() {
        Intent intent = new  Intent(HomeActivity.this, ActivityProfil.class);
        startActivity(intent);
    }
}
