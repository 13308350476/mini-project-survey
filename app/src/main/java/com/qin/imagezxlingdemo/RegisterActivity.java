package com.qin.imagezxlingdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {
    EditText account_re;
    EditText password_re;
    EditText password_re_confirm;
    Button register;
    String password;
    String account;
    String password_confirm;
    String UserInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        account_re = (EditText)findViewById(R.id.et_account_re);
        password_re = (EditText)findViewById(R.id.et_password_re);
        password_re_confirm = (EditText)findViewById(R.id.et_password_re_confirm);
        register = (Button)findViewById(R.id.bt_register_re);
        register.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_register_re:
                account = account_re.getText().toString();
                password = password_re.getText().toString();
                password_confirm = password_re_confirm.getText().toString();
                if(password.equals(password_confirm) && password.length() > 0){
                    UserInfo = account + password;
                    save_file(UserInfo);
                    Toast.makeText(this, "注册成功！", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(this, MainActivity.class);
                    startActivity(intent);
                    break;
                }
                else{
                    Toast.makeText(this, "注册失败！（账号密码已存在或两次输入的密码不同）", Toast.LENGTH_SHORT).show();
                    break;
                }

        }
    }


    private  void save_file(String msg) {
        //I/O
        //get SDcard
        File sdFile = getExternalFilesDir(null);
        File saveData = new File(sdFile, "UserInfo.json");
        File saveData_internal = new File(RegisterActivity.this.getFilesDir(),"UserInfo.json");

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

