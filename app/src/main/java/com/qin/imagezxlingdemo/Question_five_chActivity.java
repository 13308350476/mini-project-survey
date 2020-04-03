package com.qin.imagezxlingdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Question_five_chActivity extends AppCompatActivity implements View.OnClickListener {
    public String rgp5_string="NONE";
    public static String answer_ch;
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
        setContentView(R.layout.activity_question_five_ch);

        rgp5_1 = (CheckBox) findViewById(R.id.grp5_1_ch);
        rgp5_2 = (CheckBox) findViewById(R.id.grp5_2_ch);
        rgp5_3 = (CheckBox) findViewById(R.id.grp5_3_ch);
        rgp5_4 = (CheckBox) findViewById(R.id.grp5_4_ch);
        rgp5_5 = (CheckBox) findViewById(R.id.grp5_5_ch);
        rgp5_6 = (CheckBox) findViewById(R.id.grp5_6_ch);
        rgp5_7 = (CheckBox) findViewById(R.id.grp5_7_ch);
        question_five = (Button)findViewById(R.id.bt_question_five_ch);
        question_five.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_question_five_ch:
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
                answer_ch = rgp5_string;
                if (rgp5_string != "NONE") {
                    Intent intent = new Intent(this, Question_six_chActivity.class);
                    startActivity(intent);
                }
        }
    }
}
