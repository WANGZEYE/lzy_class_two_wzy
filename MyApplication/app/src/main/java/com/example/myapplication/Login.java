package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        editText = (EditText)findViewById(R.id.zhanghao);
        //当点击登录按钮的时候
        Button login = (Button)findViewById(R.id.denglu);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //对所有的按钮进行监听
                switch (v.getId()){
                    //如果点击的是登录按钮
                    case R.id.denglu:
                        //获取账号
                        String username = editText.getText().toString();
                        //对账号的值进行判断
                        if(username.equals("database")){
                            //提示
                            Toast.makeText(Login.this,"账号验证通过",Toast.LENGTH_SHORT).show();
                            //显式跳转
                            Intent i = new Intent(Login.this,T.class);
                            startActivity(i);
                        }else{
                            Toast.makeText(Login.this, "账号密码不对！", Toast.LENGTH_SHORT).show();
                        }

                        break;
                }
            }
        });
    }
}
