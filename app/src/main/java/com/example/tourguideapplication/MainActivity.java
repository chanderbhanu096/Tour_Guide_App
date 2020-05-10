package com.example.tourguideapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;


import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    TabLayout tab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tab = findViewById(R.id.tablayout);

        ViewPager viewPager = findViewById(R.id.viewpager);
        mypagerAdapter fragmentPagerAdapter = new mypagerAdapter(this,getSupportFragmentManager(),tab.getTabCount()) ;
        viewPager.setAdapter(fragmentPagerAdapter);

       tab.setupWithViewPager(viewPager);
    }
}
