package com.example.bismillahsemogakeburu.Adapter;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.bismillahsemogakeburu.Fragment.HistoriPesanan;
import com.example.bismillahsemogakeburu.Fragment.WishlistFragment;

public class PagerTabAdapter extends FragmentPagerAdapter {

    private int numoftabs;

    public PagerTabAdapter(@NonNull FragmentManager fm, int numOfTabs) {
        super(fm);
        this.numoftabs = numOfTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new HistoriPesanan();

            case 1:
                return new WishlistFragment();

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numoftabs;
    }

    @Override
    public int getItemPosition(@NonNull Object object) {
        return POSITION_NONE;
    }
}



