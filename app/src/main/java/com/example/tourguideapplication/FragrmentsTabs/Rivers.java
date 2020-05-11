package com.example.tourguideapplication.FragrmentsTabs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.tourguideapplication.CustomArrayList.LakesCustom;
import com.example.tourguideapplication.CustomArrayList.RiverCustom;
import com.example.tourguideapplication.CustomArrayListAdapter.RiverArrayingAdapter;
import com.example.tourguideapplication.R;

import java.util.ArrayList;

public class Rivers extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    ListView listview;

    public Rivers() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate( R.layout.listview, container, false );
        return rootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated( view, savedInstanceState );

        ArrayList<RiverCustom> rivers = new ArrayList<RiverCustom>();
        rivers.add( new RiverCustom( getResources().getString( R.string.river_name1 ), getResources().getString( R.string.river_description1 ), R.drawable.beas_river ) );
        rivers.add( new RiverCustom( getResources().getString( R.string.river_name2 ), getResources().getString( R.string.river_description2 ), R.drawable.chenab ) );
        rivers.add( new RiverCustom( getResources().getString( R.string.river_name3 ), getResources().getString( R.string.river_description3 ), R.drawable.parvati_river ) );
        rivers.add( new RiverCustom( getResources().getString( R.string.river_name4 ), getResources().getString( R.string.river_description4 ), R.drawable.sutluj ) );
        RiverArrayingAdapter adapter;
        adapter = new RiverArrayingAdapter( getContext(), rivers );
        listview = view.findViewById( R.id.listitem1 );
        listview.setAdapter( adapter );
    }
}