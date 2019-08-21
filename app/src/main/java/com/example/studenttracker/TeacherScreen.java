package com.example.studenttracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TeacherScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_screen);
    }
    public void AssignmentMarks(View v){
        Intent i = new Intent(TeacherScreen.this,UploadAssignmentMarks.class);
        startActivity(i);
        finish();
    }
    public void QuizUpload(View v){
        Intent i = new Intent(TeacherScreen.this,QuizMarksUpload.class);
        startActivity(i);
        finish();
    }
}
