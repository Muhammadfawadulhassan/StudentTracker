package com.example.studenttracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class StudentScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_screen);
    }
    public void goToLeave(View v){
        Intent i = new Intent(StudentScreen.this,SendLeave.class);
        startActivity(i);
        finish();
    }
    public void AskQuestion(View v){
        Intent i = new Intent(StudentScreen.this,AskQuestion.class);
        startActivity(i);
        finish();
    }
}
