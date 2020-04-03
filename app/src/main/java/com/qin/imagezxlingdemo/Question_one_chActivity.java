package com.qin.imagezxlingdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Question_one_chActivity extends AppCompatActivity implements View.OnClickListener {
    public static String answer_ch="NONE";
    public String rgp1_string ="NONE";
    public RadioButton rgp1_1;
    public RadioButton rgp1_2;
    public RadioButton rgp1_3;
    public RadioButton rgp1_4;
    public RadioButton rgp1_5;
    public RadioButton rgp1_6;
    public RadioButton rgp1_7;
    Button question_one;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_one_ch);

        rgp1_1 = (RadioButton) findViewById(R.id.rgp1_1_ch);
        rgp1_2 = (RadioButton) findViewById(R.id.rgp1_2_ch);
        rgp1_3 = (RadioButton) findViewById(R.id.rgp1_3_ch);
        rgp1_4 = (RadioButton) findViewById(R.id.rgp1_4_ch);
        rgp1_5 = (RadioButton) findViewById(R.id.rgp1_5_ch);
        rgp1_6 = (RadioButton) findViewById(R.id.rgp1_6_ch);
        rgp1_7 = (RadioButton) findViewById(R.id.rgp1_7_ch);
        question_one = (Button)findViewById(R.id.bt_question_one_ch);
        question_one.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_question_one_ch:
                if (rgp1_1.isChecked()) {
                    rgp1_string = rgp1_1.getText().toString();
                }
                if (rgp1_2.isChecked()) {
                    rgp1_string = rgp1_2.getText().toString();
                }
                if (rgp1_3.isChecked()) {
                    rgp1_string = rgp1_3.getText().toString();
                }
                if (rgp1_4.isChecked()) {
                    rgp1_string = rgp1_4.getText().toString();
                }
                if (rgp1_5.isChecked()) {
                    rgp1_string = rgp1_5.getText().toString();
                }
                if (rgp1_6.isChecked()) {
                    rgp1_string = rgp1_6.getText().toString();
                }
                if (rgp1_7.isChecked()) {
                    rgp1_string = rgp1_7.getText().toString();
                }
                answer_ch = rgp1_string;

                Intent intent = new Intent(this,Qustion_two_chActivity.class);
                startActivity(intent);
        }
    }
}
