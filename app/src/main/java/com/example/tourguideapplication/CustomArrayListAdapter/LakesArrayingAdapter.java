package com.example.tourguideapplication.CustomArrayListAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tourguideapplication.CustomArrayList.LakesCustom;
import com.example.tourguideapplication.R;

import java.util.ArrayList;

public class LakesArrayingAdapter extends ArrayAdapter<LakesCustom> {
    Context context;
    ArrayList<LakesCustom> lakes;

    public LakesArrayingAdapter(Context context, ArrayList<LakesCustom> lakes) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, R.layout.list, lakes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list, parent, false);
        }

        LakesCustom current_lake = getItem(position);

        TextView songTextView = (TextView) listItemView.findViewById(R.id.textView_1);
        songTextView.setText(current_lake.getLake_Name());


        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.textView_2);
        descriptionTextView.setText(current_lake.getLake_Description());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.imageView);
        iconView.setImageResource(current_lake.getLake_Picture_Id());

        return listItemView;
    }
}