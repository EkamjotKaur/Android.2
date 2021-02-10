package com.example.welcometoamritsar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set on click listener event for top attractions
        TextView topAttractionsView =(TextView) findViewById(R.id.topAttractions);
        topAttractionsView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent topAttractionsIntent= new Intent(MainActivity.this,TopAttractions.class);
                startActivity(topAttractionsIntent);
            }
        });

        //set on click listener event for events
        TextView eventsView = (TextView) findViewById(R.id.events);
        eventsView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent eventIntent = new Intent(MainActivity.this,Events.class);
                startActivity(eventIntent);
            }
        });

        //set on click listener for restaurants
        TextView restaurantsView = (TextView) findViewById(R.id.restaurants);
        restaurantsView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent restaurantsIntent = new Intent(MainActivity.this,Restaurants.class);
                startActivity(restaurantsIntent);
            }
        });

        //set on click listener for historical places
        TextView historicalView = (TextView) findViewById(R.id.historicalPlaces);
        historicalView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent historicalIntent = new Intent(MainActivity.this,HistoricalPlaces.class);
                startActivity(historicalIntent);
            }
        });
    }
}