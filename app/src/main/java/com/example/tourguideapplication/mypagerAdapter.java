package com.example.tourguideapplication;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.tourguideapplication.FragrmentsTabs.Lakes;

public class mypagerAdapter extends FragmentPagerAdapter {


    int tabCount;

    public mypagerAdapter(MainActivity mainActivity, FragmentManager supportFragmentManager, int tabCount) {

        super(supportFragmentManager);
        this.tabCount = tabCount;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 1:
                return new Lakes();
            default:
                return new Lakes();
        }
    }

    @Override
    public int getCount() {
        return 1;
    }
}
