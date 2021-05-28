package com.example.sd6501;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class MostPopular extends Fragment {

    public MostPopular() {
        // Required empty public constructor
    }

    ListView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_most_popular, container, false);



        listView = (ListView) v.findViewById(R.id.mostPopularList);

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Berserk");
        arrayList.add("JoJo no Kimyou na Bouken Part 7: Steel Ball Run");
        arrayList.add("One Piece");
        arrayList.add("Vagabond");
        arrayList.add("Monster");
        arrayList.add("Fullmetal Alchemist");
        arrayList.add("Oyasumi Punpun");
        arrayList.add("Grand Blue");
        arrayList.add("Slam Dunk");
        arrayList.add("Kingdom");
        arrayList.add("Monogatari Series: First Season");
        arrayList.add("20th Century Boys");
        arrayList.add("Kaguya-sama wa Kokurasetai: Tensai-tachi no Renai Zunousen");
        arrayList.add("Vinland Saga");
        arrayList.add("Ashita no Joe");
        arrayList.add("Haikyuu!!");
        arrayList.add("Youkoso Jitsuryoku Shijou Shugi no Kyoushitsu e: 2-nensei-hen");
        arrayList.add("Monogatari Series: Second Season");
        arrayList.add("GTO");
        arrayList.add("3-gatsu no Lion");

        ArrayAdapter arrayAdapter = new ArrayAdapter(getActivity().getBaseContext(), android.R.layout.simple_list_item_1, arrayList);
        listView.setAdapter(arrayAdapter);
        return v;

    }
}