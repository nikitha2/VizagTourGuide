package com.nikitha.android.vizagtourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class LocalFavFragment extends Fragment {
    private static final String LOG_TAG = LocalFavActivity.class.getSimpleName();
    ListView1Adaptor listView1Adaptor;
    Constants constants=new Constants();
    public LocalFavFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View rootView =  inflater.inflate(R.layout.activity_local_fav, container, false);


        ArrayList<ListItemsObjects> listItems=new ArrayList<>();
        listItems=constants.populateDate(LOG_TAG);

        listView1Adaptor = new ListView1Adaptor(getActivity(),  listItems);
        GridView listView = (GridView) rootView.findViewById(R.id.localFavListView);
        // t.setText("abcd");
        listView.setAdapter(listView1Adaptor);
        return rootView;
    }
    @Override
    public void onStop() {
        super.onStop();
        listView1Adaptor.release();
    }
}
