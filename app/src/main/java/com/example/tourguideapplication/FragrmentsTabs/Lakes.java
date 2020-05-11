package com.example.tourguideapplication.FragrmentsTabs;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.tourguideapplication.CustomArrayList.LakesCustom;
import com.example.tourguideapplication.CustomArrayListAdapter.LakesArrayingAdapter;
import com.example.tourguideapplication.R;

import java.util.ArrayList;


public class Lakes extends Fragment {

    ListView listview;

    public Lakes() {
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
        lakes.add( new LakesCustom( getResources().getString( R.string.lake_name1 ), getResources().getString( R.string.lake_description1 ), R.drawable.prashar_lake ) );
        lakes.add( new LakesCustom( getResources().getString( R.string.lake_name2 ), getResources().getString( R.string.lake_description2 ), R.drawable.serolsar_lake ) );
        lakes.add( new LakesCustom( getResources().getString( R.string.lake_name3 ), getResources().getString( R.string.lake_description3 ), R.drawable.chandratal_lake ) );
        lakes.add( new LakesCustom( getResources().getString( R.string.lake_name4 ), getResources().getString( R.string.lake_description4 ), R.drawable.bhrigu_lake ) );
        LakesArrayingAdapter adapter;
        adapter = new LakesArrayingAdapter( getContext(), lakes );
        listview = view.findViewById( R.id.listitem1 );
        listview.setAdapter( adapter );


    }
}
