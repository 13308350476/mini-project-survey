package com.qin.imagezxlingdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;

public class FinishActivity extends AppCompatActivity implements View.OnClickListener {
    public TextView answer_1;
    public TextView answer_2;
    public TextView answer_3;
    public TextView answer_4;
    public TextView answer_5;
    public TextView answer_6;
    public TextView answer_7;
    public TextView answer_8;
    public TextView answer_9;
    public TextView answer_10;
    public TextView answer_11;
    public TextView answer_12;
    public Button save;
    public String JSON_data;
    public static String show_json="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);
        answer_1= (TextView) findViewById(R.id.answer_1);
        answer_2= (TextView) findViewById(R.id.answer_2);
        answer_3= (TextView) findViewById(R.id.answer_3);
        answer_4= (TextView) findViewById(R.id.answer_4);
        answer_5= (TextView) findViewById(R.id.answer_5);
        answer_6= (TextView) findViewById(R.id.answer_6);
        answer_7= (TextView) findViewById(R.id.answer_7);
        answer_8= (TextView) findViewById(R.id.answer_8);
        answer_9= (TextView) findViewById(R.id.answer_9);
        answer_10= (TextView) findViewById(R.id.answer_10);
        answer_11= (TextView) findViewById(R.id.answer_11);
        answer_12= (TextView) findViewById(R.id.answer_12);
        save=(Button)findViewById(R.id.bt_save);

        if(interfaceActivity.language.equals("english")){
            answer_1.setText(Question_one_enActivity.answer_en);
            answer_2.setText(Question_two_enActivity.answer_en);
            answer_3.setText(Question_three_enActivity.answer_en);
            answer_4.setText(Question_four_enActivity.answer_en);
            answer_5.setText(Question_five_enActivity.answer_en);
            answer_6.setText(Question_six_enActivity.answer_en);
            answer_7.setText(Question_seven_enActivity.answer_en);
            answer_8.setText(Question_eight_enActivity.answer_en);
            answer_9.setText(Question_nine_enActivity.answer_en);
            answer_10.setText(Question_ten_enActivity.answer_en);
            answer_11.setText(Question_eleven_enActivity.answer_en);
            answer_12.setText(Question_twelve_enActivity.answer_en);

            JSON_data = "{'Question_1':'"+ Question_one_enActivity.answer_en+"','Question_2':'"+ Question_two_enActivity.answer_en+"','Question_3':'"+ Question_three_enActivity.answer_en
                    +"','Question_4':'"+ Question_four_enActivity.answer_en+"','Question_5':'"+ Question_five_enActivity.answer_en+"','Question_6':'"+ Question_six_enActivity.answer_en
                    +"','Question_7':'"+ Question_seven_enActivity.answer_en+"','Question_8':'"+ Question_eight_enActivity.answer_en+"','Question_9':'"+ Question_nine_enActivity.answer_en
                    +"','Question_10':'"+ Question_ten_enActivity.answer_en+"','Question11':'"+ Question_eleven_enActivity.answer_en+"','Question_12':'"+ Question_twelve_enActivity.answer_en+"'}";
            //JSON_data="{'name':'zhan gsan','age':'asdasd'}";
            //Log.v("Log",JSON_data);
        }
        if(interfaceActivity.language.equals("chinese")){
            answer_1.setText(Question_one_chActivity.answer_ch);
            answer_2.setText(Qustion_two_chActivity.answer_ch);
            answer_3.setText(Question_three_chActivity.answer_ch);
            answer_4.setText(Question_four_chActivity.answer_ch);
            answer_5.setText(Question_five_chActivity.answer_ch);
            answer_6.setText(Question_six_chActivity.answer_ch);
            answer_7.setText(Question_seven_chActivity.answer_ch);
            answer_8.setText(Question_eight_chActivity.answer_ch);
            answer_9.setText(Question_nine_chActivity.answer_ch);
            answer_10.setText(Question_ten_chActivity.answer_ch);
            answer_11.setText(Question_eleven_chActivity.answer_ch);
            answer_12.setText(Question_twelve_chActivity.answer_ch);

            JSON_data = "{'Question_1':'"+ Question_one_chActivity.answer_ch+"','Question_2':'"+ Qustion_two_chActivity.answer_ch+"','Question_3':'"+ Question_three_chActivity.answer_ch
                    +"','Question_4':'"+ Question_four_chActivity.answer_ch+"','Question_5':'"+ Question_five_chActivity.answer_ch+"','Question_6':'"+ Question_six_chActivity.answer_ch
                    +"','Question_7':'"+ Question_seven_chActivity.answer_ch+"','Question_8':'"+ Question_eight_chActivity.answer_ch+"','Question_9':'"+ Question_nine_chActivity.answer_ch
                    +"','Question_10':'"+ Question_ten_chActivity.answer_ch+"','Question11':'"+ Question_eleven_chActivity.answer_ch+"','Question_12':'"+ Question_twelve_chActivity.answer_ch+"'}";
            //JSON_data="{'name':'zhan gsan','age':'asdasd'}";
            //Log.v("Log",JSON_data);
        }


        save.setOnClickListener(this);
    }
    private  void save_file(String msg) {
        //I/O
        //get SDcard
        File sdFile = getExternalFilesDir(null);
        File saveData = new File(sdFile, "datasave.json");
        File saveData_internal = new File(this.getFilesDir(),"datasave.json");
        try {
            FileOutputStream fout=new FileOutputStream(saveData,true);
            FileOutputStream fout_internal=new FileOutputStream(saveData_internal,true);
            fout.write(msg.getBytes());
            //Log.v("Log",msg );
            fout.flush();
            fout.close();
            fout_internal.write(msg.getBytes());
            fout_internal.flush();
            fout_internal.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_save:
                Toast.makeText(this,"updating",Toast.LENGTH_SHORT).show();
                save_file(JSON_data);
                Toast.makeText(this,"completed",Toast.LENGTH_SHORT).show();
        }
    }
}
