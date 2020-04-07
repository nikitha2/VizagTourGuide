package com.nikitha.android.vizagtourguide;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

public class ListView1Adaptor extends ArrayAdapter<ListItemsObjects> {
    private static final String LOG_TAG = ListView1Adaptor.class.getSimpleName();
    Activity contextActivity;
    ListItemsObjects currentItem;
    String url=null;

    public ListView1Adaptor(Activity context, ArrayList<ListItemsObjects> itemsAtPositon) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, itemsAtPositon);
        contextActivity = context;
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        currentItem = getItem(position);

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_items_layout, parent, false);
        }


        TextView textView=(TextView) listItemView.findViewById(R.id.textviewMain);
        textView.setBackgroundResource(currentItem.getImage());
        textView.setText(currentItem.getName());

        TextView textViewText=(TextView) listItemView.findViewById(R.id.textviewText);
        if(currentItem.getText()!=0) {
            textViewText.setText(currentItem.getText());
        }

//        TextView countTextView=(TextView) listItemView.findViewById(R.id.countText);
//        CharSequence c=String.valueOf(getCount());
//        countTextView.setText(c);

        String a = parent.toString();
        String[] parentName = a.split("id/", 2);
        String parentName1 = parentName[1];
        Button menuButton=(Button) listItemView.findViewById(R.id.menu);
            menuButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    url = currentItem.getMenu();
                    if (!url.isEmpty()) {
                        Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse(url));
                        contextActivity.startActivity(i);
                    } else {
                        Toast.makeText(contextActivity, R.string.nomenu, Toast.LENGTH_SHORT).show();
                    }
                }
            });


        Button directionButton=(Button) listItemView.findViewById(R.id.directions);
        if(parentName1.equals("localFavListView}")|| parentName1.equals("historicalPlacesListView}")) {
            ConstraintSet constraintSet = new ConstraintSet();
            ConstraintLayout constraintLayout = listItemView.findViewById(R.id.list_items_Layout);
            constraintSet.clone(constraintLayout);
            constraintSet.connect(R.id.directions,ConstraintSet.RIGHT,R.id.textviewMain,ConstraintSet.RIGHT,0);
            constraintSet.applyTo(constraintLayout);
            menuButton.setVisibility(View.GONE);
        }
        directionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                url = "https://www.google.com/maps/search/?"+currentItem.getMap();
                Uri gmmIntentUri = Uri.parse(url);

                if(!url.isEmpty()) {

                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    mapIntent.setPackage("com.google.android.apps.maps");
                        contextActivity.startActivity(mapIntent);
                }
                else{
                     Toast.makeText(contextActivity, R.string.nodir, Toast.LENGTH_SHORT).show();
                }
         }
        });


        return listItemView;
    }

    public void release(){

    }
}
