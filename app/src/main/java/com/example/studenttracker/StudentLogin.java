package com.example.studenttracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class StudentLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_login);
    }
    public void goToLogin(View v){
        Intent i = new Intent(StudentLogin.this,StudentScreen.class);
        startActivity(i);
        finish();
    }
}
