package com.rezigo.rezigo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener{
    Button buttonProposer, buttonChercher;
    ImageButton buttonInfo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        buttonChercher = (Button) findViewById(R.id.button_chercher);
        buttonProposer = (Button) findViewById(R.id.button_proposer);
        buttonInfo = (ImageButton) findViewById(R.id.button_info);
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

    private void startActivityInformation() {
        Intent intent = new  Intent(HomeActivity.this, ActivityInformation.class);
        startActivity(intent);
    }
}
