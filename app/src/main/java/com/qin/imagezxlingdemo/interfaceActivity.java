package com.qin.imagezxlingdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class interfaceActivity extends AppCompatActivity implements View.OnClickListener {

    public static String language="english";
    Button start_CH;
    Button start_EN;
    Button start_SC;
    Button start_create_SC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interface);
        start_CH = (Button) findViewById(R.id.bt_start_CH);
        start_EN = (Button) findViewById(R.id.bt_start_EN);
        start_SC = (Button) findViewById(R.id.bt_start_SC);
        start_create_SC = (Button) findViewById(R.id.bt_create_SC);
        start_CH.setOnClickListener(this);
        start_EN.setOnClickListener(this);
        start_SC.setOnClickListener(this);
        start_create_SC.setOnClickListener(this);
    }
Intent intent;
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_start_CH:
                language = "chinese";
                intent = new Intent(this, Welcome_chActivity.class);
                startActivity(intent);
                break;
            case R.id.bt_start_EN:
                language = "english";
                intent = new Intent(this, Welcome_enActivity.class);
                startActivity(intent);
                break;
            case R.id.bt_start_SC:
                intent = new Intent(this, SActivity.class);
                startActivity(intent);
                break;
            case R.id.bt_create_SC:
                intent = new Intent(this, CreateQRActivity.class);
                startActivity(intent);
                break;
        }
    }
}
