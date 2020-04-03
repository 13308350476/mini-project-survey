package com.qin.imagezxlingdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Question_seven_chActivity extends AppCompatActivity implements View.OnClickListener {
    public String rgp7_string="NONE";
    public static String answer_ch="NONE";
    public RadioButton rgp7_1;
    public RadioButton rgp7_2;
    public RadioButton rgp7_3;
    public RadioButton rgp7_4;
    public RadioButton rgp7_5;
    public RadioButton rgp7_6;
    Button question_seven;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_seven_ch);

        rgp7_1 = (RadioButton) findViewById(R.id.rgp7_1_ch);
        rgp7_2 = (RadioButton) findViewById(R.id.rgp7_2_ch);
        rgp7_3 = (RadioButton) findViewById(R.id.rgp7_3_ch);
        rgp7_4 = (RadioButton) findViewById(R.id.rgp7_4_ch);
        rgp7_5 = (RadioButton) findViewById(R.id.rgp7_5_ch);
        rgp7_6 = (RadioButton) findViewById(R.id.rgp7_6_ch);

        question_seven = (Button)findViewById(R.id.bt_question_seven_ch);
        question_seven.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_question_seven_ch:
                if(rgp7_1.isChecked()){
                    rgp7_string=rgp7_1.getText().toString();
                }
                if(rgp7_2.isChecked()){
                    rgp7_string=rgp7_2.getText().toString();
                }
                if(rgp7_3.isChecked()){
                    rgp7_string=rgp7_3.getText().toString();
                }
                if(rgp7_4.isChecked()){
                    rgp7_string=rgp7_4.getText().toString();
                }
                if(rgp7_5.isChecked()){
                    rgp7_string=rgp7_5.getText().toString();
                }
                if(rgp7_6.isChecked()){
                    rgp7_string=rgp7_6.getText().toString();
                }
                answer_ch = rgp7_string;
                Intent intent = new Intent(this, Question_eight_chActivity.class);
                startActivity(intent);
        }
    }
}
