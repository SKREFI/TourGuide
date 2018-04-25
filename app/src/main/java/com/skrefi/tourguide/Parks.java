package com.skrefi.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Parks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);

        final ArrayList<Place> places = new ArrayList<>();

        places.add(new Place(R.drawable.romanescu,getString(R.string.p1_name),getString(R.string.p1_link),getString(R.string.p1_description)));
        places.add(new Place(R.drawable.botanica,getString(R.string.p2_name),getString(R.string.p2_link),getString(R.string.h2_description)));

        PlaceAdapter placeAdapter = new PlaceAdapter(this,places);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(placeAdapter);
    }
}
