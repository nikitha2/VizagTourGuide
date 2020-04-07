/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.nikitha.android.vizagtourguide;

import android.content.Context;
import android.util.Log;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import static java.lang.String.valueOf;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {
    Context context;

    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public SimpleFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new StreetFoodFragment();
        } else if (position == 1) {
            return new CoffeeShopsFragment();
        } else if (position == 2) {
            return new HistoricPlacesFragment();
        } else if (position == 3) {
            return new LocalFavFragment();
        } else {
            return new MapFragment();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            String s = context.getResources().getString(R.string.localSteetfood);
            return s;
        } else if (position == 1) {
            return context.getResources().getString(R.string.cofeeShops);
        } else if (position == 2) {
            return context.getResources().getString(R.string.Places);
        } else if (position == 3) {
            return context.getResources().getString(R.string.placestoVisit);
        } else {
            return context.getResources().getString(R.string.briefHistory);
        }
    }
}
