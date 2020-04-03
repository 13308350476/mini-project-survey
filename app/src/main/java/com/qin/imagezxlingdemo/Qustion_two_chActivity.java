package com.qin.imagezxlingdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Qustion_two_chActivity extends AppCompatActivity implements View.OnClickListener {
    public String rgp2_string="NONE";
    public static String answer_ch="NONE";
    public RadioButton rgp2_1;
    public RadioButton rgp2_2;
    public RadioButton rgp2_3;
    public RadioButton rgp2_4;
    public RadioButton rgp2_5;
    Button question_two;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qustion_two_ch);

        rgp2_1 = (RadioButton) findViewById(R.id.rgp2_1_ch);
        rgp2_2 = (RadioButton) findViewById(R.id.rgp2_2_ch);
        rgp2_3 = (RadioButton) findViewById(R.id.rgp2_3_ch);
        rgp2_4 = (RadioButton) findViewById(R.id.rgp2_4_ch);
        rgp2_5 = (RadioButton) findViewById(R.id.rgp2_5_ch);
        question_two = (Button)findViewById(R.id.bt_question_two_ch);
        question_two.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_question_two_ch:
                if (rgp2_1.isChecked()) {
                    rgp2_string = rgp2_1.getText().toString();
                }
                if (rgp2_2.isChecked()) {
                    rgp2_string = rgp2_2.getText().toString();
                }
                if (rgp2_3.isChecked()) {
                    rgp2_string = rgp2_3.getText().toString();
                }
                if (rgp2_4.isChecked()) {
                    rgp2_string = rgp2_4.getText().toString();
                }
                if (rgp2_5.isChecked()) {
                    rgp2_string = rgp2_5.getText().toString();
                }
                answer_ch = rgp2_string;
                Intent intent = new Intent(this, Question_three_chActivity.class);
                startActivity(intent);
        }
    }
}
