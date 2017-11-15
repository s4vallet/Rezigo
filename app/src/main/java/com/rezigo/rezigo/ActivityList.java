package com.rezigo.rezigo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
}
