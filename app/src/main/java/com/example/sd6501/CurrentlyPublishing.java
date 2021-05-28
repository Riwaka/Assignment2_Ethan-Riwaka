package com.example.sd6501;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class CurrentlyPublishing extends Fragment {


    ListView listView;

    public CurrentlyPublishing() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_currently_publishing, container, false);



        listView = (ListView) v.findViewById(R.id.currentlyPublishingList);

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Berserk");
        arrayList.add("8");
        arrayList.add("7");
        arrayList.add("6");
        arrayList.add("5");
        arrayList.add("4");
        arrayList.add("3");
        arrayList.add("2");
        arrayList.add("1");
        arrayList.add("9");
        arrayList.add("8");
        arrayList.add("7");
        arrayList.add("6");
        arrayList.add("5");
        arrayList.add("4");
        arrayList.add("3");
        arrayList.add("2");
        arrayList.add("1");

        ArrayAdapter arrayAdapter = new ArrayAdapter(getActivity().getBaseContext(), android.R.layout.simple_list_item_1, arrayList);
        listView.setAdapter(arrayAdapter);
        return v;
    }
}