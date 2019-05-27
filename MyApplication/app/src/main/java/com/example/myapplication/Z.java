package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Z extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.z);
        Button b = (Button) findViewById(R.id.zhuce1);
        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.zhuce1:
                Intent i = new Intent(Z.this,Login.class);
                startActivity(i);
                Toast.makeText(Z.this,"账号注册成功",Toast.LENGTH_LONG).show();
                break;
        }
    }
}
