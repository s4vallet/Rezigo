package com.rezigo.rezigo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ActivityList extends AppCompatActivity {

    ImageButton buttonList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        buttonList = (ImageButton) findViewById(R.id.button_list);
        buttonList.setBackgroundColor(0xfdfdfd);
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
            case R.id.button_list :
                //finish();
                //startActivityList();
                break;
            case R.id.button_leave :
                finish();
                startActivityLeave();
                break;
        }
    }

    private void startActivityLeave() {
        Intent intent = new Intent(ActivityList.this, ActivityLeave.class);
        startActivity(intent);
    }
    private void startActivityInformation() {
        Intent intent = new Intent(ActivityList.this, ActivityInformation.class);
        startActivity(intent);
    }
}

