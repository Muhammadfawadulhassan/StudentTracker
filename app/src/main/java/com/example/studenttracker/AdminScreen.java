package com.example.studenttracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AdminScreen extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_admin_screen);
  }
  public void registrationStudent(View v){
    Intent i = new Intent(AdminScreen.this,StudentRegistration.class);
    startActivity(i);
    finish();
  }
  public void RegistrationTeacher(View v){
    Intent i = new Intent(AdminScreen.this,TeacherRegistration.class);
    startActivity(i);
    finish();
  }
}
