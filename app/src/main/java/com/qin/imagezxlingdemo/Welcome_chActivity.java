package com.qin.imagezxlingdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Welcome_chActivity extends AppCompatActivity implements View.OnClickListener {
    public RadioButton radioButton;
    Button welcome_ch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_ch);
        radioButton = (RadioButton) findViewById(R.id.rb_welcome_ch);
        welcome_ch = (Button)findViewById(R.id.bt_welcome_ch);
        welcome_ch.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_welcome_ch:
                if (radioButton.isChecked()) {
                    Intent intent = new Intent(this,Question_one_chActivity.class);
                    startActivity(intent);
                }
        }
    }
}
