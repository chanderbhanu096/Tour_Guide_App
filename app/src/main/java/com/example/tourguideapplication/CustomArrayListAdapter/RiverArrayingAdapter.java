package com.example.tourguideapplication.CustomArrayListAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.tourguideapplication.CustomArrayList.RiverCustom;
import com.example.tourguideapplication.R;

import java.util.ArrayList;

public class RiverArrayingAdapter extends ArrayAdapter<RiverCustom> {

    public RiverArrayingAdapter(Context context, ArrayList<RiverCustom> rivers) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, R.layout.list, rivers);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list, parent, false);
        }

        RiverCustom current_river = getItem(position);

        TextView songTextView = (TextView) listItemView.findViewById(R.id.textView_1);
        songTextView.setText(current_river.getRiver_Name());


        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.textView_2);
        descriptionTextView.setText(current_river.getRiver_Description());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.imageView);
        iconView.setImageResource(current_river.getRiver_Picture_Id());

        return listItemView;
    }
}
