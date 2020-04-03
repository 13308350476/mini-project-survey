package com.qin.imagezxlingdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Question_nine_enActivity extends AppCompatActivity implements View.OnClickListener {
    public String rgp9_string="NONE";
    public static String answer_en="NONE";
    public RadioButton rgp9_1;
    public RadioButton rgp9_2;
    public RadioButton rgp9_3;
    public RadioButton rgp9_4;
    Button question_nine;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_nine_en);

        rgp9_1 = (RadioButton) findViewById(R.id.rgp9_1_en);
        rgp9_2 = (RadioButton) findViewById(R.id.rgp9_2_en);
        rgp9_3 = (RadioButton) findViewById(R.id.rgp9_3_en);
        rgp9_4 = (RadioButton) findViewById(R.id.rgp9_4_en);
        question_nine = (Button)findViewById(R.id.bt_question_nine_en);
        question_nine.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_question_nine_en:
                if (rgp9_1.isChecked()) {
                    rgp9_string = rgp9_1.getText().toString();
                }
                if (rgp9_2.isChecked()) {
                    rgp9_string = rgp9_2.getText().toString();
                }
                if (rgp9_3.isChecked()) {
                    rgp9_string = rgp9_3.getText().toString();
                }
                if (rgp9_4.isChecked()) {
                    rgp9_string = rgp9_4.getText().toString();
                }
                answer_en = rgp9_string;
                Intent intent = new Intent(this, Question_ten_enActivity.class);
                startActivity(intent);
        }
    }
}
