package com.example.tourguideapplication;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.tourguideapplication.FragrmentsTabs.HikingLocation;
import com.example.tourguideapplication.FragrmentsTabs.Lakes;
import com.example.tourguideapplication.FragrmentsTabs.Rivers;
import com.example.tourguideapplication.FragrmentsTabs.Temples;

public class mypagerAdapter extends FragmentPagerAdapter {
    Context context;
    int tabCount;
    String[] tabTitles;


    public mypagerAdapter(String[] tabTitles, FragmentManager supportFragmentManager, int tabCount) {

        super( supportFragmentManager );
        this.tabTitles = tabTitles;
        this.tabCount = tabCount;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Lakes();
            case 1:
                return new Rivers();
            case 2:
                return new Temples();
            case 3:
                return new HikingLocation();

            default:
                return new Lakes();
        }
    }

    @Override
    public int getCount() {

        return tabTitles.length;
    }
}
