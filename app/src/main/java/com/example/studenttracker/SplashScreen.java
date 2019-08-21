package com.example.studenttracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

public class SplashScreen extends AppCompatActivity {
    final  int Splash_Dispay_time = 1500;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);// hide the title
        getSupportActionBar().hide();// hide title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);// enable full screen
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent splashIntent = new Intent(SplashScreen.this,FirstPage.class);
                SplashScreen.this.startActivity(splashIntent);
                SplashScreen.this.finish();

            }

        },Splash_Dispay_time);


    }
}
