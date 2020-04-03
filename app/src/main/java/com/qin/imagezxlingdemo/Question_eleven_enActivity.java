package com.qin.imagezxlingdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Question_eleven_enActivity extends AppCompatActivity implements View.OnClickListener {
    public String rgp11_string="NONE";
    public static String answer_en="NONE";
    public RadioButton rgp11_1;
    public RadioButton rgp11_2;
    Button question_eleven;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_eleven_en);
        rgp11_1 = (RadioButton) findViewById(R.id.rgp11_1_en);
        rgp11_2 = (RadioButton) findViewById(R.id.rgp11_2_en);

        question_eleven = (Button)findViewById(R.id.bt_question_eleven_en);
        question_eleven.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_question_eleven_en:
                if (rgp11_1.isChecked()) {
                    rgp11_string = rgp11_1.getText().toString();
                }
                if (rgp11_2.isChecked()) {
                    rgp11_string = rgp11_2.getText().toString();
                }
                answer_en = rgp11_string;
                Intent intent = new Intent(this, Question_twelve_enActivity.class);
                startActivity(intent);
        }
    }
}
