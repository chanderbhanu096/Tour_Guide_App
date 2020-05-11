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
        String[] tabTitles = new String[]{getResources().getString(R.string.tab1_name),getResources().getString(R.string.tab2_name),getResources().getString(R.string.tab3_name),getResources().getString(R.string.tab4_name)};
        tab = findViewById(R.id.tablayout);


        ViewPager viewPager = findViewById(R.id.viewpager);
        mypagerAdapter fragmentPagerAdapter = new mypagerAdapter( tabTitles,getSupportFragmentManager(),tab.getTabCount()) ;
        viewPager.setAdapter(fragmentPagerAdapter);

       tab.setupWithViewPager(viewPager);
    }
}
