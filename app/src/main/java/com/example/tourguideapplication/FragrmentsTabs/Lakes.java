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

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Lakes#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Lakes extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    ListView listview;
    private String mParam2;

    public Lakes() {
        // Required empty public constructor
    }



    /**

     */
    // TODO: Rename and change types and number of parameters


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);


        return rootView;

    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ArrayList<LakesCustom> lakes = new ArrayList<LakesCustom>();
        lakes.add(new LakesCustom("Mandi","Prasher Lake",R.drawable.ic_launcher_background));
        LakesArrayingAdapter adapter;
        adapter = new LakesArrayingAdapter(getContext(),lakes);
        listview = view.findViewById(R.id.listitem1);
        listview.setAdapter(adapter);


    }
}
