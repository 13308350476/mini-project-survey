package com.qin.imagezxlingdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Question_twelve_enActivity extends AppCompatActivity implements View.OnClickListener {
    public String rgp12_string="NONE";
    public static String answer_en="NONE";
    public RadioButton rgp12_1;
    public RadioButton rgp12_2;
    public RadioButton rgp12_3;
    public RadioButton rgp12_4;
    public RadioButton rgp12_5;
    Button question_twelve;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_twelve_en);

        rgp12_1 = (RadioButton) findViewById(R.id.rgp12_1_en);
        rgp12_2 = (RadioButton) findViewById(R.id.rgp12_2_en);
        rgp12_3 = (RadioButton) findViewById(R.id.rgp12_3_en);
        rgp12_4 = (RadioButton) findViewById(R.id.rgp12_4_en);
        rgp12_5 = (RadioButton) findViewById(R.id.rgp12_5_en);

        question_twelve = (Button)findViewById(R.id.bt_question_twelve_en);
        question_twelve.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_question_twelve_en:
                if(rgp12_1.isChecked()){
                    rgp12_string=rgp12_1.getText().toString();
                }
                if(rgp12_2.isChecked()){
                    rgp12_string=rgp12_2.getText().toString();
                }
                if(rgp12_3.isChecked()){
                    rgp12_string=rgp12_3.getText().toString();
                }
                if(rgp12_4.isChecked()){
                    rgp12_string=rgp12_4.getText().toString();
                }
                if(rgp12_5.isChecked()) {
                    rgp12_string = rgp12_5.getText().toString();
                }
                answer_en = rgp12_string;
                Intent intent = new Intent(this, FinishActivity.class);
                startActivity(intent);
        }
    }
}
