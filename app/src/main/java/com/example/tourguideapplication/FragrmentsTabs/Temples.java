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
import com.example.tourguideapplication.CustomArrayListAdapter.LakesArrayingAdapter;
import com.example.tourguideapplication.R;

import java.util.ArrayList;

public class Temples extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    ListView listview;

    public Temples() {
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

        ArrayList<LakesCustom> lakes = new ArrayList<LakesCustom>();
        lakes.add( new LakesCustom( getResources().getString( R.string.temple_name1 ), getResources().getString( R.string.temple_description1 ), R.drawable.hidimba_temple_2 ) );
        lakes.add( new LakesCustom( getResources().getString( R.string.temple_name2 ), getResources().getString( R.string.temple_description2 ), R.drawable.mathi_temple_at_chitkul_2 ) );
        lakes.add( new LakesCustom( getResources().getString( R.string.temple_name3 ), getResources().getString( R.string.temple_description3 ), R.drawable.bhimakali_temple ) );
        LakesArrayingAdapter adapter;
        adapter = new LakesArrayingAdapter( getContext(), lakes );
        listview = view.findViewById( R.id.listitem1 );
        listview.setAdapter( adapter );


    }
}
