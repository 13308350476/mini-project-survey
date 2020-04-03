package com.qin.imagezxlingdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Question_five_enActivity extends AppCompatActivity implements View.OnClickListener {
    public String rgp5_string="NONE";
    public static String answer_en;
    public CheckBox rgp5_1;
    public CheckBox rgp5_2;
    public CheckBox rgp5_3;
    public CheckBox rgp5_4;
    public CheckBox rgp5_5;
    public CheckBox rgp5_6;
    public CheckBox rgp5_7;
    Button question_five;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_five_en);

        rgp5_1 = (CheckBox) findViewById(R.id.grp5_1_en);
        rgp5_2 = (CheckBox) findViewById(R.id.grp5_2_en);
        rgp5_3 = (CheckBox) findViewById(R.id.grp5_3_en);
        rgp5_4 = (CheckBox) findViewById(R.id.grp5_4_en);
        rgp5_5 = (CheckBox) findViewById(R.id.grp5_5_en);
        rgp5_6 = (CheckBox) findViewById(R.id.grp5_6_en);
        rgp5_7 = (CheckBox) findViewById(R.id.grp5_7_en);
        question_five = (Button)findViewById(R.id.bt_question_five_en);
        question_five.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_question_five_en:
                if (rgp5_1.isChecked()) {
                    rgp5_string = rgp5_1.getText().toString();
                }
                if (rgp5_2.isChecked()) {
                    if (rgp5_string == "NONE") {
                        rgp5_string = rgp5_2.getText().toString();
                    } else {
                        rgp5_string = rgp5_string + " and " + rgp5_2.getText().toString();
                    }
                }
                if (rgp5_3.isChecked()) {
                    if (rgp5_string == "NONE") {
                        rgp5_string = rgp5_3.getText().toString();
                    } else {
                        rgp5_string = rgp5_string + " and " + rgp5_3.getText().toString();
                    }
                }
                if (rgp5_4.isChecked()) {
                    if (rgp5_string == "NONE") {
                        rgp5_string = rgp5_4.getText().toString();
                    } else {
                        rgp5_string = rgp5_string + " and " + rgp5_4.getText().toString();
                    }
                }
                if (rgp5_5.isChecked()) {
                    if (rgp5_string == "NONE") {
                        rgp5_string = rgp5_5.getText().toString();
                    } else {
                        rgp5_string = rgp5_string + " and " + rgp5_5.getText().toString();
                    }
                }
                if (rgp5_6.isChecked()) {
                    if (rgp5_string == "NONE") {
                        rgp5_string = rgp5_6.getText().toString();
                    } else {
                        rgp5_string = rgp5_string + " and " + rgp5_6.getText().toString();
                    }
                }
                if (rgp5_7.isChecked()) {
                    if (rgp5_string == "NONE") {
                        rgp5_string = rgp5_7.getText().toString();
                    } else {
                        rgp5_string = rgp5_string + " and " + rgp5_7.getText().toString();
                    }
                }
                answer_en = rgp5_string;
                if (rgp5_string != "NONE") {
                    Intent intent = new Intent(this, Question_six_enActivity.class);
                    startActivity(intent);
                }
        }

    }
}
