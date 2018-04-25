package com.skrefi.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Restaurants extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);

        final ArrayList<Place> places = new ArrayList<>();

        places.add(new Place(R.drawable.galaxy_restaurant,getString(R.string.r1_name),getString(R.string.r1_link),getString(R.string.r1_descrpition)));
        places.add(new Place(R.drawable.rocca,getString(R.string.r2_name),getString(R.string.r2_link),getString(R.string.r2_descrpition)));

        PlaceAdapter placeAdapter = new PlaceAdapter(this,places);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(placeAdapter);
    }
}
