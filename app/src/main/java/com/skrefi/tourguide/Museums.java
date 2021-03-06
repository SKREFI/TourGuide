package com.skrefi.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Museums extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);

        final ArrayList<Place> places = new ArrayList<>();

        places.add(new Place(R.drawable.muzeu_de_arta,getString(R.string.m1_name),getString(R.string.m1_link),getString(R.string.m1_description)));
        places.add(new Place(R.drawable.muzeu_olteniei,getString(R.string.m2_name),getString(R.string.m2_link),getString(R.string.m2_description)));

        PlaceAdapter placeAdapter = new PlaceAdapter(this,places);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(placeAdapter);
    }
}
