package com.rezigo.rezigo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActivityChercher extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chercher);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button_rechercher :
                startActivityList();
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
            case R.id.button_home :
                finish();
                break;
        }
    }
    private void startActivityMaps() {
        Intent intent = new Intent(ActivityChercher.this, ActivityMaps.class);
        startActivity(intent);
    }

    private void startActivityLeave() {
        Intent intent = new Intent(ActivityChercher.this, ActivityLeave.class);
        startActivity(intent);
    }
    private void startActivityInformation() {
        Intent intent = new  Intent(ActivityChercher.this, ActivityInformation.class);
        startActivity(intent);
    }
    private void startActivityList() {
        Intent intent = new  Intent(ActivityChercher.this, ActivityList.class);
        startActivity(intent);
    }
}
