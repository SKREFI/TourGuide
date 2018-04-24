package com.skrefi.tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Categorys extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorys);

        TextView tvHotels = findViewById(R.id.hotels_textview);
        TextView tvParks = findViewById(R.id.parks_textview);
        TextView tvMuseums = findViewById(R.id.parks_textview);

        tvHotels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Categorys.this,Hotels.class));
            }
        });

        tvParks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Categorys.this,Parks.class));
            }
        });

        tvMuseums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Categorys.this,Museums.class));
            }
        });
    }
}
