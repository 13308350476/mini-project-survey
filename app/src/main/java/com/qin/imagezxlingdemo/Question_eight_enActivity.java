package com.qin.imagezxlingdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Question_eight_enActivity extends AppCompatActivity implements View.OnClickListener {
    public String rgp8_string="NONE";
    public static String answer_en="NONE";
    public RadioButton rgp8_1;
    public RadioButton rgp8_2;
    public RadioButton rgp8_3;
    public RadioButton rgp8_4;
    public RadioButton rgp8_5;
    public RadioButton rgp8_6;
    public RadioButton rgp8_7;
    Button question_eight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_eight_en);

        rgp8_1 = (RadioButton) findViewById(R.id.rgp8_1_en);
        rgp8_2 = (RadioButton) findViewById(R.id.rgp8_2_en);
        rgp8_3 = (RadioButton) findViewById(R.id.rgp8_3_en);
        rgp8_4 = (RadioButton) findViewById(R.id.rgp8_4_en);
        rgp8_5 = (RadioButton) findViewById(R.id.rgp8_5_en);
        rgp8_6 = (RadioButton) findViewById(R.id.rgp8_6_en);
        rgp8_7 = (RadioButton) findViewById(R.id.rgp8_7_en);
        question_eight = (Button)findViewById(R.id.bt_question_eight_en);
        question_eight.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_question_eight_en:
                if(rgp8_1.isChecked()){
                    rgp8_string=rgp8_1.getText().toString();
                }
                if(rgp8_2.isChecked()){
                    rgp8_string=rgp8_2.getText().toString();
                }
                if(rgp8_3.isChecked()){
                    rgp8_string=rgp8_3.getText().toString();
                }
                if(rgp8_4.isChecked()){
                    rgp8_string=rgp8_4.getText().toString();
                }
                if(rgp8_5.isChecked()){
                    rgp8_string=rgp8_5.getText().toString();
                }
                if(rgp8_6.isChecked()){
                    rgp8_string=rgp8_6.getText().toString();
                }
                if(rgp8_7.isChecked()){
                    rgp8_string=rgp8_7.getText().toString();
                }
                answer_en = rgp8_string;
                Intent intent = new Intent(this, Question_nine_enActivity.class);
                startActivity(intent);

        }
    }
}
