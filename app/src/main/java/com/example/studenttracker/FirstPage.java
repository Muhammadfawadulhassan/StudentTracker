package com.example.studenttracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstPage extends AppCompatActivity {
    Button btnAdmin,btnStudent,btnTeacher,btnParent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);
        btnAdmin =(Button) findViewById(R.id.btnAdmin);
        btnTeacher =(Button) findViewById(R.id.btnTeacher);
        btnParent =(Button) findViewById(R.id.btnParent);
        btnStudent =(Button) findViewById(R.id.btnStudent);


        btnAdmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent adminIntent = new Intent(FirstPage.this,AdminLogin.class);
                FirstPage.this.startActivity(adminIntent);

            }
        });
        btnStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent studentIntent = new Intent(FirstPage.this,StudentLogin.class);
                FirstPage.this.startActivity(studentIntent);

            }
        });
        btnParent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent parentIntent = new Intent(FirstPage.this,ParentLogin.class);
                FirstPage.this.startActivity(parentIntent);

            }
        });
        btnTeacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent teacherIntent = new Intent(FirstPage.this,TeacherLogin.class);
                FirstPage.this.startActivity(teacherIntent);

            }
        });
    }
}


