package com.qin.imagezxlingdemo;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;


public class MainActivity extends Activity implements View.OnClickListener {
private Button login;
private Button register;
EditText user;
EditText password;
String UserInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = (EditText)findViewById(R.id.et_account);
        password = (EditText)findViewById(R.id.et_password);

        login=(Button)findViewById(R.id.bt_login);
        register=(Button)findViewById(R.id.bt_register);
        login.setOnClickListener(this);
        register.setOnClickListener(this);
        String PATH=getExternalFilesDir(null)+"/UserInfo.json";
        UserInfo = getFileFromeSD(PATH);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.bt_login:
                String input;
                input = user.getText().toString() + password.getText().toString();
                if(UserInfo.equals(input)) {
                    intent = new Intent(MainActivity.this, interfaceActivity.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(this, "Account password is incorrect!", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.bt_register:
                intent = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(intent);
                break;
        }
    }


    public String getFileFromeSD(String path){
        String result="";
        try{
            FileInputStream f = new FileInputStream(path);
            BufferedReader bis = new BufferedReader(new InputStreamReader(f));
            String line="";
            while((line = bis.readLine())!=null){
                result += line;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
}
