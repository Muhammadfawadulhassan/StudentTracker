package com.example.studenttracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AdminLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);

    }

    public void goToLogin(View v){
        Intent i = new Intent(AdminLogin.this,AdminScreen.class);
        startActivity(i);
        finish();
    }
    public void goToRegistration(View v){
        Intent i = new Intent(AdminLogin.this,StudentRegistration.class);
        startActivity(i);
        finish();
    }



}
