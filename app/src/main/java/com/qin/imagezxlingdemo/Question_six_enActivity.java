package com.qin.imagezxlingdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Question_six_enActivity extends AppCompatActivity implements View.OnClickListener {
    public String rgp6_string="NONE";
    public static String answer_en="NONE";
    public EditText rgp6_1;
    Button question_six;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_six_en);
        rgp6_1 = (EditText) findViewById(R.id.grp6_1_en);
        question_six = (Button)findViewById(R.id.bt_question_six_en);
        question_six.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_question_six_en:
                rgp6_string = rgp6_1.getText().toString();
                answer_en = rgp6_string;
                Intent intent = new Intent(this, Question_seven_enActivity.class);
                startActivity(intent);
        }
    }
}
