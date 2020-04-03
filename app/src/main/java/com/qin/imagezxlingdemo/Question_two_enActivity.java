package com.qin.imagezxlingdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Question_two_enActivity extends AppCompatActivity implements View.OnClickListener {
    public String rgp2_string="NONE";
    public static String answer_en="NONE";
    public RadioButton rgp2_1;
    public RadioButton rgp2_2;
    public RadioButton rgp2_3;
    public RadioButton rgp2_4;
    public RadioButton rgp2_5;
    Button question_two_en;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_two_en);
        rgp2_1 = (RadioButton) findViewById(R.id.rgp2_1_en);
        rgp2_2 = (RadioButton) findViewById(R.id.rgp2_2_en);
        rgp2_3 = (RadioButton) findViewById(R.id.rgp2_3_en);
        rgp2_4 = (RadioButton) findViewById(R.id.rgp2_4_en);
        rgp2_5 = (RadioButton) findViewById(R.id.rgp2_5_en);
        question_two_en = (Button)findViewById(R.id.bt_question_two_en);
        question_two_en.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_question_two_en:
                if(rgp2_1.isChecked()){
                rgp2_string=rgp2_1.getText().toString();
                 }
                if(rgp2_2.isChecked()){
                    rgp2_string=rgp2_2.getText().toString();
                }
                if(rgp2_3.isChecked()){
                    rgp2_string=rgp2_3.getText().toString();
                }
                if(rgp2_4.isChecked()){
                    rgp2_string=rgp2_4.getText().toString();
                }
                if(rgp2_5.isChecked()){
                    rgp2_string=rgp2_5.getText().toString();
                }
                answer_en = rgp2_string;
                Intent intent = new Intent(this, Question_three_enActivity.class);
                startActivity(intent);

        }
    }
}
