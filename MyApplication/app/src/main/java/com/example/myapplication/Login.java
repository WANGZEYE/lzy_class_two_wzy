package com.example.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class Login extends AppCompatActivity implements View.OnClickListener {
    private SharedPreferences pref;
    private SharedPreferences.Editor editor;
    private EditText usernameEdit;
    private EditText passwordEdit;
    private Button login;
    private CheckBox rememberPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        Button b = (Button) findViewById(R.id.zhuce);
        b.setOnClickListener(this);
        Button b1 = (Button) findViewById(R.id.denglu);
        b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.zhuce:
                Intent j = new Intent(Login.this, Z.class);
                startActivity(j);
                break;
            case R.id.denglu:
                Intent d = new Intent(Login.this,D.class);
                startActivity(d);
                break;

        }
    }
}
