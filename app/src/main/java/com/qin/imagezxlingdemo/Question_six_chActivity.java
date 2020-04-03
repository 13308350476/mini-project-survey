package com.qin.imagezxlingdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Question_six_chActivity extends AppCompatActivity implements View.OnClickListener {
    public String rgp6_string="NONE";
    public static String answer_ch="NONE";
    public EditText rgp6_1;
    Button question_six;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_six_ch);
        rgp6_1 = (EditText) findViewById(R.id.grp6_1_ch);
        question_six = (Button)findViewById(R.id.bt_question_six_ch);
        question_six.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_question_six_ch:
                rgp6_string = rgp6_1.getText().toString();
                answer_ch = rgp6_string;
                Intent intent = new Intent(this, Question_seven_chActivity.class);
                startActivity(intent);
        }
    }
}
