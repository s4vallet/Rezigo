package com.rezigo.rezigo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ActivityInformation extends AppCompatActivity implements View.OnClickListener{


    ImageButton buttonInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);


        buttonInfo = (ImageButton) findViewById(R.id.button_info);
        buttonInfo.setBackgroundColor(0xfdfdfd);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_info :
               // startActivityInformation();
                break;
            case R.id.button_home :
               // startHomeActivity();
                finish();
                break;
            case R.id.button_maps:
                finish();
                startActivityMaps();
                break;
            case R.id.button_leave :
                finish();
                startActivityLeave();
                break;
        }
    }

    private void startActivityLeave() {
        Intent intent = new Intent(ActivityInformation.this, ActivityLeave.class);
        startActivity(intent);
    }
    private void startActivityMaps() {
        Intent intent = new Intent(ActivityInformation.this, ActivityMaps.class);
        startActivity(intent);
    }
}
