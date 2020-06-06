package com.example.splash_screen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class Splash_Screen extends AppCompatActivity {

    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash__screen);

        viewPager = findViewById(R.id.viewpager);
        IntroAdapter adapter= new IntroAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
    }
}
