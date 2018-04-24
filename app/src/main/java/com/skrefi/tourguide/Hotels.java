package com.skrefi.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class Hotels extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);

        ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.drawable.oltenia_hotel,getString(R.string.h1_name),getString(R.string.h1_link),getString(R.string.h1_description)));
    }
}
