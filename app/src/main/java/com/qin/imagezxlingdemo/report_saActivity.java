package com.qin.imagezxlingdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;

public class report_saActivity extends AppCompatActivity implements View.OnClickListener {
    Button update;
    TextView txt_rep;
    String password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);
        Intent i = getIntent();
        password = i.getStringExtra("password");
        txt_rep=findViewById(R.id.txt_rep);
        txt_rep.setText(Show_json.save_data+"\n"+TimeActivity.time1);

        update=(Button)findViewById(R.id.btn_update);
        update.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_update:
                save_file(Show_json.save_data+"\n"+TimeActivity.time1);
                Toast.makeText(this, "updating", Toast.LENGTH_SHORT).show();
        }
    }

    private  void save_file(String msg) {
        //I/O
        //get SDcard
        File sdFile = getExternalFilesDir(null);
        File saveData = new File(sdFile, "AnswerInfo.json");
        File saveData_internal = new File(this.getFilesDir(),"AnswerInfo.json");

        try {
            FileOutputStream fout=new FileOutputStream(saveData);
            FileOutputStream fout_internal=new FileOutputStream(saveData_internal);
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
}
