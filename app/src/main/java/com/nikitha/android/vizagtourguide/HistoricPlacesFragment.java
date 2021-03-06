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
public class HistoricPlacesFragment extends Fragment {
    private static final String LOG_TAG = HistoricPlacesActivity.class.getSimpleName();
    ListView1Adaptor listView1Adaptor;
    Constants constants = new Constants();

    public HistoricPlacesFragment() {
        super();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_historic_places, container, false);

        super.onCreate(savedInstanceState);
        ArrayList<ListItemsObjects> listItems = new ArrayList<>();
        listItems = constants.populateDate(LOG_TAG);

        listView1Adaptor = new ListView1Adaptor(getActivity(), listItems);
        GridView listView = (GridView) rootView.findViewById(R.id.historicalPlacesListView);
        listView.setAdapter(listView1Adaptor);
        return rootView;
    }

    @Override
    public void onStop() {
        super.onStop();
        listView1Adaptor.release();
    }
}
