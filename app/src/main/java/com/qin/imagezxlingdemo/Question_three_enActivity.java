package com.qin.imagezxlingdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Question_three_enActivity extends AppCompatActivity implements View.OnClickListener {
    public String rgp3_string="NONE";
    public static String answer_en="NONE";
    public RadioButton rgp3_1;
    public RadioButton rgp3_2;
    public RadioButton rgp3_3;
    public RadioButton rgp3_4;
    Button question_three;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_three_en);
        rgp3_1 = (RadioButton) findViewById(R.id.rgp3_1_en);
        rgp3_2 = (RadioButton) findViewById(R.id.rgp3_2_en);
        rgp3_3 = (RadioButton) findViewById(R.id.rgp3_3_en);
        rgp3_4 = (RadioButton) findViewById(R.id.rgp3_4_en);
        question_three = (Button)findViewById(R.id.bt_question_three_en);
        question_three.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_question_three_en:
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
                answer_en = rgp3_string;
                Intent intent = new Intent(this, Question_four_enActivity.class);
                startActivity(intent);

        }
    }
}
