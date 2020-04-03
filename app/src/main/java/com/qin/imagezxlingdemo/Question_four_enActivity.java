package com.qin.imagezxlingdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Question_four_enActivity extends AppCompatActivity implements View.OnClickListener {
    public String rgp4_string="NONE";
    public static String answer_en;
    public CheckBox rgp4_1;
    public CheckBox rgp4_2;
    public CheckBox rgp4_3;
    public CheckBox rgp4_4;
    public CheckBox rgp4_5;
    public CheckBox rgp4_6;
    public CheckBox rgp4_7;
    Button question_four;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_four_en);
        rgp4_1 = (CheckBox) findViewById(R.id.grp4_1_en);
        rgp4_2 = (CheckBox) findViewById(R.id.grp4_2_en);
        rgp4_3 = (CheckBox) findViewById(R.id.grp4_3_en);
        rgp4_4 = (CheckBox) findViewById(R.id.grp4_4_en);
        rgp4_5 = (CheckBox) findViewById(R.id.grp4_5_en);
        rgp4_6 = (CheckBox) findViewById(R.id.grp4_6_en);
        rgp4_7 = (CheckBox) findViewById(R.id.grp4_7_en);
        question_four = (Button)findViewById(R.id.bt_question_four_en);
        question_four.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_question_four_en:
                if(rgp4_1.isChecked()){
                    rgp4_string=rgp4_1.getText().toString();
                }
                if(rgp4_2.isChecked()) {
                    if (rgp4_string=="NONE") {
                        rgp4_string =rgp4_2.getText().toString();
                    }
                    else{
                        rgp4_string = rgp4_string + " and " + rgp4_2.getText().toString();
                    }
                }
                if(rgp4_3.isChecked()){
                    if (rgp4_string=="NONE") {
                        rgp4_string =rgp4_3.getText().toString();
                    }
                    else{
                        rgp4_string = rgp4_string + " and " + rgp4_3.getText().toString();
                    }
                }
                if(rgp4_3.isChecked()){
                    if (rgp4_string=="NONE") {
                        rgp4_string =rgp4_4.getText().toString();
                    }
                    else{
                        rgp4_string = rgp4_string + " and " + rgp4_4.getText().toString();
                    }
                }
                if(rgp4_5.isChecked()){
                    if (rgp4_string=="NONE") {
                        rgp4_string =rgp4_5.getText().toString();
                    }
                    else{
                        rgp4_string = rgp4_string + " and " + rgp4_5.getText().toString();
                    }
                }
                if(rgp4_6.isChecked()){
                    if (rgp4_string=="NONE") {
                        rgp4_string =rgp4_6.getText().toString();
                    }
                    else{
                        rgp4_string = rgp4_string + " and " + rgp4_6.getText().toString();
                    }
                }
                if(rgp4_7.isChecked()){
                    if (rgp4_string=="NONE") {
                        rgp4_string =rgp4_7.getText().toString();
                    }
                    else{
                        rgp4_string = rgp4_string + " and " + rgp4_7.getText().toString();
                    }
                }
                answer_en = rgp4_string;
                if(rgp4_string!="NONE") {
                    Intent intent = new Intent(this, Question_five_enActivity.class);
                    startActivity(intent);
                }
        }
    }
}
