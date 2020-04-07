package com.nikitha.android.vizagtourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class StreetFoodFragment extends Fragment {
    ListView1Adaptor listView1Adaptor;
    Constants constants = new Constants();
    private static final String LOG_TAG = StreetFoodActivity.class.getSimpleName();

    public StreetFoodFragment() {
        super();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_street_food, container, false);

        super.onCreate(savedInstanceState);

        ArrayList<ListItemsObjects> listItems = new ArrayList<>();
        listItems = constants.populateDate(LOG_TAG);
        FragmentActivity a = getActivity();
        TextView t = (TextView) rootView.findViewById(R.id.heading);
        listView1Adaptor = new ListView1Adaptor(getActivity(), listItems);
        GridView listView = (GridView) rootView.findViewById(R.id.streetfoodListView);
        listView.setAdapter(listView1Adaptor);

        Log.v("Integer.toString", Integer.toString(listView1Adaptor.getCount()));

        return rootView;

    }

    @Override
    public void onStop() {
        super.onStop();
        listView1Adaptor.release();
    }
}
