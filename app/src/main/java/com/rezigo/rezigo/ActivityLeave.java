package com.rezigo.rezigo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ActivityLeave extends AppCompatActivity {
    ImageButton buttonLeave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leave);

        buttonLeave = (ImageButton) findViewById(R.id.button_leave);
        buttonLeave.setBackgroundColor(0xfdfdfd);
    }

    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_info :
                finish();
                startActivityInformation();
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
                //finish();
                //startActivityLeave();
                break;
        }
    }

    private void startActivityMaps() {
        Intent intent = new Intent(ActivityLeave.this, ActivityMaps.class);
        startActivity(intent);
    }
    private void startActivityInformation() {
        Intent intent = new Intent(ActivityLeave.this, ActivityInformation.class);
        startActivity(intent);
    }
}
