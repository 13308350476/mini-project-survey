package com.qin.imagezxlingdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Question_ten_chActivity extends AppCompatActivity implements View.OnClickListener {
    public String rgp10_string="NONE";
    public static String answer_ch="NONE";
    public RadioButton rgp10_1;
    public RadioButton rgp10_2;
    public RadioButton rgp10_3;
    public RadioButton rgp10_4;
    Button question_ten;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_ten_ch);

        rgp10_1 = (RadioButton) findViewById(R.id.rgp10_1_ch);
        rgp10_2 = (RadioButton) findViewById(R.id.rgp10_2_ch);
        rgp10_3 = (RadioButton) findViewById(R.id.rgp10_3_ch);
        rgp10_4 = (RadioButton) findViewById(R.id.rgp10_4_ch);

        question_ten = (Button)findViewById(R.id.bt_question_ten_ch);
        question_ten.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_question_ten_ch:
                if (rgp10_1.isChecked()) {
                    rgp10_string = rgp10_1.getText().toString();
                }
                if (rgp10_2.isChecked()) {
                    rgp10_string = rgp10_2.getText().toString();
                }
                if (rgp10_3.isChecked()) {
                    rgp10_string = rgp10_3.getText().toString();
                }
                if (rgp10_4.isChecked()) {
                    rgp10_string = rgp10_4.getText().toString();
                }
                answer_ch = rgp10_string;
                Intent intent = new Intent(this, Question_eleven_chActivity.class);
                startActivity(intent);
        }
    }
}
