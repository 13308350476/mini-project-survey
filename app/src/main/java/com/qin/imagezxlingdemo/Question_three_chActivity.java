package com.qin.imagezxlingdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Question_three_chActivity extends AppCompatActivity implements View.OnClickListener {
    public String rgp3_string="NONE";
    public static String answer_ch="NONE";
    public RadioButton rgp3_1;
    public RadioButton rgp3_2;
    public RadioButton rgp3_3;
    public RadioButton rgp3_4;
    Button question_three;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_three_ch);

        rgp3_1 = (RadioButton) findViewById(R.id.rgp3_1_ch);
        rgp3_2 = (RadioButton) findViewById(R.id.rgp3_2_ch);
        rgp3_3 = (RadioButton) findViewById(R.id.rgp3_3_ch);
        rgp3_4 = (RadioButton) findViewById(R.id.rgp3_4_ch);
        question_three = (Button)findViewById(R.id.bt_question_three_ch);
        question_three.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_question_three_ch:
                if(rgp3_1.isChecked()){
                    rgp3_string=rgp3_1.getText().toString();
                }
                if(rgp3_2.isChecked()){
                    rgp3_string=rgp3_2.getText().toString();
                }
                if(rgp3_3.isChecked()){
                    rgp3_string=rgp3_3.getText().toString();
                }
                if(rgp3_4.isChecked()){
                    rgp3_string=rgp3_4.getText().toString();
                }
                answer_ch = rgp3_string;
                Intent intent = new Intent(this, Question_four_chActivity.class);
                startActivity(intent);

        }
    }
}
