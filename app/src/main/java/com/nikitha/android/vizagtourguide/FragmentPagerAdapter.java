package com.nikitha.android.vizagtourguide;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

class FragmentPagerAdapter1 extends FragmentStatePagerAdapter {
    public FragmentPagerAdapter1(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new StreetFoodFragment();
        } else if (position == 1){
            return new CoffeeShopsFragment();
        } else if (position == 2){
            return new HistoricPlacesFragment();
        }else if (position == 3){
            return new LocalFavFragment();
        }else {
            return new MapFragment();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }
}
