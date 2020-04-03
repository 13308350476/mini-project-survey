package com.qin.imagezxlingdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Welcome_enActivity extends AppCompatActivity implements View.OnClickListener {
    public RadioButton radioButton;
    Button welcome_en;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_en);
        radioButton = (RadioButton) findViewById(R.id.rb_welcome_en);
        welcome_en = (Button)findViewById(R.id.bt_welcome_en);
        welcome_en.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_welcome_en:
                if (radioButton.isChecked()) {
                    Intent intent = new Intent(this,Question_one_enActivity.class);
                    startActivity(intent);
                }
        }
    }
}
